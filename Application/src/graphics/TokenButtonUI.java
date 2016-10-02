package graphics;

import hu.bme.aut.gergelyszaz.BGS.state.TokenState;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;

class TokenButtonUI extends BasicButtonUI {
	TokenState token = null;
	ColorManager cm=null;
	Image tokenImage=null;
	TokenButtonUI(ColorManager colorManager, TokenState t, Image tokenImage) {
		token = t;
		cm=colorManager;
		this.tokenImage=tokenImage;
	}

	@Override
	public void paint(Graphics g, JComponent c) {
		AbstractButton b = (AbstractButton)c;
		ButtonModel model = b.getModel();

		Dimension d = b.getSize();
		
		g.setColor( cm.getColor(token.owner));

		int x=0,y=0,w=0,h=0;
		if (model.isEnabled()) {
			w=d.width; h=d.height;
		}
		else{
			x=(int)(0.1 * d.width);
			y=(int)(0.1 *d.width);
			w=(int)(d.width * 0.8);
			h=(int)(d.height * 0.8);
		}
		if(tokenImage!=null){
			g.drawImage(tokenImage,x,y,w,h,null);
		}else{
			g.fillOval(x,y,w,h);
		}
	}

}