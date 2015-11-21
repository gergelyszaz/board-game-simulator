package graphics

import hu.bme.aut.gergelyszaz.BGS.core.Token
import java.awt.Graphics
import javax.swing.AbstractButton
import javax.swing.JComponent
import javax.swing.plaf.basic.BasicButtonUI

class TokenButtonUI extends BasicButtonUI{
	Token token=null

	new(Token t)
	{
		token=t
	}
	
	override paint(Graphics g, JComponent c) {
		val AbstractButton b = c as AbstractButton
        val model = b.model
        
        
        val d=b.getSize
        if(model.isEnabled)
        g.color = token.owner.color.brighter
        else g.color=token.owner.color
        g.fillOval(0,0,d.width,d.height)
        
        
	}
	
}