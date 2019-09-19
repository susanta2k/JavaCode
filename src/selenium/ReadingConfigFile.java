package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingConfigFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fs = new FileInputStream("C:\\MyWorkSheet\\SusantaWS\\LearningJava\\src\\selenium\\ConfigFile.properties");
		prop.load(fs);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("password"));
		

	}

}
