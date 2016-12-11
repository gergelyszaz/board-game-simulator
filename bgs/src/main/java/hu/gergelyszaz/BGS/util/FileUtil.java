package hu.gergelyszaz.BGS.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.*;

public class FileUtil {

	public static String readFile(String path)
			throws URISyntaxException, IOException {

		return new String(Files.readAllBytes(Paths.get(FileUtil.class.getResource(
				path).toURI())));
	}
}
