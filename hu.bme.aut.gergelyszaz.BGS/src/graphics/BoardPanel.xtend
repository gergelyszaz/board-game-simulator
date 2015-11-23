package graphics

import hu.bme.aut.gergelyszaz.BGS.core.IController
import hu.bme.aut.gergelyszaz.BGS.core.IView
import hu.bme.aut.gergelyszaz.BGS.core.Token
import hu.bme.aut.gergelyszaz.bGL.Field
import hu.bme.aut.gergelyszaz.bGL.Model
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Rectangle
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.geom.Line2D
import java.util.List
import java.util.concurrent.ConcurrentHashMap
import javax.swing.JButton
import javax.swing.JLayeredPane

class BoardPanel extends JLayeredPane implements ActionListener, IView{
	IController controller
	Model model;
	val buttons=new ConcurrentHashMap<JButton,Object>
	val SCALE=100
	
	val tokenButtons=new ConcurrentHashMap<JButton,Token>
	
	new() {
		super()
	}
	
	def Init(){
		removeAll
		buttons.clear
		layout=null
		
		

		for(field: model.board.fields)
		{
			var btn=new JButton
			buttons.put(btn,field)
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
		buttons.put(button,t)
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
		for(b:buttons.keySet){
			b.enabled = false
		}
	}
	
	override RemoveButton(Object o){
		var JButton butt=null
		for(b:buttons.entrySet){
			if(b.value==o)
			butt=b.key
			
		}
		
		remove(butt)
		tokenButtons.remove(butt)
		repaint
		
	}
	

	
	
	override actionPerformed(ActionEvent e) {
		val action=e.actionCommand
		if(action=="fieldPressed"){
			controller.selectedField=buttons.get(e.source) as Field
		}
		if(action=="tokenPressed"){
			controller.selectedToken=buttons.get(e.source) as Token
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
	
	override EnableButtons(List<Object> objects) {
		for(b:buttons.entrySet){
			if(objects.contains(b.value)){	b.key.enabled=true	}
		}
		
	}
	

}
