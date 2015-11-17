package hu.bme.aut.gergelyszaz.BGS.core

import graphics.BoardPanel
import hu.bme.aut.gergelyszaz.bGL.Action
import hu.bme.aut.gergelyszaz.bGL.Field
import hu.bme.aut.gergelyszaz.bGL.Model
import java.awt.Dimension
import java.awt.Rectangle
import java.util.HashMap
import java.util.List
import javax.swing.JFrame
import javax.swing.JLabel
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import javax.swing.JPanel

class Game{
	String name
	hu.bme.aut.gergelyszaz.bGL.Board board
	List<Player> players=new ArrayList<Player>
	public Player currentPlayer=null
	Model model
	public Field selectedField=null
	public Token selectedToken=null
	int turnCount=1
	Action lastAction=null
	public volatile var waitForInput=false
	public HashMap<EObject,HashMap<String,Integer>> variables
	JLabel label=null
	val tokens=new ArrayList<Token>
	BoardPanel panel=null
	
	
	def Init(String n, List<Player> p, Model m)
	{
		name=n
		players.addAll(p)	
		model=m
		currentPlayer=players.get(0)
	}
	
	def getNextPlayer() {
		for(var i=0; i<players.length-1; i++){
			if(currentPlayer==players.get(i)) return players.get(i+1)
		}
		return players.get(0)
	}
	
	
	def Run()
	{
		val frame=new JFrame
		panel=new BoardPanel(this,model)
		frame.add(panel)
		label=new JLabel
		panel.add(label)
		frame.defaultCloseOperation=JFrame.EXIT_ON_CLOSE
		label.bounds=new Rectangle(0,0,900,32)
		
		
		
		frame.size=new Dimension(900,900)
		frame.visible=true
		println(name+"     playercount "+players.size) 
		
		while(true){ 
			if(!waitForInput)
			{
				label.text="Turn: "+turnCount;
				
				ExecuteAction(lastAction=GetNextAction)
				if(lastAction==model.rules.turnrules.actions.last){
					currentPlayer=nextPlayer
					if(currentPlayer==players.get(0))		turnCount++
				}
			}
			panel.Refresh
			Thread.yield	
		}
	}

	

	
	def GetNextAction()
	{
		val actions=model.rules.turnrules.actions

		if(lastAction==null){
			return actions.get(0)
		} 
		
		if(lastAction== actions.last)
		{
			return actions.get(0)
		}
		
		for(var i=0; i<actions.length-1;i++)
		{
			if(lastAction==actions.get(i))
			{
				return actions.get(i+1)
			}
		}
	}
	
	def ExecuteAction(Action action)
	{
		if(action.name=="Select"){
			waitForInput=true
			panel.EnableButtons(action.objectOfSelect)
		}
		else if(action.name=="Spawn"){
			val token=new Token(action.token.name)
			token.field=selectedField
			tokens.add(token)
			token.owner=currentPlayer
			panel.AddToken(token)
				
		}
		else if(action.name=="Move"){
			selectedToken.field=selectedField
		}		
	}
}