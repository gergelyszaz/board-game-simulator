package graphics

import hu.bme.aut.gergelyszaz.bGL.Model
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Rectangle
import java.awt.geom.Line2D
import javax.swing.JButton
import javax.swing.JPanel
import javax.swing.JLabel
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
import hu.bme.aut.gergelyszaz.BGS.core.Game
import java.util.Hashtable
import hu.bme.aut.gergelyszaz.bGL.Field
import hu.bme.aut.gergelyszaz.BGS.core.Token
import java.util.concurrent.ConcurrentHashMap
import javax.swing.JLayeredPane
import hu.bme.aut.gergelyszaz.bGL.OrExp

class BoardPanel extends JLayeredPane implements ActionListener{
	Game game
	Model model;
	val fieldButtons=new ConcurrentHashMap<JButton,Field>
	val tokenButtons=new ConcurrentHashMap<JButton,Token>
	val SCALE=100
	
	new(Game g, Model m) {
		super()
		model=m
		game=g
		layout=null
		for(field: model.board.fields)
		{
			var btn=new JButton
			fieldButtons.put(btn,field)
			btn.bounds=new Rectangle(field.x*SCALE-32,field.y*SCALE-32,64,64)
			btn.actionCommand = "fieldPressed"
			btn.addActionListener(this)
			add(btn,new Integer(1))	
			game.varManager.StoreToObject_Name(field,"tokenCount",0)
		}
		
		DisableButtons
	}
	
	
	def AddToken(Token t){
		val button=new JButton
		add(button,new Integer(2))
		button.actionCommand="tokenPressed"
		button.addActionListener(this)
		button.enabled = false
		tokenButtons.put(button,t)
	}
	
	def Refresh()
	{
		for(entry: tokenButtons.entrySet){
			val field=entry.value.field
			entry.key.bounds=new Rectangle(field.x*SCALE-16,field.y*SCALE-16,32,32)
		}
	}
	
	
	override paint(Graphics g) {
		
		var g2 =  g as Graphics2D;
		
		for(field: model.board.fields)
		{
			for(n:field.neighbours)
			{
				var line=new Line2D.Float(field.x*SCALE,field.y*SCALE,n.x*SCALE,n.y*SCALE)
				g2.draw(line)
			
			}
		}
		
		super.paint(g)
	}
	
	def DisableButtons(){
		for(b:fieldButtons.keySet){
			b.enabled = false
		
		}
		for(b:tokenButtons.keySet){
			b.enabled = false
		}
	}
	
	def RemoveToken(Token t){
		var JButton butt=null
		for(b:tokenButtons.entrySet){
			if(b.value==t)
			butt=b.key
			
		}
		
		remove(butt)
		tokenButtons.remove(butt)
		
	}
	
	def EnableButtons(String object, OrExp filter){
		if(object=="FIELD"){
			for(b:fieldButtons.keySet){
				game.varManager.StoreToObject_Name(null,"this",fieldButtons.get(b))
				b.enabled = game.varManager.Evaluate(filter)
			}
		}
		if(object=="TOKEN"){
			for(b:tokenButtons.keySet){
				game.varManager.StoreToObject_Name(null,"this",tokenButtons.get(b))
				b.enabled = game.varManager.Evaluate(filter)
			}
		}
	}
	
	override actionPerformed(ActionEvent e) {
		val action=e.actionCommand
		if(action=="fieldPressed"){
			game.selectedField=fieldButtons.get(e.source)
		}
		if(action=="tokenPressed"){
			game.selectedToken=tokenButtons.get(e.source)
		}
		DisableButtons
		game.waitForInput=false
	
	}
	

}
