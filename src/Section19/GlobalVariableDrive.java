package Section19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariableDrive {

	public static void main(String args[]) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream("\\Users\\OMKAR\\eclipse-workspace\\TestNGTutorial\\src\\Section19\\data.properties");
		prop.load(fs);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fo=new FileOutputStream("\\Users\\OMKAR\\eclipse-workspace\\TestNGTutorial\\src\\Section19\\data.properties");
		prop.store(fo, null);
	}
}
