package graphics;

import com.google.gson.Gson;
import hu.bme.aut.gergelyszaz.BGS.client.BGSClient;
import hu.bme.aut.gergelyszaz.BGS.client.IMessageReciever;
import hu.bme.aut.gergelyszaz.BGS.state.FieldState;
import hu.bme.aut.gergelyszaz.BGS.state.GameState;
import hu.bme.aut.gergelyszaz.BGS.state.TokenState;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

class BoardPanel extends JLayeredPane implements ActionListener, IMessageReciever {
    Stack<GameState> states = new Stack<GameState>();
    ConcurrentHashMap<Integer, JButton> buttons = new ConcurrentHashMap<Integer, JButton>();
    ConcurrentHashMap<JButton, Integer> buttons2 = new ConcurrentHashMap<JButton, Integer>();
    HashSet<JButton> enabledButtons = new HashSet<JButton>();
    int SCALE = 100;
    int minX = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    int minY = Integer.MAX_VALUE;
    int maxY = Integer.MIN_VALUE;
    Hashtable<Integer, TokenState> tokens = new Hashtable<Integer, TokenState>();
    Hashtable<Integer, FieldState> fields = new Hashtable<Integer, FieldState>();
    ColorManager colorManager = new ColorManager();
    private JLabel turncountLabel = new JLabel("");

    public BoardPanel() {
        super();
        states.add(
                new GameState("", 0, 0, -1, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(),
                        new ArrayList(), new ArrayList()));
        add(turncountLabel);
        turncountLabel.setBounds(new Rectangle(0, 0, 100, 100));
    }

    BGSClient client;

    public void SetClient(BGSClient c) {
        client = c;
    }

    public void AddGameState(GameState gs) {
        states.push(gs);

        turncountLabel.setText("Turn: " + gs.getTurncount());

        if (buttons.isEmpty()) {
            for (FieldState field : states.peek().getFields()) {

                JButton btn = new JButton();
                buttons.put(field.id, btn);
                buttons2.put(btn, field.id);
                btn.setUI(new FieldButtonUI(field));
                btn.setOpaque(false);
                btn.setContentAreaFilled(false);
                btn.setBorderPainted(true);
                btn.setBounds(new Rectangle(field.x * SCALE - SCALE / 3, field.y * SCALE - SCALE / 3, SCALE * 2 / 3,
                        SCALE * 2 / 3));
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
    }

    public void Init() {
        removeAll();
        buttons.clear();
        setLayout(null);

        // addComponentListener(this)
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

        for (FieldState field : states.peek().getFields()) {
            if (minX > field.x) minX = field.x;
            if (maxX < field.x) maxX = field.x;
            if (minY > field.y) minY = field.y;
            if (maxY < field.y) maxY = field.y;
        }
        SCALE = Math.min(this.getWidth(), this.getHeight()) / (maxX - minX + 2);
        for (FieldState field : states.peek().getFields()) {
            buttons.get(field.id).setBounds(new Rectangle((field.x - minX + 1) * SCALE - SCALE / 3,
                    (field.y - minY + 1) * SCALE - SCALE / 3, SCALE * 2 / 3, SCALE * 2 / 3));

            for (TokenState token : tokens.values()) {
                if (field.id == token.field)
                    buttons.get(token.id).setBounds(new Rectangle((field.x - minX + 1) * SCALE - SCALE / 3,
                            (field.y - minY + 1) * SCALE - SCALE / 3, SCALE * 2 / 3, SCALE * 2 / 3));
            }
        }

    }

    @Override
    public void paint(Graphics g) {
        if (states.size() == 0) return;
        Rescale();
        Graphics2D g2 = (Graphics2D) g;

        g2.clearRect(0, 0, getWidth(), getHeight());
        for (FieldState field : states.peek().getFields()) {
            for (Object ne : field.neighbours) {
                FieldState n = fields.get(ne);
                if (n != null) {
                    Line2D line = new Line2D.Float((field.x - minX + 1) * SCALE, (field.y - minY + 1) * SCALE, n.x * SCALE,
                            n.y * SCALE);
                    g2.draw(line);

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
            client.SendMessage((new JSONObject().put("action", "select").put("parameter", buttons2.get(e.getSource()))));
        }
        DisableButtons();
    }

    @Override
    public void RecieveMessage(JSONObject obj) {
        System.out.println(obj.toString());
        Gson gson = new Gson();
        if (obj.getString("name") == null) return;
        GameState state = gson.fromJson(obj.toString(), GameState.class);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AddGameState(state);
                repaint();
            }
        });
        //revalidate

    }

}
