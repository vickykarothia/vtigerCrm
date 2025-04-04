package vtiger.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetCommonData {

	public String getCommonData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\my pc\\eclipse-workspace\\vtiger\\src\\test\\resources\\TestData\\commonData.properties");
		
		Properties proObj=new Properties();
		proObj.load(fis);
		
		return proObj.getProperty(key);
	}
}
