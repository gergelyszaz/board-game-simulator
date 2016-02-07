package graphics;

import java.awt.Color;
import java.util.Hashtable;
import java.util.Stack;



public class ColorManager {
	private Hashtable<String, Color> colors=new Hashtable<>();
	
	private Stack<Color> useableColors=new Stack<>();
	
	public ColorManager()
	{
		useableColors.add(Color.red);
		useableColors.add(Color.blue);
		useableColors.add(Color.green);
		useableColors.add(Color.yellow);
		useableColors.add(Color.pink);
		useableColors.add(Color.CYAN);
	}
	
	public Color getColor(String id){
		if( !colors.keySet().contains(id))
			colors.put(id, useableColors.pop());
		return colors.get(id);
	}
	
	public void ChangeColor(String string, Color color){
		 colors.put(string, color);
		
	}
}
