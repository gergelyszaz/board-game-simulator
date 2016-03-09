package graphics;

import hu.bme.aut.gergelyszaz.BGS.state.TokenState;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

class TokenButtonUI extends BasicButtonUI {
	TokenState token = null;
	ColorManager cm=null;
	TokenButtonUI(ColorManager colorManager, TokenState t) {
		token = t;
		cm=colorManager;
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		AbstractButton b = (AbstractButton)c;
		ButtonModel model = b.getModel();

		Dimension d = b.getSize();
		
		g.setColor( cm.getColor(token.owner));
		if (model.isEnabled()) {
			
			g.fillOval(0, 0, d.width, d.height);

		} else {

			g.fillOval((int)(0.1 * d.width), (int)(0.1 *d.width), (int)(d.width * 0.8), (int)(d.height * 0.8));
		}
	}

}