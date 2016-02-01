package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.BGS.core.Player;
import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Field;

@SuppressWarnings("all")
public class Token {
  public String type;
  
  private VariableManager varManager;
  
  private Field currentField = null;
  
  public Token(final VariableManager vm, final String t) {
    this.varManager = vm;
    this.type = t;
  }
  
  public Field setField(final Field field) {
    Field _xblockexpression = null;
    {
      this.varManager.StoreToObject_Name(this.currentField, "tokenCount", 0);
      this.varManager.StoreToObject_Name(this, "field", field);
      this.varManager.StoreToObject_Name(field, "tokenCount", 1);
      _xblockexpression = this.currentField = field;
    }
    return _xblockexpression;
  }
  
  public Field getField() {
    Object _GetReference = this.varManager.GetReference("field", this);
    return ((Field) _GetReference);
  }
  
  public Field setOwner(final Player player) {
    Field _xblockexpression = null;
    {
      this.varManager.StoreToObject_Name(this, "owner", player);
      Field _field = this.getField();
      _xblockexpression = this.currentField = _field;
    }
    return _xblockexpression;
  }
  
  public Player getOwner() {
    Object _GetReference = this.varManager.GetReference("owner", this);
    return ((Player) _GetReference);
  }
  
  public Field Destroy() {
    return this.setField(null);
  }
}
