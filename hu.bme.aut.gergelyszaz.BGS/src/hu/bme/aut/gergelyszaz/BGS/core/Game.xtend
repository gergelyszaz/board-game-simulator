package hu.bme.aut.gergelyszaz.BGS.core

import graphics.BoardPanel
import hu.bme.aut.gergelyszaz.bGL.Action
import hu.bme.aut.gergelyszaz.bGL.Field
import hu.bme.aut.gergelyszaz.bGL.Model
import java.awt.Dimension
import java.awt.Rectangle
import java.util.ArrayList
import java.util.List
import javax.swing.JFrame
import javax.swing.JLabel

class Game{
	String name
	List<Player> players=new ArrayList<Player>
	
	def Player getCurrentPlayer(){	varManager.GetReference("currentPlayer",null) as Player	}
	def void setCurrentPlayer(Player player){ varManager.Store(null,"currentPlayer",player)}
	
	Model model
	
	def Field getSelectedField(){	varManager.GetReference("selectedField",null) as Field	}
	def void setSelectedField(Field field){ varManager.Store(null,"selectedField",field)}
	
	def Token getSelectedToken(){	varManager.GetReference("selectedToken",null) as Token	}
	def void setSelectedToken(Token token){ 
		varManager.Store(null,"selectedToken",token)
		for(f:model.board.fields){
			varManager.Store(f,"distanceFromSelectedToken",-1)
		}
		token.field.setupDistance(0)

	}
	
	private def void setupDistance(Field field, int distance){
		val dist=varManager.GetValue("distanceFromSelectedToken",field)
		if(dist>-1 && dist<=distance) return;
		varManager.Store(field,"distanceFromSelectedToken", distance)
		for(f:field.neighbours){
			f.setupDistance(distance+1)
		}
	}  
	
	int turnCount=1
	Action lastAction=null
	public volatile var waitForInput=false
	
	JLabel label=null
	val tokens=new ArrayList<Token>
	BoardPanel panel=null
	
	public val varManager=new VariableManager
	
	def Init(String n, List<Player> p, Model m)
	{
		name=n
		players.addAll(p)	
		model=m
		currentPlayer=players.get(0)
	}
	
	private def getNextPlayer() {
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

	

	
	private def GetNextAction()
	{
		val actions=model.rules.turnrules.actions

		if(lastAction==null||lastAction== actions.last){
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
	
	private def ExecuteAction(Action action)
	{
		if(action.name==null)
		{
			return
		}
		else if(action.name=="SELECT"){
			waitForInput=true
			panel.EnableButtons(action.objectOfSelect, action.filter)
		}
		else if(action.name=="SPAWN"){
			val token=new Token(varManager,action.token.name)
			token.field=selectedField
			tokens.add(token)
			token.owner=currentPlayer
			panel.AddToken(token)
				
		}
		else if(action.name=="MOVE"){
			selectedToken.field=selectedField
		}		
	}
}