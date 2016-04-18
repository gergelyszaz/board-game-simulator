package hu.bme.aut.gergelyszaz.BGS.core.model;


import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Field;

public class Token {
	public String type;
	private VariableManager varManager;
	
	public Token(VariableManager vm,String t){
		varManager=vm;
		type=t;
	}
	
	public void setField(Field field){
		varManager.StoreToObject_Name(this,varManager.FIELD,field);
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
