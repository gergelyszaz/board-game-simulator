package graphics

import hu.bme.aut.gergelyszaz.BGS.core.Game
import hu.bme.aut.gergelyszaz.BGS.core.Token
import hu.bme.aut.gergelyszaz.bGL.Field
import hu.bme.aut.gergelyszaz.bGL.Model
import hu.bme.aut.gergelyszaz.bGL.OrExp
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Rectangle
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.geom.Line2D
import java.util.concurrent.ConcurrentHashMap
import javax.swing.JButton
import javax.swing.JLayeredPane
import hu.bme.aut.gergelyszaz.BGS.core.IController
import hu.bme.aut.gergelyszaz.BGS.core.IView
import java.util.List

class BoardPanel extends JLayeredPane implements ActionListener, IView{
	IController controller
	Model model;
	val fieldButtons=new ConcurrentHashMap<JButton,Field>
	val tokenButtons=new ConcurrentHashMap<JButton,Token>
	val SCALE=100
	
	new() {
		super()
	}
	
	def Init(){
		removeAll
		fieldButtons.clear
		tokenButtons.clear
		layout=null
		
		val restartButton=new JButton("Restart")
		restartButton.addActionListener(this)
		add(restartButton)
		restartButton.bounds=new Rectangle(0,0,64,32)
		

		for(field: model.board.fields)
		{
			var btn=new JButton
			fieldButtons.put(btn,field)
			btn.bounds=new Rectangle(field.x*SCALE-32,field.y*SCALE-32,64,64)
			btn.actionCommand = "fieldPressed"
			btn.addActionListener(this)
			add(btn,new Integer(1))	
			controller.varManager.StoreToObject_Name(field,"tokenCount",0)
		}
		
		DisableButtons
	}
	
	
	override AddToken(Token t){
		val button=new JButton
		button.UI = new TokenButtonUI(t)
		add(button,new Integer(2))
		button.actionCommand="tokenPressed"
		button.addActionListener(this)
		button.enabled = false
		tokenButtons.put(button,t)
	}
	
	override Refresh()
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
	
	override RemoveToken(Token t){
		var JButton butt=null
		for(b:tokenButtons.entrySet){
			if(b.value==t)
			butt=b.key
			
		}
		
		remove(butt)
		tokenButtons.remove(butt)
		repaint
		
	}
	

	
	
	override actionPerformed(ActionEvent e) {
		val action=e.actionCommand
		if(action=="fieldPressed"){
			controller.selectedField=fieldButtons.get(e.source)
		}
		if(action=="tokenPressed"){
			controller.selectedToken=tokenButtons.get(e.source)
		}
		if(action=="Restart"){
			controller.Restart
		}
		DisableButtons
		controller.waitForInput=false
	
	}
	
	override SetController(IController controller) {
		this.controller=controller
	}
	
	override SetModel(Model model) {
		this.model=model
		Init
	}
	
	override EnableFields(List<Field> fields) {
		for(b:fieldButtons.entrySet){
			if(fields.contains(b.value)){	b.key.enabled=true	}
		}
		
	}
	
	override EnableTokens(List<Token> tokens) {
		for(b:tokenButtons.entrySet){
			if(tokens.contains(b.value)){	b.key.enabled=true	}
		}
	}
	

}
