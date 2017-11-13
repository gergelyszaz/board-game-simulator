package graphics;

import hu.gergelyszaz.bgs.state.PlayerState;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mad on 2016. 03. 31..
 */
public class PlayerCellRenderer extends JPanel
				implements ListCellRenderer {
	JLabel label_playerName = new JLabel("NO_NAME");

	ColorManager cm = null;

	public PlayerCellRenderer(ColorManager colorManager) {
		cm = colorManager;
		add(label_playerName);
	}

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		PlayerState ps = (PlayerState) value;
		label_playerName.setText(ps.name);
		label_playerName.setBackground(cm.getColor(ps.id));
		return this;
	}
}