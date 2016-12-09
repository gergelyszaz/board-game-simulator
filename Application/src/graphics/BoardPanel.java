package graphics;

import hu.bme.aut.gergelyszaz.BGS.client.StateListener;
import hu.bme.aut.gergelyszaz.BGS.state.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;

class BoardPanel extends JLayeredPane implements ActionListener, StateListener {

	Set<JButton> buttons=new HashSet<>();
	Map<JButton,Integer> ids=new HashMap<>();

	int SCALE = 100;
	ColorManager colorManager = new ColorManager();
	PlayerInfoPanel playerInfoPanel = null;
	MessageListener messageReciever;
	Image boardImage = null;
	Properties properties;
	HashMap<String, Image> images = new HashMap<>();

	public BoardPanel(MessageListener messageReciever) {
		super();
		this.messageReciever = messageReciever;
		setLayout(null);
	}

	public void setGameProperties(Properties properties) {
		this.properties = properties;
		try {
			boardImage = ImageIO.read(BoardPanel.class.getResourceAsStream(properties.getProperty("board")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void UpdateGameState(GameState gs) {
		DisableButtons();

		SCALE = Math.min(this.getWidth(), this.getHeight());

		for (FieldState field : gs.fields) {

			JButton btn = new JButton();

			buttons.add(btn);
			ids.put(btn,field.id);

			btn.setUI(new FieldButtonUI(field));
			btn.setOpaque(!gs.selectables.contains(field.id));
			btn.setEnabled(gs.selectables.contains(field.id));
			btn.setContentAreaFilled(false);
			btn.setBorderPainted(true);

			String[] fp = properties.getProperty(field.name).split("\\,");

			int size = SCALE / 10;
			btn.setBounds(new Rectangle((int) (Float.parseFloat(fp[0]) * SCALE
					- size / 2), (int) (Float.parseFloat(fp[1]) * SCALE - size / 2), size, size));

			btn.setActionCommand("fieldPressed");
			btn.addActionListener(this);

			add(btn, new Integer(1));

		}

		for (TokenState token : gs.tokens) {
			JButton btn = new JButton();
			buttons.add(btn);
			ids.put(btn,token.id);

			btn.setUI(new TokenButtonUI(colorManager, token, getImage(token.type)));
			btn.setOpaque(!gs.selectables.contains(token.id));
			btn.setEnabled(gs.selectables.contains(token.id));
			btn.setContentAreaFilled(false);
			btn.setBorderPainted(false);

			String[] fp = properties.getProperty(gs.fields.stream()
					.filter(x -> x.id==token.field).findFirst().get().name)
					.split("\\,");

			int size = SCALE / 10;
			btn.setBounds(new Rectangle((int) (Float.parseFloat(fp[0]) * SCALE
					- size / 2), (int) (Float.parseFloat(fp[1]) * SCALE - size / 2), size, size));

			btn.setActionCommand("tokenPressed");
			btn.addActionListener(this);

			add(btn, new Integer(2));
		}

		invalidate();
	}

	public Image getImage(String name) {
		if (!images.containsKey(name)) {
			try {
				String path = properties.getProperty(name);

				images.put(name, ImageIO.read(BoardPanel.class.getResourceAsStream(path)));
			} catch (Exception e) {
				System.err.println("Image " + name + " not found!");
				images.put(name, null);
			}
		}
		return images.get(name);
	}


	@Override
	public void paint(Graphics g) {
		if (messageReciever.IsEmpty()) return;

		Graphics2D g2 = (Graphics2D) g;

		g2.clearRect(0, 0, getWidth(), getHeight());
		g2.drawImage(boardImage, 0, 0, SCALE, SCALE, null);

		super.paint(g);
	}

	public void DisableButtons() {
		for (JButton b : buttons) {
			this.remove(b);
		}
		buttons.clear();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action == "fieldPressed" || action == "tokenPressed") {
			messageReciever.getClient().sendSelected(ids.get(e.getSource()));
		}
		DisableButtons();
	}

}
