package hu.gergelyszaz.bgs.state;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

/**
 * Created by mad on 2016. 10. 19..
 */
public class IDManagerTest {

	IDManager idManager;
	Object validObject;
	int validId;

	@Before
	public void setUp() throws Exception {
		idManager=new IDManager();
		validObject=new Object();
		validId=idManager.get(validObject);

	}

	@Test
	public void getObjectById() throws Exception {
		Object object=idManager.get(validId);
		assertEquals(validObject,object);
	}

	@Test (expected = IllegalAccessError.class)
	public void getObjectByInvalidId() throws Exception {
		int id=666;
		Object object=idManager.get(id);
		assertNotSame(validId,id);
		assertNotSame(validObject,object);
	}

	@Test
	public void getIdByObject() throws Exception {
		int id1=idManager.get(validObject);
		assertEquals(validId,id1);

		Object object=new Object();
		int id2=idManager.get(object);
		assertNotSame(validObject,object);
		assertNotSame(id1,id2);

	}
}