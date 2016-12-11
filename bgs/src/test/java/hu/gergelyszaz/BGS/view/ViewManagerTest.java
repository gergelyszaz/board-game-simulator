package hu.gergelyszaz.BGS.view;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by mad on 2016. 10. 20..
 */
public class ViewManagerTest {

	ViewManager viewManager;
	View view;


	@Before
	public void setUp() throws Exception {
		viewManager=new ViewManager();
		view=mock(View.class);
		viewManager.add(view);

	}

	@Test
	public void add() throws Exception {
		viewManager.add(view);
	}

	@Test
	public void refreshViews() throws Exception {
		viewManager.add(view);
		viewManager.refreshViews();
		verify(view,times(1)).Refresh();


	}

}