package advancedSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Working_With_PropertyFile {
	
	public static String readProp(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./testData/config2.properties");
		Properties property=new Properties();
		property.load(fis);
		return property.getProperty(key);	
	}

}
