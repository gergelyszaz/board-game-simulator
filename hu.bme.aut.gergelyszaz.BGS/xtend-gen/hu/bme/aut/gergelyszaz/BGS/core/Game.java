package hu.bme.aut.gergelyszaz.BGS.core;

import com.google.common.base.Objects;
import hu.bme.aut.gergelyszaz.BGS.core.IController;
import hu.bme.aut.gergelyszaz.BGS.core.IView;
import hu.bme.aut.gergelyszaz.BGS.core.Player;
import hu.bme.aut.gergelyszaz.BGS.core.Token;
import hu.bme.aut.gergelyszaz.BGS.core.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Action;
import hu.bme.aut.gergelyszaz.bGL.AdditionExp;
import hu.bme.aut.gergelyszaz.bGL.AttributeName;
import hu.bme.aut.gergelyszaz.bGL.Board;
import hu.bme.aut.gergelyszaz.bGL.Field;
import hu.bme.aut.gergelyszaz.bGL.GotoCondition;
import hu.bme.aut.gergelyszaz.bGL.Label;
import hu.bme.aut.gergelyszaz.bGL.Model;
import hu.bme.aut.gergelyszaz.bGL.OrExp;
import hu.bme.aut.gergelyszaz.bGL.PlayerSetup;
import hu.bme.aut.gergelyszaz.bGL.SimpleAssignment;
import hu.bme.aut.gergelyszaz.bGL.ValueAssignment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Game implements IController {
  private String name;
  
  private Object lock = new Object();
  
  private List<Player> players = new ArrayList<Player>();
  
  private HashMap<String, Action> labels = new HashMap<String, Action>();
  
  private IView view = null;
  
  private int turnCount = 1;
  
  private Action currentAction = null;
  
  private LinkedList<Action> actionHistory = new LinkedList<Action>();
  
  private final ArrayList<Token> tokens = new ArrayList<Token>();
  
  private VariableManager varManager = new VariableManager();
  
  private boolean gameEnded = false;
  
  public volatile boolean waitForInput = false;
  
  public Player getCurrentPlayer() {
    Object _GetReference = this.varManager.GetReference(VariableManager.CURRENTPLAYER, null);
    return ((Player) _GetReference);
  }
  
  public void setCurrentPlayer(final Player player) {
    this.varManager.StoreToObject_Name(null, VariableManager.CURRENTPLAYER, player);
  }
  
  private Model model;
  
  public Field getSelectedField() {
    Object _GetReference = this.varManager.GetReference(VariableManager.SELECTEDFIELD, null);
    return ((Field) _GetReference);
  }
  
  @Override
  public void setSelectedField(final Field field) {
    this.varManager.StoreToObject_Name(null, VariableManager.SELECTEDFIELD, field);
  }
  
  public Token getSelectedToken() {
    Object _GetReference = this.varManager.GetReference(VariableManager.SELECTEDTOKEN, null);
    return ((Token) _GetReference);
  }
  
  @Override
  public void setSelectedToken(final Token token) {
    this.varManager.StoreToObject_Name(null, VariableManager.SELECTEDTOKEN, token);
    Board _board = this.model.getBoard();
    EList<Field> _fields = _board.getFields();
    for (final Field f : _fields) {
      this.varManager.StoreToObject_Name(f, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, (-1));
    }
    Field _field = token.getField();
    this.setupDistance(_field, 0);
  }
  
  private void setupDistance(final Field field, final int distance) {
    final int dist = this.varManager.GetValue(VariableManager.DISTANCE_FROM_SELECTED_TOKEN, field);
    if (((dist > (-1)) && (dist <= distance))) {
      return;
    }
    this.varManager.StoreToObject_Name(field, VariableManager.DISTANCE_FROM_SELECTED_TOKEN, distance);
    EList<Field> _neighbours = field.getNeighbours();
    for (final Field f : _neighbours) {
      this.setupDistance(f, (distance + 1));
    }
  }
  
  @Override
  public VariableManager getVarManager() {
    return this.varManager;
  }
  
  public void Init(final String n, final List<Player> p, final Model m) {
    this.name = n;
    this.players.addAll(p);
    this.model = m;
    Player _get = this.players.get(0);
    this.setCurrentPlayer(_get);
    Board _board = this.model.getBoard();
    EList<Field> _fields = _board.getFields();
    for (final Field f : _fields) {
      String _name = f.getName();
      this.varManager.StoreToObject_Name(null, _name, f);
    }
    Board _board_1 = this.model.getBoard();
    EList<Field> _fields_1 = _board_1.getFields();
    for (final Field f_1 : _fields_1) {
      EList<SimpleAssignment> _variables = f_1.getVariables();
      for (final SimpleAssignment v : _variables) {
        this.varManager.Store(v, f_1);
      }
    }
    EList<Action> _rules = this.model.getRules();
    for (final Action a : _rules) {
      Label _label = a.getLabel();
      boolean _notEquals = (!Objects.equal(_label, null));
      if (_notEquals) {
        Label _label_1 = a.getLabel();
        String _name_1 = _label_1.getName();
        this.labels.put(_name_1, a);
      }
    }
  }
  
  private Player getNextPlayer() {
    for (int i = 0; (i < (((Object[])Conversions.unwrapArray(this.players, Object.class)).length - 1)); i++) {
      Player _currentPlayer = this.getCurrentPlayer();
      Player _get = this.players.get(i);
      boolean _equals = Objects.equal(_currentPlayer, _get);
      if (_equals) {
        return this.players.get((i + 1));
      }
    }
    return this.players.get(0);
  }
  
  public void Step() {
    try {
      if ((!this.waitForInput)) {
        EList<Action> _rules = this.model.getRules();
        Action _GetNextAction = this.GetNextAction(_rules);
        this.actionHistory.push(this.currentAction = _GetNextAction);
        this.ExecuteAction(this.currentAction);
        EList<Action> _rules_1 = this.model.getRules();
        Action _last = IterableExtensions.<Action>last(_rules_1);
        boolean _equals = Objects.equal(this.currentAction, _last);
        if (_equals) {
          boolean _and = false;
          OrExp _winCondition = this.model.getWinCondition();
          boolean _notEquals = (!Objects.equal(_winCondition, null));
          if (!_notEquals) {
            _and = false;
          } else {
            OrExp _winCondition_1 = this.model.getWinCondition();
            boolean _Evaluate = this.varManager.Evaluate(_winCondition_1);
            _and = _Evaluate;
          }
          if (_and) {
            this.Win();
          }
          boolean _and_1 = false;
          OrExp _loseCondition = this.model.getLoseCondition();
          boolean _notEquals_1 = (!Objects.equal(_loseCondition, null));
          if (!_notEquals_1) {
            _and_1 = false;
          } else {
            OrExp _loseCondition_1 = this.model.getLoseCondition();
            boolean _Evaluate_1 = this.varManager.Evaluate(_loseCondition_1);
            _and_1 = _Evaluate_1;
          }
          if (_and_1) {
            this.Lose();
          }
          if ((!this.gameEnded)) {
            Player _nextPlayer = this.getNextPlayer();
            this.setCurrentPlayer(_nextPlayer);
            Player _currentPlayer = this.getCurrentPlayer();
            Player _get = this.players.get(0);
            boolean _equals_1 = Objects.equal(_currentPlayer, _get);
            if (_equals_1) {
              this.turnCount++;
              this.varManager.StoreToObject_Name(null, VariableManager.TURNCOUNT, this.turnCount);
            }
          }
        }
      } else {
        synchronized (this.lock) {
          this.lock.wait();
        }
      }
      this.view.Refresh();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void Start() {
    try {
      this.varManager.StoreToObject_Name(null, VariableManager.TURNCOUNT, this.turnCount);
      hu.bme.aut.gergelyszaz.bGL.Player _player = this.model.getPlayer();
      EList<PlayerSetup> _playerSetups = _player.getPlayerSetups();
      for (final PlayerSetup setup : _playerSetups) {
        {
          boolean _or = false;
          int _id = setup.getId();
          boolean _lessThan = (_id < 1);
          if (_lessThan) {
            _or = true;
          } else {
            int _id_1 = setup.getId();
            int _size = this.players.size();
            boolean _greaterThan = (_id_1 > _size);
            _or = _greaterThan;
          }
          if (_or) {
            int _id_2 = setup.getId();
            String _plus = ("Invalid player id: Player " + Integer.valueOf(_id_2));
            throw new IllegalAccessException(_plus);
          }
          int _id_3 = setup.getId();
          int _minus = (_id_3 - 1);
          Player _get = this.players.get(_minus);
          this.setCurrentPlayer(_get);
          Player _currentPlayer = this.getCurrentPlayer();
          this.varManager.StoreToObject_Name(null, VariableManager.THIS, _currentPlayer);
          hu.bme.aut.gergelyszaz.bGL.Player _player_1 = this.model.getPlayer();
          EList<SimpleAssignment> _variables = _player_1.getVariables();
          for (final SimpleAssignment s : _variables) {
            Player _currentPlayer_1 = this.getCurrentPlayer();
            this.varManager.Store(s, _currentPlayer_1);
          }
          EList<Action> _setupRules = setup.getSetupRules();
          Action _GetNextAction = this.GetNextAction(_setupRules);
          this.ExecuteAction(this.currentAction = _GetNextAction);
          while ((!Objects.equal(this.currentAction, IterableExtensions.<Action>last(setup.getSetupRules())))) {
            EList<Action> _setupRules_1 = setup.getSetupRules();
            Action _GetNextAction_1 = this.GetNextAction(_setupRules_1);
            this.ExecuteAction(this.currentAction = _GetNextAction_1);
          }
          this.varManager.StoreToObject_Name(null, VariableManager.THIS, null);
          this.currentAction = null;
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void Run() {
    this.Start();
    while ((!this.gameEnded)) {
      {
        this.Step();
        Thread.yield();
      }
    }
  }
  
  private Action GetNextAction(final Collection<Action> actions) {
    boolean _or = false;
    boolean _equals = Objects.equal(this.currentAction, null);
    if (_equals) {
      _or = true;
    } else {
      Action _last = IterableExtensions.<Action>last(actions);
      boolean _equals_1 = Objects.equal(this.currentAction, _last);
      _or = _equals_1;
    }
    if (_or) {
      return ((Action[])Conversions.unwrapArray(actions, Action.class))[0];
    }
    for (int i = 0; (i < (((Object[])Conversions.unwrapArray(actions, Object.class)).length - 1)); i++) {
      Object _get = ((Object[])Conversions.unwrapArray(actions, Object.class))[i];
      boolean _equals_2 = Objects.equal(this.currentAction, _get);
      if (_equals_2) {
        return ((Action[])Conversions.unwrapArray(actions, Action.class))[(i + 1)];
      }
    }
    return null;
  }
  
  private Object ExecuteAction(final Action action) {
    Object _xifexpression = null;
    String _name = action.getName();
    boolean _equals = Objects.equal(_name, "SELECT");
    if (_equals) {
      Action _xblockexpression = null;
      {
        this.waitForInput = true;
        final List<Object> activebuttons = new ArrayList<Object>();
        String _objectOfSelect = action.getObjectOfSelect();
        boolean _equals_1 = Objects.equal(_objectOfSelect, "TOKEN");
        if (_equals_1) {
          EList<Action> _rules = this.model.getRules();
          final Action nextAction = this.GetNextAction(_rules);
          for (final Token t : this.tokens) {
            boolean _and = false;
            String _name_1 = nextAction.getName();
            boolean _equals_2 = Objects.equal(_name_1, "SELECT");
            if (!_equals_2) {
              _and = false;
            } else {
              String _objectOfSelect_1 = nextAction.getObjectOfSelect();
              boolean _equals_3 = Objects.equal(_objectOfSelect_1, "FIELD");
              _and = _equals_3;
            }
            if (_and) {
              this.setSelectedToken(t);
              int possibilities = 0;
              Board _board = this.model.getBoard();
              EList<Field> _fields = _board.getFields();
              for (final Field f : _fields) {
                {
                  this.varManager.StoreToObject_Name(null, VariableManager.THIS, f);
                  OrExp _filter = nextAction.getFilter();
                  boolean _Evaluate = this.varManager.Evaluate(_filter);
                  if (_Evaluate) {
                    possibilities++;
                  }
                }
              }
              if ((possibilities > 0)) {
                this.varManager.StoreToObject_Name(null, VariableManager.THIS, t);
                OrExp _filter = action.getFilter();
                boolean _Evaluate = this.varManager.Evaluate(_filter);
                if (_Evaluate) {
                  activebuttons.add(t);
                }
              }
            } else {
              this.varManager.StoreToObject_Name(null, VariableManager.THIS, t);
              OrExp _filter_1 = action.getFilter();
              boolean _Evaluate_1 = this.varManager.Evaluate(_filter_1);
              if (_Evaluate_1) {
                activebuttons.add(t);
              }
            }
          }
        } else {
          String _objectOfSelect_2 = action.getObjectOfSelect();
          boolean _equals_4 = Objects.equal(_objectOfSelect_2, "FIELD");
          if (_equals_4) {
            Board _board_1 = this.model.getBoard();
            EList<Field> _fields_1 = _board_1.getFields();
            for (final Field f_1 : _fields_1) {
              {
                this.varManager.StoreToObject_Name(null, VariableManager.THIS, f_1);
                OrExp _filter_2 = action.getFilter();
                boolean _Evaluate_2 = this.varManager.Evaluate(_filter_2);
                if (_Evaluate_2) {
                  activebuttons.add(f_1);
                }
              }
            }
          }
        }
        Action _xifexpression_1 = null;
        boolean _isEmpty = activebuttons.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          this.view.EnableButtons(activebuttons);
        } else {
          Action _xblockexpression_1 = null;
          {
            JOptionPane.showMessageDialog(null, "No moves available", "Warning", JOptionPane.INFORMATION_MESSAGE);
            this.Lose();
            this.waitForInput = false;
            Action _pop = this.actionHistory.pop();
            InputOutput.<Action>println(_pop);
            Action _pop_1 = this.actionHistory.pop();
            InputOutput.<Action>println(_pop_1);
            Action _peek = this.actionHistory.peek();
            _xblockexpression_1 = InputOutput.<Action>println(this.currentAction = _peek);
          }
          _xifexpression_1 = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      Object _xifexpression_1 = null;
      String _name_1 = action.getName();
      boolean _equals_1 = Objects.equal(_name_1, "SPAWN");
      if (_equals_1) {
        hu.bme.aut.gergelyszaz.bGL.Token _token = action.getToken();
        String _name_2 = _token.getName();
        final Token token = new Token(this.varManager, _name_2);
        Field _selectedField = this.getSelectedField();
        token.setField(_selectedField);
        this.tokens.add(token);
        Player _currentPlayer = this.getCurrentPlayer();
        token.setOwner(_currentPlayer);
        this.view.AddToken(token);
      } else {
        Object _xifexpression_2 = null;
        String _name_3 = action.getName();
        boolean _equals_2 = Objects.equal(_name_3, "MOVE");
        if (_equals_2) {
          Token _selectedToken = this.getSelectedToken();
          Field _selectedField_1 = this.getSelectedField();
          _xifexpression_2 = _selectedToken.setField(_selectedField_1);
        } else {
          Object _xifexpression_3 = null;
          String _name_4 = action.getName();
          boolean _equals_3 = Objects.equal(_name_4, "DESTROY");
          if (_equals_3) {
            Token _selectedToken_1 = this.getSelectedToken();
            _selectedToken_1.Destroy();
            Token _selectedToken_2 = this.getSelectedToken();
            this.tokens.remove(_selectedToken_2);
            Token _selectedToken_3 = this.getSelectedToken();
            this.view.RemoveButton(_selectedToken_3);
          } else {
            Object _xifexpression_4 = null;
            String _name_5 = action.getName();
            boolean _equals_4 = Objects.equal(_name_5, "WIN");
            if (_equals_4) {
              this.Win();
            } else {
              Object _xifexpression_5 = null;
              String _name_6 = action.getName();
              boolean _equals_5 = Objects.equal(_name_6, "LOSE");
              if (_equals_5) {
                this.Lose();
              } else {
                Object _xifexpression_6 = null;
                String _name_7 = action.getName();
                boolean _equals_6 = Objects.equal(_name_7, "ROLL");
                if (_equals_6) {
                  Integer _xblockexpression_1 = null;
                  {
                    final Random r = new Random();
                    int result = 0;
                    for (int i = 1; (i < (action.getNumberOfDice() + 1)); i++) {
                      {
                        int _to = action.getTo();
                        int _nextInt = r.nextInt(_to);
                        int _from = action.getFrom();
                        int rollresult = (_nextInt + _from);
                        int _result = result;
                        result = (_result + rollresult);
                        this.varManager.StoreToObject_Name(null, (VariableManager.ROLLRESULT + Integer.valueOf(i)), rollresult);
                      }
                    }
                    _xblockexpression_1 = this.varManager.StoreToObject_Name(null, VariableManager.ROLLRESULT, result);
                  }
                  _xifexpression_6 = _xblockexpression_1;
                } else {
                  Action _xifexpression_7 = null;
                  ValueAssignment _assignment = action.getAssignment();
                  boolean _notEquals = (!Objects.equal(_assignment, null));
                  if (_notEquals) {
                    ValueAssignment _assignment_1 = action.getAssignment();
                    AdditionExp _addition = _assignment_1.getAddition();
                    final Object ref = this.varManager.GetReference(_addition);
                    boolean _notEquals_1 = (!Objects.equal(ref, null));
                    if (_notEquals_1) {
                      ValueAssignment _assignment_2 = action.getAssignment();
                      AttributeName _name_8 = _assignment_2.getName();
                      this.varManager.Store(_name_8, ref);
                    } else {
                      ValueAssignment _assignment_3 = action.getAssignment();
                      AdditionExp _addition_1 = _assignment_3.getAddition();
                      final int value = this.varManager.GetValue(_addition_1);
                      ValueAssignment _assignment_4 = action.getAssignment();
                      AttributeName _name_9 = _assignment_4.getName();
                      this.varManager.Store(_name_9, value);
                    }
                  } else {
                    Action _xifexpression_8 = null;
                    GotoCondition _gotoCondition = action.getGotoCondition();
                    boolean _notEquals_2 = (!Objects.equal(_gotoCondition, null));
                    if (_notEquals_2) {
                      Action _xifexpression_9 = null;
                      GotoCondition _gotoCondition_1 = action.getGotoCondition();
                      OrExp _condition = _gotoCondition_1.getCondition();
                      boolean _Evaluate = this.varManager.Evaluate(_condition);
                      if (_Evaluate) {
                        Action _xblockexpression_2 = null;
                        {
                          GotoCondition _gotoCondition_2 = action.getGotoCondition();
                          Label _goto = _gotoCondition_2.getGoto();
                          final String name = _goto.getName();
                          Action _get = this.labels.get(name);
                          _xblockexpression_2 = this.currentAction = _get;
                        }
                        _xifexpression_9 = _xblockexpression_2;
                      } else {
                        _xifexpression_9 = null;
                      }
                      _xifexpression_8 = _xifexpression_9;
                    } else {
                      Object _xifexpression_10 = null;
                      Label _label = action.getLabel();
                      boolean _notEquals_3 = (!Objects.equal(_label, null));
                      if (_notEquals_3) {
                        _xifexpression_10 = null;
                      }
                      _xifexpression_8 = ((Action)_xifexpression_10);
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public void Restart() {
    VariableManager _variableManager = new VariableManager();
    this.varManager = _variableManager;
  }
  
  @Override
  public void setView(final IView v) {
    this.view = v;
  }
  
  private void Lose() {
    this.gameEnded = true;
    Player _currentPlayer = this.getCurrentPlayer();
    int _id = _currentPlayer.getId();
    String _plus = ("Player " + Integer.valueOf(_id));
    String _plus_1 = (_plus + " loses!");
    JOptionPane.showMessageDialog(null, _plus_1, "Warning", 
      JOptionPane.INFORMATION_MESSAGE);
  }
  
  private void Win() {
    this.gameEnded = true;
    Player _currentPlayer = this.getCurrentPlayer();
    int _id = _currentPlayer.getId();
    String _plus = ("Player " + Integer.valueOf(_id));
    String _plus_1 = (_plus + " wins!");
    JOptionPane.showMessageDialog(null, _plus_1, "Warning", 
      JOptionPane.INFORMATION_MESSAGE);
  }
  
  @Override
  public boolean setWaitForInput(final boolean b) {
    return this.waitForInput = b;
  }
  
  @Override
  public Object getLock() {
    return this.lock;
  }
}
