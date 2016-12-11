package hu.gergelyszaz.BGS.view;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mad on 2016. 10. 19..
 */
public class ViewManager {
	Set<View> views=new HashSet<>();
	public void add(View view){
		views.add(view);
	}

	public void refreshViews(){
		views.forEach(View::Refresh);
	}

}
