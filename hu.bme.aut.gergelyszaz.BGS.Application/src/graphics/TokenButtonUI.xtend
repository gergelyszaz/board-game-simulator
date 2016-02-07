package graphics

import java.awt.Graphics
import javax.swing.AbstractButton
import javax.swing.JComponent
import javax.swing.plaf.basic.BasicButtonUI
import hu.bme.aut.gergelyszaz.BGS.state.TokenState

class TokenButtonUI extends BasicButtonUI {
	TokenState token = null
	ColorManager cm=null
	new(ColorManager colorManager, TokenState t) {
		token = t
		cm=colorManager
	}

	override paint(Graphics g, JComponent c) {
		val AbstractButton b = c as AbstractButton
		val model = b.model

		val d = b.getSize
		
		g.color = cm.getColor(token.owner)
		if (model.isEnabled) {
			
			g.fillOval(0, 0, d.width, d.height)

		} else {

			g.fillOval((0.1 * d.width) as int, (0.1 * d.width) as int, (d.width * 0.8) as int, (d.height * 0.8) as int)
		}
	}

}