package hu.bme.aut.gergelyszaz.BGS.core;

import java.awt.Color;
import java.util.Random;

@SuppressWarnings("all")
public class Player {
  private int ID;
  
  private Color color;
  
  public Player(final int id) {
    this.ID = id;
    final Random r = new Random((id + 360));
    float _nextFloat = r.nextFloat();
    float _nextFloat_1 = r.nextFloat();
    float _nextFloat_2 = r.nextFloat();
    Color _color = new Color(_nextFloat, _nextFloat_1, _nextFloat_2);
    this.color = _color;
  }
  
  public Color getColor() {
    return this.color;
  }
  
  public int getId() {
    return this.ID;
  }
}
