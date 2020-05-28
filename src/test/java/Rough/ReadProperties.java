package Rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("user.dir"));
		
		Properties prop = new Properties();
		Properties prop2= new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\properties\\config.properties");
	FileInputStream fis2 = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\properties\\OR.properties");
	prop.load(fis);
	prop2.load(fis2);

		System.out.println(prop.getProperty("browser"));
		System.out.println(prop2.getProperty("url"));
	}
}
