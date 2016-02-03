package graphics

import hu.bme.aut.gergelyszaz.BGS.core.Token
import java.awt.Graphics
import javax.swing.AbstractButton
import javax.swing.JComponent
import javax.swing.plaf.basic.BasicButtonUI

class TokenButtonUI extends BasicButtonUI {
	Token token = null

	new(Token t) {
		token = t
	}

	override paint(Graphics g, JComponent c) {
		val AbstractButton b = c as AbstractButton
		val model = b.model

		val d = b.getSize
		g.color = token.owner.color.brighter
		if (model.isEnabled) {

			g.fillOval(0, 0, d.width, d.height)

		} else {

			g.fillOval((0.1 * d.width) as int, (0.1 * d.width) as int, (d.width * 0.8) as int, (d.height * 0.8) as int)
		}
	}

}