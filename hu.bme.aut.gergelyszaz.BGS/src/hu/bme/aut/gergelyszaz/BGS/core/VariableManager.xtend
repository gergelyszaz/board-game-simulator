package hu.bme.aut.gergelyszaz.BGS.core

import hu.bme.aut.gergelyszaz.bGL.AndExp
import hu.bme.aut.gergelyszaz.bGL.AttributeName
import hu.bme.aut.gergelyszaz.bGL.AttributeOrInt
import hu.bme.aut.gergelyszaz.bGL.BooleanExp
import hu.bme.aut.gergelyszaz.bGL.OrExp
import java.util.HashMap
import hu.bme.aut.gergelyszaz.bGL.AdditionExp
import hu.bme.aut.gergelyszaz.bGL.MultiplicationExp
import hu.bme.aut.gergelyszaz.bGL.SimpleAssignment
import java.util.IllegalFormatCodePointException

class VariableManager{
	public static val String THIS="this"
	public static val String CURRENTPLAYER="currentPlayer"
	public static val String OWNER="owner"
	public static val String TURNCOUNT="turnCount"
	public static val String NULL="null"
	public static val String TOKENCOUNT="tokenCount"
	public static val String FIELD="field"
	public static val String ROLLRESULT="rollResult"
	public static val String SELECTEDFIELD="selectedField"
	public static val String SELECTEDTOKEN="selectedToken"
	public static val String SELECTEDDECK="selectedDeck"
	public static val String SELECTEDCARD="selectedCard"
	public static val String SELECTEDPLAYER="selectedPlayer"
	public static val String TOP="top"
	public static val String DECK="deck"
	public static val String CARDCOUNT="cardCount"
	public static val String DISTANCE_FROM_SELECTED_TOKEN="distanceFromSelectedToken"
	
	private HashMap<Object,HashMap<String,Integer>> variables=new HashMap
	private HashMap<Object,HashMap<String,Object>> references=new HashMap
	
	private def PutLowerCased(HashMap<String,Integer> map, String key, Integer value){	return map.put(key.toLowerCase,value) }
	private def PutLowerCased(HashMap<String,Object> map, String key, Object value){	return map.put(key.toLowerCase,value) }

	def void Clear(){
		variables.clear
		references.clear
	}
	
	def boolean Evaluate(OrExp exp){
		var result=false
		for(e:exp.expressions){	result = (result || e.Evaluate)	}
		return result
	}
	private def boolean Evaluate(AndExp exp){
		var result=true
		for(e:exp.expressions){	result = (result && e.Evaluate)	}
		return result
	}
	
	private def boolean Evaluate(BooleanExp exp){
		val not=exp.not!=null
		if(exp.nestedExp!=null) return not!=exp.nestedExp.Evaluate
			
		val value1=exp.left.GetValue
		val value2=exp.right.GetValue
		val ref1=exp.left.GetReference
		val ref2=exp.right.GetReference


		//if the types don't match or is not stored, return false
		if(exp.name.length==2&&value1==null&&ref1==null||value2==null&&ref2==null||value1==null&&value2!=null) {
			//DumpContentToConsole
			//throw new IllegalAccessException("Value in condition not found: "+exp)
			return false;
		}
		
		var result=false
		switch exp.name{
			case "==": 		result=value1.intValue==value2.intValue
			case "!=": 		result=value1.intValue!=value2.intValue
			case "<=": 		result=value1.intValue<=value2.intValue
			case ">=": 		result=value1.intValue>=value2.intValue
			case ">": 		result=value1.intValue>value2.intValue
			case "<": 		result=value1.intValue<value2.intValue
			case "===": 	result=ref1==ref2
			case "!==": 	result=ref1!=ref2
			default: 		result=false
		}
		return not!=result
		
	}

	private def DumpContentToConsole(){
		for(p:variables.keySet){
			println(p+":	"+variables.get(p))
		}
		for(p:references.keySet){
			println(p+":	"+references.get(p))
		}

	}
	
	
	/**
	 * return value of null.att
	 */
	def Integer GetValue(AttributeOrInt att){
		if(att.attribute==null) return att.value	
		else return att.attribute.GetValue(null)
	}
	
	/**
	 * returns value of obj.att
	 */
	private def Integer GetValue(AttributeName att, Object obj){
		if(att.parent==null){
			val ret=variables.get(obj)?.get(att.name.toLowerCase)
			return ret
		} else{	
			val parent=references.get(obj).get(att.parent.toLowerCase)
			return att.child.GetValue(parent)
		}
		
	}
	
	
	/**
	 * returns att reference
	 */
	def Object GetReference(AttributeOrInt att){
		if(att.attribute==null) return null
		return att.attribute.GetReference(null)	
	}
	
	/**
	 * return obj.att reference
	 */
	private def Object GetReference(AttributeName att, Object obj){
		if(att.parent==null){
			return references.get(obj)?.get(att.name.toLowerCase)
		} else{	
			return att.child.GetReference(references.get(obj)?.get(att.parent.toLowerCase))
		}
	}
	
	
	/**
	 * stores value to null.att
	 */
	def Store(AttributeName att, int value){
		att.StoreValue(null,value)
	}
	
	
	/**
	 * stores ref to null.att
	 */
	def Store(AttributeName att, Object ref){
		att.StoreReference(null,ref)
	}
	
	/**
	 * stores ref to obj.att
	 */
	private def void StoreReference(AttributeName att, Object obj, Object ref){
		if(!references.containsKey(obj)){
			references.put(obj, new HashMap)
		}
		if(att.parent==null){
			references.get(obj).PutLowerCased(att.name,ref)
		} else{
			if(!references.get(obj).containsKey(att.parent.toLowerCase)) throw new IllegalAccessException("Reference "+att.parent.toLowerCase+" does not exist!")
			att.child.StoreReference(references.get(obj).get(att.parent.toLowerCase),ref)
		}
	}
	
	/**
	 * stores value to obj.att
	 */
	private def void StoreValue(AttributeName att, Object obj, int value){
		if(att.parent==null){
			if(!variables.containsKey(obj)){
				variables.put(obj, new HashMap)
			}
			variables.get(obj).PutLowerCased(att.name,value)
		} else{
			if(!references.containsKey(obj)) 					throw new IllegalAccessException("Reference "+obj+" does not exist!")
			if(!references.get(obj).containsKey(att.parent.toLowerCase)) 	throw new IllegalAccessException("Reference "+att.parent.toLowerCase+" does not exist!")
			att.child.StoreValue(references.get(obj).get(att.parent.toLowerCase),value)
		}
	}
	
	/**
	 * stores value to obj.name
	 */
	def StoreToObject_Name(Object obj, String name, int value){
		if(!variables.containsKey(obj)) variables.put(obj, new HashMap)
		variables.get(obj).PutLowerCased(name,value)
	}
	
	/**
	 * stores ref to obj.name
	 */
	def StoreToObject_Name(Object obj, String name, Object ref){
		if(!references.containsKey(obj)) references.put(obj, new HashMap)
		references.get(obj).PutLowerCased(name,ref)
	}

	/**
	 * return the obj.name value
	 */
	def int GetValue(String n,Object obj){
		val name=n.toLowerCase
		if(!variables.containsKey(obj) || !variables.get(obj).containsKey(name)) throw new IllegalAccessException
		variables.get(obj).get(name).intValue
	}
	
	/**
	 * returns the obj.name reference
	 */
	def Object GetReference(String n, Object obj){
		val name=n.toLowerCase
		if(!references.containsKey(obj) || !references.get(obj).containsKey(name.toLowerCase)) throw new IllegalAccessException
		references.get(obj).get(name.toLowerCase)
	}
	
	/**
	 * returns an object if it's a valid expression
	 */
	def Object GetReference(AdditionExp e){
		if(e.expressions.size>1) return null
		if(e.expressions.get(0).expressions.size>1) return null
		if(e.expressions.get(0).nestedExp!=null) return null
		if(e.expressions.get(0).expressions.get(0).attribute==null) return null
		return e.expressions.get(0).expressions.get(0).attribute.GetReference(null)
	}
	
	/**
	 * returns the calculated value of addition
	 */
	def int GetValue(AdditionExp e){
		var ret=e.expressions.get(0).GetValue.intValue
		for(var i=0; i<e.operators.size; i++){
			if(e.operators.get(i)=='+'){
				ret+=e.expressions.get(i+1).GetValue
			} else{
				ret-=e.expressions.get(i+1).GetValue
			}
		}
		return ret
	}
	
	/**
	 * returns the calculated value of multiplication
	 */
	private def int GetValue(MultiplicationExp e){
		if(e.nestedExp!=null) return e.nestedExp.GetValue.intValue
		var ret=e.expressions.get(0).GetValue.intValue
		for(var i=0; i<e.operators.size; i++){
			if(e.operators.get(i)=='*'){
				ret*=e.expressions.get(i+1).GetValue.intValue
			} else{
				ret/=e.expressions.get(i+1).GetValue.intValue
			}
		}
		return ret
	}
	
	/**
	 * A simple assignment is for declaring member variables or references. Not for modifying other objects.
	 */
	def void Store(SimpleAssignment sa,Object parent){
		if(sa.attribute.attribute!=null){
			val ref=sa.attribute.GetReference
			if(ref==null) throw new IllegalAccessException(sa.attribute.attribute.toString)
			parent.StoreToObject_Name(sa.name,ref)
		} else {
			val value=sa.attribute.value
			parent.StoreToObject_Name(sa.name,value)
		}
	}
	

}