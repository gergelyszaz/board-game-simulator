package hu.bme.aut.gergelyszaz.BGS.core


import hu.bme.aut.gergelyszaz.bGL.Field

class Token {
	public String type
	private VariableManager varManager
	private Field currentField=null
	
	new(VariableManager vm,String t){
		varManager=vm
		type=t
	}
	
	def setField(Field field){
		
		varManager.StoreToObject_Name(currentField,"tokenCount",0)
		varManager.StoreToObject_Name(this,"field",field)
		varManager.StoreToObject_Name(field,"tokenCount",1)
		currentField=field
	}
	
	def Field getField(){
		varManager.GetReference("field",this) as Field
	}
	
	
	def setOwner(Player player){
		
		varManager.StoreToObject_Name(this,"owner",player)
		currentField=field
	}
	
	def Player getOwner(){
		varManager.GetReference("owner",this) as Player
	}
	
	def Destroy() {
		field=null
	}



}
