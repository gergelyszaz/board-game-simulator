package hu.bme.aut.gergelyszaz.BGS.core

import graphics.BoardPanel
import hu.bme.aut.gergelyszaz.bGL.Action
import hu.bme.aut.gergelyszaz.bGL.Field
import hu.bme.aut.gergelyszaz.bGL.Model
import java.awt.Dimension
import java.awt.Rectangle
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import javax.swing.JFrame
import javax.swing.JLabel
import hu.bme.aut.gergelyszaz.bGL.PlayerSetup
import java.util.Collection
import java.util.Random

class Game implements IController{
	String name
	List<Player> players=new ArrayList<Player>
	HashMap<String,Action> labels=new HashMap
	IView view=null
	
	
	def Player getCurrentPlayer(){	varManager.GetReference("currentPlayer",null) as Player	}
	def void setCurrentPlayer(Player player){ varManager.StoreToObject_Name(null,"currentPlayer",player)}
	
	Model model
	
	def Field getSelectedField(){	varManager.GetReference("selectedField",null) as Field	}
	override setSelectedField(Field field){ varManager.StoreToObject_Name(null,"selectedField",field)}
	
	def Token getSelectedToken(){	varManager.GetReference("selectedToken",null) as Token	}
	override setSelectedToken(Token token){ 
		varManager.StoreToObject_Name( null,"selectedToken",token)
		for(f:model.board.fields){
			varManager.StoreToObject_Name(f,"distanceFromSelectedToken",-1)
		}
		token.field.setupDistance(0)

	}
	
	private def void setupDistance(Field field, int distance){
		val dist=varManager.GetValue("distanceFromSelectedToken",field)
		if(dist>-1 && dist<=distance) return;
		varManager.StoreToObject_Name(field,"distanceFromSelectedToken", distance)
		for(f:field.neighbours){
			f.setupDistance(distance+1)
		}
	}  
	
	int turnCount=1
	Action lastAction=null
	public volatile var waitForInput=false
	
	val tokens=new ArrayList<Token>
	
	var varManager=new VariableManager
	override getVarManager(){	return varManager	}
	
	def Init(String n, List<Player> p, Model m)
	{
		name=n
		players.addAll(p)	
		model=m
		currentPlayer=players.get(0)
		
		for(f:model.board.fields){
			varManager.StoreToObject_Name(null,f.name,f)
		}
		for(f:model.board.fields){
			for(v:f.variables){
				varManager.Store(v,f)
			}
		}
		
		for(a:model.rules){
			if(a.label!=null) {
				labels.put(a.label.name, a)
			}
		}
	}
	
	private def getNextPlayer() {
		for(var i=0; i<players.length-1; i++){
			if(currentPlayer==players.get(i)) return players.get(i+1)
		}
		return players.get(0)
	}
	
	
	def Run()
	{		
		varManager.StoreToObject_Name(null,"turnCount",turnCount)
		
		for(PlayerSetup player:model.player.playerSetups){
			currentPlayer=players.get(player.id)
			while(lastAction!=player.setupRules.last){
				ExecuteAction(lastAction=GetNextAction(player.setupRules))
			}
		}
		
		while(true){ 
			if(!waitForInput)
			{
				
				ExecuteAction(lastAction=GetNextAction(model.rules))
				if(lastAction==model.rules.last){
					if(model.winCondition!=null&&varManager.Evaluate(model.winCondition)){
						//TODO win
					}
					if(model.loseCondition!=null&&varManager.Evaluate(model.loseCondition)){
						//TODO lose
					}
					
					currentPlayer=nextPlayer
					if(currentPlayer==players.get(0))
					{	
						turnCount++
						varManager.StoreToObject_Name(null,"turnCount",turnCount)
					}
				}
			}
			view.Refresh
			Thread.yield	
		}
	}

	

	
	private def GetNextAction(Collection<Action> actions)
	{
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
		if(action.name=="SELECT"){
			waitForInput=true
			if(action.objectOfSelect=='TOKEN'){
				val List<Token> activetokens=new ArrayList<Token>
				for(t:tokens){
					varManager.StoreToObject_Name(null,"this",t)
					if(varManager.Evaluate(action.filter)) activetokens.add(t)
				}
				view.EnableTokens(activetokens)
			} else if(action.objectOfSelect=='FIELD')
			{
				val List<Field> activefields=new ArrayList<Field>
				for(f:model.board.fields){
					varManager.StoreToObject_Name(null,"this",f)
					if(varManager.Evaluate(action.filter)) activefields.add(f)
				}
				view.EnableFields(activefields)
			}
		}
		else if(action.name=="SPAWN"){
			val token=new Token(varManager,action.token.name)
			token.field=selectedField
			tokens.add(token)
			token.owner=currentPlayer
			view.AddToken(token)
				
		}
		else if(action.name=="MOVE"){
			selectedToken.field=selectedField
		}else if(action.name=="DESTROY"){
			selectedToken.Destroy
			tokens.remove(selectedToken)
			view.RemoveToken(selectedToken)
		}else if (action.name=="ROLL"){
			
			val r=new Random
			var result=0
			for(var i=1;i<action.numberOfDice+1;i++){
				var rollresult=r.nextInt(action.to)+action.from
				result+=rollresult
				varManager.StoreToObject_Name(null,"rollResult"+i,rollresult)	
			}
			varManager.StoreToObject_Name(null,"rollResult",result)
			
		}else if(action.assignment!=null){
			val ref=varManager.GetReference(action.assignment.addition)
			if(ref!=null){
				varManager.Store(action.assignment.name,ref)
			}else{
				val value=varManager.GetValue(action.assignment.addition)
				varManager.Store(action.assignment.name,value)
			}		
			
		}else if(action.gotoCondition!=null){
			if(varManager.Evaluate(action.gotoCondition.condition)){
				val name=action.gotoCondition.goto.name
				
				lastAction=labels.get(name)
			} else {
				
			}
		} else if(action.label!=null){
			
		}
	}
	
	override Restart()
	{
		varManager=new VariableManager
	}
	
	override setView(IView v) {
		view=v
		
	}
	
	override setWaitForInput(boolean b) {
		waitForInput=b
	}
		
}