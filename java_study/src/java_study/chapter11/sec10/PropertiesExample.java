package java_study.chapter11.sec10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("/database.properties").getPath();

		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		System.out.println("dirver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);

	}
}
