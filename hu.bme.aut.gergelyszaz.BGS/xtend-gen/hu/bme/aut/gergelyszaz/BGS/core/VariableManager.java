package hu.bme.aut.gergelyszaz.BGS.core;

import com.google.common.base.Objects;
import hu.bme.aut.gergelyszaz.bGL.AdditionExp;
import hu.bme.aut.gergelyszaz.bGL.AndExp;
import hu.bme.aut.gergelyszaz.bGL.AttributeName;
import hu.bme.aut.gergelyszaz.bGL.AttributeOrInt;
import hu.bme.aut.gergelyszaz.bGL.BooleanExp;
import hu.bme.aut.gergelyszaz.bGL.MultiplicationExp;
import hu.bme.aut.gergelyszaz.bGL.OrExp;
import hu.bme.aut.gergelyszaz.bGL.SimpleAssignment;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class VariableManager {
  public final static String THIS = "this";
  
  public final static String CURRENTPLAYER = "currentPlayer";
  
  public final static String OWNER = "owner";
  
  public final static String TURNCOUNT = "turnCount";
  
  public final static String NULL = "null";
  
  public final static String TOKENCOUNT = "tokenCount";
  
  public final static String FIELD = "field";
  
  public final static String ROLLRESULT = "rollResult";
  
  public final static String SELECTEDFIELD = "selectedField";
  
  public final static String SELECTEDTOKEN = "selectedToken";
  
  public final static String DISTANCE_FROM_SELECTED_TOKEN = "distanceFromSelectedToken";
  
  private HashMap<Object, HashMap<String, Integer>> variables = new HashMap<Object, HashMap<String, Integer>>();
  
  private HashMap<Object, HashMap<String, Object>> references = new HashMap<Object, HashMap<String, Object>>();
  
  private Object nullObject = new Object();
  
  private Integer PutLowerCased(final HashMap<String, Integer> map, final String key, final Integer value) {
    String _lowerCase = key.toLowerCase();
    return map.put(_lowerCase, value);
  }
  
  private Object PutLowerCased(final HashMap<String, Object> map, final String key, final Object value) {
    String _lowerCase = key.toLowerCase();
    return map.put(_lowerCase, value);
  }
  
  public VariableManager() {
    this.Init();
  }
  
  public void Init() {
    this.StoreToObject_Name(null, "null", this.nullObject);
  }
  
  public void Clear() {
    this.variables.clear();
    this.references.clear();
  }
  
  public boolean Evaluate(final OrExp exp) {
    boolean result = false;
    EList<AndExp> _expressions = exp.getExpressions();
    for (final AndExp e : _expressions) {
      boolean _or = false;
      if (result) {
        _or = true;
      } else {
        boolean _Evaluate = this.Evaluate(e);
        _or = _Evaluate;
      }
      result = _or;
    }
    return result;
  }
  
  private boolean Evaluate(final AndExp exp) {
    boolean result = true;
    EList<BooleanExp> _expressions = exp.getExpressions();
    for (final BooleanExp e : _expressions) {
      boolean _and = false;
      if (!result) {
        _and = false;
      } else {
        boolean _Evaluate = this.Evaluate(e);
        _and = _Evaluate;
      }
      result = _and;
    }
    return result;
  }
  
  private boolean Evaluate(final BooleanExp exp) {
    String _not = exp.getNot();
    final boolean not = (!Objects.equal(_not, null));
    OrExp _nestedExp = exp.getNestedExp();
    boolean _notEquals = (!Objects.equal(_nestedExp, null));
    if (_notEquals) {
      OrExp _nestedExp_1 = exp.getNestedExp();
      boolean _Evaluate = this.Evaluate(_nestedExp_1);
      return (not != _Evaluate);
    }
    AttributeOrInt _left = exp.getLeft();
    final Integer value1 = this.GetValue(_left);
    AttributeOrInt _right = exp.getRight();
    final Integer value2 = this.GetValue(_right);
    AttributeOrInt _left_1 = exp.getLeft();
    final Object ref1 = this.GetReference(_left_1);
    AttributeOrInt _right_1 = exp.getRight();
    final Object ref2 = this.GetReference(_right_1);
    boolean _or = false;
    boolean _or_1 = false;
    boolean _and = false;
    boolean _equals = Objects.equal(value1, null);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(ref1, null);
      _and = _equals_1;
    }
    if (_and) {
      _or_1 = true;
    } else {
      boolean _and_1 = false;
      boolean _equals_2 = Objects.equal(value2, null);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        boolean _equals_3 = Objects.equal(ref2, null);
        _and_1 = _equals_3;
      }
      _or_1 = _and_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _and_2 = false;
      boolean _equals_4 = Objects.equal(value1, null);
      if (!_equals_4) {
        _and_2 = false;
      } else {
        boolean _notEquals_1 = (!Objects.equal(value2, null));
        _and_2 = _notEquals_1;
      }
      _or = _and_2;
    }
    if (_or) {
      return false;
    }
    boolean result = false;
    String _name = exp.getName();
    switch (_name) {
      case "==":
        int _intValue = value1.intValue();
        int _intValue_1 = value2.intValue();
        boolean _equals_5 = (_intValue == _intValue_1);
        result = _equals_5;
        break;
      case "!=":
        int _intValue_2 = value1.intValue();
        int _intValue_3 = value2.intValue();
        boolean _notEquals_2 = (_intValue_2 != _intValue_3);
        result = _notEquals_2;
        break;
      case "<=":
        int _intValue_4 = value1.intValue();
        int _intValue_5 = value2.intValue();
        boolean _lessEqualsThan = (_intValue_4 <= _intValue_5);
        result = _lessEqualsThan;
        break;
      case ">=":
        int _intValue_6 = value1.intValue();
        int _intValue_7 = value2.intValue();
        boolean _greaterEqualsThan = (_intValue_6 >= _intValue_7);
        result = _greaterEqualsThan;
        break;
      case ">":
        int _intValue_8 = value1.intValue();
        int _intValue_9 = value2.intValue();
        boolean _greaterThan = (_intValue_8 > _intValue_9);
        result = _greaterThan;
        break;
      case "<":
        int _intValue_10 = value1.intValue();
        int _intValue_11 = value2.intValue();
        boolean _lessThan = (_intValue_10 < _intValue_11);
        result = _lessThan;
        break;
      case "===":
        boolean _equals_6 = Objects.equal(ref1, ref2);
        result = _equals_6;
        break;
      case "!==":
        boolean _notEquals_3 = (!Objects.equal(ref1, ref2));
        result = _notEquals_3;
        break;
      default:
        result = false;
        break;
    }
    return (not != result);
  }
  
  /**
   * return value of null.att
   */
  public Integer GetValue(final AttributeOrInt att) {
    AttributeName _attribute = att.getAttribute();
    boolean _equals = Objects.equal(_attribute, null);
    if (_equals) {
      return Integer.valueOf(att.getValue());
    } else {
      AttributeName _attribute_1 = att.getAttribute();
      return this.GetValue(_attribute_1, null);
    }
  }
  
  /**
   * returns value of obj.att
   */
  private Integer GetValue(final AttributeName att, final Object obj) {
    String _parent = att.getParent();
    boolean _equals = Objects.equal(_parent, null);
    if (_equals) {
      HashMap<String, Integer> _get = this.variables.get(obj);
      Integer _get_1 = null;
      if (_get!=null) {
        String _name = att.getName();
        String _lowerCase = _name.toLowerCase();
        _get_1=_get.get(_lowerCase);
      }
      final Integer ret = _get_1;
      return ret;
    } else {
      HashMap<String, Object> _get_2 = this.references.get(obj);
      String _parent_1 = att.getParent();
      String _lowerCase_1 = _parent_1.toLowerCase();
      final Object parent = _get_2.get(_lowerCase_1);
      AttributeName _child = att.getChild();
      return this.GetValue(_child, parent);
    }
  }
  
  /**
   * returns att reference
   */
  public Object GetReference(final AttributeOrInt att) {
    AttributeName _attribute = att.getAttribute();
    boolean _equals = Objects.equal(_attribute, null);
    if (_equals) {
      return null;
    }
    AttributeName _attribute_1 = att.getAttribute();
    return this.GetReference(_attribute_1, null);
  }
  
  /**
   * return obj.att reference
   */
  private Object GetReference(final AttributeName att, final Object obj) {
    String _parent = att.getParent();
    boolean _equals = Objects.equal(_parent, null);
    if (_equals) {
      HashMap<String, Object> _get = this.references.get(obj);
      Object _get_1 = null;
      if (_get!=null) {
        String _name = att.getName();
        String _lowerCase = _name.toLowerCase();
        _get_1=_get.get(_lowerCase);
      }
      return _get_1;
    } else {
      AttributeName _child = att.getChild();
      HashMap<String, Object> _get_2 = this.references.get(obj);
      Object _get_3 = null;
      if (_get_2!=null) {
        String _parent_1 = att.getParent();
        String _lowerCase_1 = _parent_1.toLowerCase();
        _get_3=_get_2.get(_lowerCase_1);
      }
      return this.GetReference(_child, _get_3);
    }
  }
  
  /**
   * stores value to null.att
   */
  public void Store(final AttributeName att, final int value) {
    this.StoreValue(att, null, value);
  }
  
  /**
   * stores ref to null.att
   */
  public void Store(final AttributeName att, final Object ref) {
    this.StoreReference(att, null, ref);
  }
  
  /**
   * stores ref to obj.att
   */
  private void StoreReference(final AttributeName att, final Object obj, final Object ref) {
    try {
      boolean _containsKey = this.references.containsKey(obj);
      boolean _not = (!_containsKey);
      if (_not) {
        HashMap<String, Object> _hashMap = new HashMap<String, Object>();
        this.references.put(obj, _hashMap);
      }
      String _parent = att.getParent();
      boolean _equals = Objects.equal(_parent, null);
      if (_equals) {
        HashMap<String, Object> _get = this.references.get(obj);
        String _name = att.getName();
        this.PutLowerCased(_get, _name, ref);
      } else {
        HashMap<String, Object> _get_1 = this.references.get(obj);
        String _parent_1 = att.getParent();
        String _lowerCase = _parent_1.toLowerCase();
        boolean _containsKey_1 = _get_1.containsKey(_lowerCase);
        boolean _not_1 = (!_containsKey_1);
        if (_not_1) {
          String _parent_2 = att.getParent();
          String _lowerCase_1 = _parent_2.toLowerCase();
          String _plus = ("Reference " + _lowerCase_1);
          String _plus_1 = (_plus + " does not exist!");
          throw new IllegalAccessException(_plus_1);
        }
        AttributeName _child = att.getChild();
        HashMap<String, Object> _get_2 = this.references.get(obj);
        String _parent_3 = att.getParent();
        String _lowerCase_2 = _parent_3.toLowerCase();
        Object _get_3 = _get_2.get(_lowerCase_2);
        this.StoreReference(_child, _get_3, ref);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * stores value to obj.att
   */
  private void StoreValue(final AttributeName att, final Object obj, final int value) {
    try {
      String _parent = att.getParent();
      boolean _equals = Objects.equal(_parent, null);
      if (_equals) {
        boolean _containsKey = this.variables.containsKey(obj);
        boolean _not = (!_containsKey);
        if (_not) {
          HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
          this.variables.put(obj, _hashMap);
        }
        HashMap<String, Integer> _get = this.variables.get(obj);
        String _name = att.getName();
        this.PutLowerCased(_get, _name, Integer.valueOf(value));
      } else {
        boolean _containsKey_1 = this.references.containsKey(obj);
        boolean _not_1 = (!_containsKey_1);
        if (_not_1) {
          throw new IllegalAccessException((("Reference " + obj) + " does not exist!"));
        }
        HashMap<String, Object> _get_1 = this.references.get(obj);
        String _parent_1 = att.getParent();
        String _lowerCase = _parent_1.toLowerCase();
        boolean _containsKey_2 = _get_1.containsKey(_lowerCase);
        boolean _not_2 = (!_containsKey_2);
        if (_not_2) {
          String _parent_2 = att.getParent();
          String _lowerCase_1 = _parent_2.toLowerCase();
          String _plus = ("Reference " + _lowerCase_1);
          String _plus_1 = (_plus + " does not exist!");
          throw new IllegalAccessException(_plus_1);
        }
        AttributeName _child = att.getChild();
        HashMap<String, Object> _get_2 = this.references.get(obj);
        String _parent_3 = att.getParent();
        String _lowerCase_2 = _parent_3.toLowerCase();
        Object _get_3 = _get_2.get(_lowerCase_2);
        this.StoreValue(_child, _get_3, value);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * stores value to obj.name
   */
  public Integer StoreToObject_Name(final Object obj, final String name, final int value) {
    Integer _xblockexpression = null;
    {
      boolean _containsKey = this.variables.containsKey(obj);
      boolean _not = (!_containsKey);
      if (_not) {
        HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
        this.variables.put(obj, _hashMap);
      }
      HashMap<String, Integer> _get = this.variables.get(obj);
      _xblockexpression = this.PutLowerCased(_get, name, Integer.valueOf(value));
    }
    return _xblockexpression;
  }
  
  /**
   * stores ref to obj.name
   */
  public Object StoreToObject_Name(final Object obj, final String name, final Object ref) {
    Object _xblockexpression = null;
    {
      boolean _containsKey = this.references.containsKey(obj);
      boolean _not = (!_containsKey);
      if (_not) {
        HashMap<String, Object> _hashMap = new HashMap<String, Object>();
        this.references.put(obj, _hashMap);
      }
      HashMap<String, Object> _get = this.references.get(obj);
      _xblockexpression = this.PutLowerCased(_get, name, ref);
    }
    return _xblockexpression;
  }
  
  /**
   * return the obj.name value
   */
  public int GetValue(final String n, final Object obj) {
    try {
      int _xblockexpression = (int) 0;
      {
        final String name = n.toLowerCase();
        boolean _or = false;
        boolean _containsKey = this.variables.containsKey(obj);
        boolean _not = (!_containsKey);
        if (_not) {
          _or = true;
        } else {
          HashMap<String, Integer> _get = this.variables.get(obj);
          boolean _containsKey_1 = _get.containsKey(name);
          boolean _not_1 = (!_containsKey_1);
          _or = _not_1;
        }
        if (_or) {
          throw new IllegalAccessException();
        }
        HashMap<String, Integer> _get_1 = this.variables.get(obj);
        Integer _get_2 = _get_1.get(name);
        _xblockexpression = _get_2.intValue();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * returns the obj.name reference
   */
  public Object GetReference(final String n, final Object obj) {
    try {
      Object _xblockexpression = null;
      {
        final String name = n.toLowerCase();
        boolean _or = false;
        boolean _containsKey = this.references.containsKey(obj);
        boolean _not = (!_containsKey);
        if (_not) {
          _or = true;
        } else {
          HashMap<String, Object> _get = this.references.get(obj);
          String _lowerCase = name.toLowerCase();
          boolean _containsKey_1 = _get.containsKey(_lowerCase);
          boolean _not_1 = (!_containsKey_1);
          _or = _not_1;
        }
        if (_or) {
          throw new IllegalAccessException();
        }
        HashMap<String, Object> _get_1 = this.references.get(obj);
        String _lowerCase_1 = name.toLowerCase();
        _xblockexpression = _get_1.get(_lowerCase_1);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * returns an object if it's a valid expression
   */
  public Object GetReference(final AdditionExp e) {
    EList<MultiplicationExp> _expressions = e.getExpressions();
    int _size = _expressions.size();
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      return null;
    }
    EList<MultiplicationExp> _expressions_1 = e.getExpressions();
    MultiplicationExp _get = _expressions_1.get(0);
    EList<AttributeOrInt> _expressions_2 = _get.getExpressions();
    int _size_1 = _expressions_2.size();
    boolean _greaterThan_1 = (_size_1 > 1);
    if (_greaterThan_1) {
      return null;
    }
    EList<MultiplicationExp> _expressions_3 = e.getExpressions();
    MultiplicationExp _get_1 = _expressions_3.get(0);
    AdditionExp _nestedExp = _get_1.getNestedExp();
    boolean _notEquals = (!Objects.equal(_nestedExp, null));
    if (_notEquals) {
      return null;
    }
    EList<MultiplicationExp> _expressions_4 = e.getExpressions();
    MultiplicationExp _get_2 = _expressions_4.get(0);
    EList<AttributeOrInt> _expressions_5 = _get_2.getExpressions();
    AttributeOrInt _get_3 = _expressions_5.get(0);
    AttributeName _attribute = _get_3.getAttribute();
    boolean _equals = Objects.equal(_attribute, null);
    if (_equals) {
      return null;
    }
    EList<MultiplicationExp> _expressions_6 = e.getExpressions();
    MultiplicationExp _get_4 = _expressions_6.get(0);
    EList<AttributeOrInt> _expressions_7 = _get_4.getExpressions();
    AttributeOrInt _get_5 = _expressions_7.get(0);
    AttributeName _attribute_1 = _get_5.getAttribute();
    return this.GetReference(_attribute_1, null);
  }
  
  /**
   * returns the calculated value of addition
   */
  public int GetValue(final AdditionExp e) {
    EList<MultiplicationExp> _expressions = e.getExpressions();
    MultiplicationExp _get = _expressions.get(0);
    int _GetValue = this.GetValue(_get);
    int ret = Integer.valueOf(_GetValue).intValue();
    for (int i = 0; (i < e.getOperators().size()); i++) {
      EList<String> _operators = e.getOperators();
      String _get_1 = _operators.get(i);
      boolean _equals = Objects.equal(_get_1, "+");
      if (_equals) {
        int _ret = ret;
        EList<MultiplicationExp> _expressions_1 = e.getExpressions();
        MultiplicationExp _get_2 = _expressions_1.get((i + 1));
        int _GetValue_1 = this.GetValue(_get_2);
        ret = (_ret + _GetValue_1);
      } else {
        int _ret_1 = ret;
        EList<MultiplicationExp> _expressions_2 = e.getExpressions();
        MultiplicationExp _get_3 = _expressions_2.get((i + 1));
        int _GetValue_2 = this.GetValue(_get_3);
        ret = (_ret_1 - _GetValue_2);
      }
    }
    return ret;
  }
  
  /**
   * returns the calculated value of multiplication
   */
  private int GetValue(final MultiplicationExp e) {
    AdditionExp _nestedExp = e.getNestedExp();
    boolean _notEquals = (!Objects.equal(_nestedExp, null));
    if (_notEquals) {
      AdditionExp _nestedExp_1 = e.getNestedExp();
      int _GetValue = this.GetValue(_nestedExp_1);
      return Integer.valueOf(_GetValue).intValue();
    }
    EList<AttributeOrInt> _expressions = e.getExpressions();
    AttributeOrInt _get = _expressions.get(0);
    Integer _GetValue_1 = this.GetValue(_get);
    int ret = _GetValue_1.intValue();
    for (int i = 0; (i < e.getOperators().size()); i++) {
      EList<String> _operators = e.getOperators();
      String _get_1 = _operators.get(i);
      boolean _equals = Objects.equal(_get_1, "*");
      if (_equals) {
        int _ret = ret;
        EList<AttributeOrInt> _expressions_1 = e.getExpressions();
        AttributeOrInt _get_2 = _expressions_1.get((i + 1));
        Integer _GetValue_2 = this.GetValue(_get_2);
        int _intValue = _GetValue_2.intValue();
        ret = (_ret * _intValue);
      } else {
        int _ret_1 = ret;
        EList<AttributeOrInt> _expressions_2 = e.getExpressions();
        AttributeOrInt _get_3 = _expressions_2.get((i + 1));
        Integer _GetValue_3 = this.GetValue(_get_3);
        int _intValue_1 = _GetValue_3.intValue();
        ret = (_ret_1 / _intValue_1);
      }
    }
    return ret;
  }
  
  /**
   * A simple assignment is for declaring member variables or references. Not for modifying other objects.
   */
  public void Store(final SimpleAssignment sa, final Object parent) {
    try {
      AttributeOrInt _attribute = sa.getAttribute();
      AttributeName _attribute_1 = _attribute.getAttribute();
      boolean _notEquals = (!Objects.equal(_attribute_1, null));
      if (_notEquals) {
        AttributeOrInt _attribute_2 = sa.getAttribute();
        final Object ref = this.GetReference(_attribute_2);
        boolean _equals = Objects.equal(ref, null);
        if (_equals) {
          AttributeOrInt _attribute_3 = sa.getAttribute();
          AttributeName _attribute_4 = _attribute_3.getAttribute();
          String _string = _attribute_4.toString();
          throw new IllegalAccessException(_string);
        }
        String _name = sa.getName();
        this.StoreToObject_Name(parent, _name, ref);
      } else {
        AttributeOrInt _attribute_5 = sa.getAttribute();
        final int value = _attribute_5.getValue();
        String _name_1 = sa.getName();
        this.StoreToObject_Name(parent, _name_1, value);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
