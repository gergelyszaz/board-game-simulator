package graphics

import hu.bme.aut.gergelyszaz.BGS.state.FieldState
import javax.swing.plaf.basic.BasicButtonUI
import java.awt.Graphics
import javax.swing.JComponent
import javax.swing.AbstractButton

class FieldButtonUI extends BasicButtonUI {
	
	
	new(FieldState field) {
	}
	
	override paint(Graphics g, JComponent c) {
		val AbstractButton b = c as AbstractButton
		val model = b.model

		val d = b.getSize
		
		if (model.isEnabled) {

			g.drawOval(0, 0, d.width, d.height)

		} else {

			//g.fillOval((0.1 * d.width) as int, (0.1 * d.width) as int, (d.width * 0.8) as int, (d.height * 0.8) as int)
		}
	}
	
}