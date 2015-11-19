package hu.bme.aut.gergelyszaz.BGS.core

import hu.bme.aut.gergelyszaz.bGL.AndExp
import hu.bme.aut.gergelyszaz.bGL.AttributeName
import hu.bme.aut.gergelyszaz.bGL.AttributeOrInt
import hu.bme.aut.gergelyszaz.bGL.BooleanExp
import hu.bme.aut.gergelyszaz.bGL.OrExp
import java.util.HashMap

class VariableManager {
	private HashMap<Object,HashMap<String,Integer>> variables=new HashMap
	private HashMap<Object,HashMap<String,Object>> references=new HashMap
	
	
	def boolean Evaluate(OrExp exp){
		var result=false
		for(e:exp.expressions){	result = result || e.Evaluate	}
		return result
	}
	private def boolean Evaluate(AndExp exp){
		var result=true
		for(e:exp.expressions){	result = result && e.Evaluate	}
		return result
	}
	
	
	private def boolean Evaluate(BooleanExp exp){
		if(exp.nestedExp!=null) return exp.nestedExp.Evaluate
			
		val value1=exp.left.GetValue
		val value2=exp.right.GetValue
		val ref1=exp.left.GetReference
		val ref2=exp.right.GetReference
		
		//if the types don't match or is not stored, return false
		if(value1==null&&ref1==null||value2==null&&ref2==null||value1==null&&value2!=null||ref1==null&&ref2!=null) return false
		
		switch exp.operator{
			case "==": 		return value1.intValue==value2.intValue
			case "!=": 		return value1.intValue!=value2.intValue
			case "<=": 		return value1.intValue<=value2.intValue
			case ">=": 		return value1.intValue>=value2.intValue
			case ">": 		return value1.intValue>value2.intValue
			case "<": 		return value1.intValue<value2.intValue
			case "===": 	return ref1==ref2
			case "!==": 	return ref1!=ref2
			default: 		return false
		}
		
	}
	
	
	
	def Integer GetValue(AttributeOrInt att){
		if(att.attribute==null) return att.value	
		else return att.attribute.GetValue(null)
	}
	
	private def Integer GetValue(AttributeName att, Object obj){
		if(att.parent==null){
			return variables.get(obj)?.get(att.name)
		} else{	
			return att.child.GetValue(references.get(null)?.get(att.parent))
		}
	}
	
	def Object GetReference(AttributeOrInt att){
		if(att.attribute==null) return null
		return att.attribute.GetReference(null)	
	}
	
	private def Object GetReference(AttributeName att, Object obj){
		if(att.parent==null){
			return references.get(obj)?.get(att.name)
		} else{	
			return att.child.GetReference(references.get(null)?.get(att.parent))
		}
	}
	
	def Store(AttributeName att, int value){
		att.Store(null,value)
	}
	
	def Store(AttributeName att, Object ref){
		att.Store(null,ref)
	}
	
	private def void StoreReference(AttributeName att, Object obj, Object ref){
		if(!references.containsKey(obj)){
			references.put(obj, new HashMap)
		}
		if(att.parent==null){
			references.get(obj).put(att.name,ref)
		} else{
			if(!references.get(obj).containsKey(att.parent)) throw new IllegalAccessException("Reference "+att.parent+" does not exist!")
			att.child.StoreReference(references.get(obj).get(att.parent),ref)
		}
	}
	
	private def void StoreValue(AttributeName att, Object obj, int value){
		if(att.parent==null){
			if(!variables.containsKey(obj)){
				variables.put(obj, new HashMap)
			}
			variables.get(obj).put(att.name,value)
		} else{
			if(!references.containsKey(obj)) 					throw new IllegalAccessException("Reference "+obj+" does not exist!")
			if(!references.get(obj).containsKey(att.parent)) 	throw new IllegalAccessException("Reference "+att.parent+" does not exist!")
			att.child.StoreValue(references.get(obj).get(att.parent),value)
		}
	}
	
	def Store(Object obj, String name, int value){
		if(!variables.containsKey(obj)) variables.put(obj, new HashMap)
		variables.get(obj).put(name,value)
	}
	
	def Store(Object obj, String name, Object ref){
		if(!references.containsKey(obj)) references.put(obj, new HashMap)
		references.get(obj).put(name,ref)
	}
	
	def int GetValue(String name,Object obj){
		if(!variables.containsKey(obj) || !variables.get(obj).containsKey(name)) throw new IllegalAccessException
		variables.get(obj).get(name).intValue
	}
	
	def Object GetReference(String name, Object obj){
		if(!references.containsKey(obj) || !references.get(obj).containsKey(name)) throw new IllegalAccessException
		references.get(obj).get(name)
	}
}