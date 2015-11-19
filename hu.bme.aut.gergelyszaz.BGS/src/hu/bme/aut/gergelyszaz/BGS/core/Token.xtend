package hu.bme.aut.gergelyszaz.BGS.core


import hu.bme.aut.gergelyszaz.bGL.Field

class Token {
	public String type
	private VariableManager varManager
	public Player owner=null
	private Field currentField=null
	
	new(VariableManager vm,String t){
		varManager=vm
		type=t
	}
	
	def setField(Field field){
		
		varManager.Store(currentField,"tokenCount",0)
		varManager.Store(this,"field",field)
		varManager.Store(field,"tokenCount",1)
		currentField=field
	}
	
	def Field getField(){
		varManager.GetReference("field",this) as Field
	}
	



}
