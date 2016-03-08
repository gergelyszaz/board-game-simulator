package hu.bme.aut.gergelyszaz.BGS.core;


import hu.bme.aut.gergelyszaz.BGS.core.model.Player;
import hu.bme.aut.gergelyszaz.bGL.Field;

public class Token {
	public String type;
	private VariableManager varManager;
	private Field currentField=null;
	
	public Token(VariableManager vm,String t){
		varManager=vm;
		type=t;
	}
	
	public void setField(Field field){
		
		varManager.StoreToObject_Name(currentField,"tokenCount",0);
		varManager.StoreToObject_Name(this,"field",field);
		varManager.StoreToObject_Name(field,"tokenCount",1);
		currentField=field;
	}
	
	public Field getField(){
	return (Field)varManager.GetReference("field",this);
	}
	
	
	public void setOwner(Player player){
		
		varManager.StoreToObject_Name(this,"owner",player);
		currentField=getField();
	}
	
	public Player getOwner(){
		return (Player)varManager.GetReference("owner",this);
	}
	
	public void Destroy() {
		setField(null);
	}



}
