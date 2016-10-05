package graphics;


import hu.bme.aut.gergelyszaz.BGS.state.FieldState;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

class FieldButtonUI extends BasicButtonUI {
	
	
	FieldButtonUI(FieldState field) {
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		AbstractButton b = (AbstractButton)c;
		ButtonModel model = b.getModel();
		Dimension d = b.getSize();
		if (model.isEnabled()) {
			g.drawOval(0, 0, d.width, d.height);
		} else {

			//g.fillOval((0.1 * d.width) as int, (0.1 * d.width) as int, (d.width * 0.8) as int, (d.height * 0.8) as int)
		}
	}
	
}