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

		if(currentField!=null)		varManager.StoreToObject_Name(currentField,varManager.TOKENCOUNT,0);
		varManager.StoreToObject_Name(this,varManager.FIELD,field);
		if(field!=null)		varManager.StoreToObject_Name(field,varManager.TOKENCOUNT,1);
		currentField=field;
	}
	
	public Field getField(){
	return (Field)varManager.GetReference(varManager.FIELD,this);
	}
	
	
	public void setOwner(Player player){
		varManager.StoreToObject_Name(this,varManager.OWNER,player);
	}
	
	public Player getOwner(){
		return (Player)varManager.GetReference(varManager.OWNER,this);
	}
	
	public void Destroy() {
		setField(null);
		varManager.Remove(this);
	}



}
