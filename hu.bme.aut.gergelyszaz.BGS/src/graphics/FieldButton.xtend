package graphics

import javax.swing.JPanel
import java.awt.event.MouseListener
import java.awt.event.MouseEvent
import hu.bme.aut.gergelyszaz.BGS.core.Game
import hu.bme.aut.gergelyszaz.bGL.Field
import java.awt.Graphics

class FieldButton extends JPanel implements MouseListener{
	Field field=null
	Game game=null
	new(Game g, Field f)
	{
		game=g
		field=f
	}
	
	override paint(Graphics arg0) {
		
	}

	override mouseClicked(MouseEvent arg0) {
		game.selectedField=field
	}
	
	override mouseEntered(MouseEvent arg0) {
		
	}
	
	override mouseExited(MouseEvent arg0) {
		
	}
	
	override mousePressed(MouseEvent arg0) {
		
	}
	
	override mouseReleased(MouseEvent arg0) {
		
	}
	
}