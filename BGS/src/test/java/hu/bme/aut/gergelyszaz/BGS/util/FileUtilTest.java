package hu.bme.aut.gergelyszaz.BGS.util;

import junit.framework.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FileUtilTest {

	@Test
	public void readFile() throws Exception {
		String content=FileUtil.readFile("/testfile.txt");

		Assert.assertEquals("content",content);
	}

}