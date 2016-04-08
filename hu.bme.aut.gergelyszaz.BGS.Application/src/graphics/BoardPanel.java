package graphics;

import hu.bme.aut.gergelyszaz.BGS.state.FieldState;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;
import hu.bme.aut.gergelyszaz.BGS.state.TokenState;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

class BoardPanel extends JLayeredPane implements ActionListener, IStateReciever {

    ConcurrentHashMap<Integer, JButton> buttons = new ConcurrentHashMap<Integer, JButton>();
    ConcurrentHashMap<JButton, Integer> buttons2 = new ConcurrentHashMap<JButton, Integer>();
    HashSet<JButton> enabledButtons = new HashSet<JButton>();
    int SCALE = 100;
    Hashtable<Integer, TokenState> tokens = new Hashtable<Integer, TokenState>();
    Hashtable<Integer, FieldState> fields = new Hashtable<Integer, FieldState>();
    ColorManager colorManager = new ColorManager();
    JLabel turncountLabel = new JLabel("");
    PlayerInfoPanel playerInfoPanel=null;
    MessageReciever messageReciever;
    Image boardImage=null;

    public BoardPanel(MessageReciever messageReciever) {
        super();

        add(turncountLabel);
        turncountLabel.setBounds(new Rectangle(0, 0, 100, 100));
        this.messageReciever=messageReciever;
        setLayout(null);
    }


    Properties properties;
    public void setGameProperties(Properties properties){
        this.properties=properties;
        try {
            boardImage= ImageIO.read(BoardPanel.class.getResourceAsStream( properties.getProperty("board")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void UpdateGameState(GameState gs) {
        turncountLabel.setText("Turn: " + gs.getTurncount());

        if (buttons.isEmpty()) {
            for (FieldState field : gs.getFields()) {

                JButton btn = new JButton();
                buttons.put(field.id, btn);
                buttons2.put(btn, field.id);
                btn.setUI(new FieldButtonUI(field));
                btn.setOpaque(false);
                btn.setContentAreaFilled(false);
                btn.setBorderPainted(true);

                String[] fp=properties.getProperty(field.name).split("\\,");


                btn.setBounds(new Rectangle());//field.x * SCALE - SCALE / 3, field.y * SCALE - SCALE / 3, SCALE * 2 / 3,                        SCALE * 2 / 3));
                btn.setActionCommand("fieldPressed");
                btn.addActionListener(this);
                btn.setEnabled(false);
                add(btn, new Integer(1));

            }
        }

        HashSet original = new HashSet();
        original.addAll(tokens.keySet());
        HashSet destroyed = new HashSet();
        destroyed.addAll(tokens.keySet());
        HashSet newtokens = new HashSet();
        for (TokenState t : gs.getTokens()) {
            tokens.put(t.id, t);
            newtokens.add(t.id);
        }

        destroyed.removeAll(newtokens);
        newtokens.removeAll(original);

        for (Object d : destroyed) {
            remove(buttons.get(d));
        }
        for (Object n : newtokens) {
            AddToken(tokens.get(n));
            buttons.get(n).setEnabled(false);
        }

        for (FieldState f : gs.getFields()) {
            fields.put(f.id, f);
        }

        for (Object s : gs.getSelectables()) {
            buttons.get(s).setEnabled(true);
            enabledButtons.add(buttons.get(s));
        }

        repaint();
    }


    private void AddToken(TokenState t) {
        JButton button = new JButton();
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setUI(new TokenButtonUI(colorManager, t));
        add(button, new Integer(2));
        button.setActionCommand("tokenPressed");
        button.addActionListener(this);
        buttons.put(t.id, button);
        buttons2.put(button, t.id);
        tokens.put(t.id, t);
    }

    public void Rescale() {

        for (FieldState field : messageReciever.getCurrentState().getFields()) {
            //if (minX > field.x) minX = field.x;
            //if (maxX < field.x) maxX = field.x;
            //if (minY > field.y) minY = field.y;
            //if (maxY < field.y) maxY = field.y;
        }
        SCALE = Math.min(this.getWidth(), this.getHeight());
        for (FieldState field : messageReciever.getCurrentState().getFields()) {
            String[] fp=properties.getProperty(field.name).split("\\,");
            int size=SCALE/10;
            buttons.get(field.id).setBounds(new Rectangle((int)(Float.parseFloat(fp[0]) * SCALE-size/2),(int)( Float.parseFloat(fp[1]) * SCALE-size/2), size, size));

            for (TokenState token : tokens.values()) {
                if (field.id == token.field)

                    buttons.get(token.id).setBounds(new Rectangle((int)(Float.parseFloat(fp[0]) * SCALE-size/2),(int)( Float.parseFloat(fp[1]) * SCALE-size/2), size, size));
            }
        }

    }

    @Override
    public void paint(Graphics g) {
        if (messageReciever.IsEmpty()) return;
        Rescale();
        Graphics2D g2 = (Graphics2D) g;

        g2.clearRect(0, 0, getWidth(), getHeight());
        g2.drawImage(boardImage,0,0,SCALE,SCALE,null);
        for (FieldState field : messageReciever.getCurrentState().getFields()) {
            for (Object ne : field.neighbours) {
                FieldState n = fields.get(ne);
                if (n != null) {
                    //Line2D line = new Line2D.Float((field.x - minX + 1) * SCALE, (field.y - minY + 1) * SCALE, n.x * SCALE,                            n.y * SCALE);
                    //g2.draw(line);

                }

            }
        }

        super.paint(g);
    }

    public void DisableButtons() {
        for (JButton b : enabledButtons) {
            b.setEnabled(false);
        }
        enabledButtons.clear();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action == "fieldPressed" || action == "tokenPressed") {
            messageReciever.SendSelect(buttons2.get(e.getSource()));
        }
        DisableButtons();
    }



}
