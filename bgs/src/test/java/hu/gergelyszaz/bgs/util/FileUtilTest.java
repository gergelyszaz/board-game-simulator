package hu.gergelyszaz.bgs.util;

import junit.framework.Assert;
import org.junit.Test;

public class FileUtilTest {

	@Test
	public void readFile() throws Exception {
		String content=FileUtil.readFile("/testfile.txt");

		Assert.assertEquals("content",content);
	}

}