package simplemaveenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Simpleclass {

	FileInputStream fis; 
	File file;
	
	
public Properties readConfigDetails() {
		
	String Filepath="C:\\Softwares\\Myprograms\\simplemaveenproject\\Resourses\\datafile.properties" ;	
	Properties prop = new Properties();	
		
		try {
			
			file = new File(Filepath);
			
			if(!file.exists()) {
				throw new FileNotFoundException();
			}
			fis = new FileInputStream(file);
			prop.load(fis);
			
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return prop;
		
		
	}
public void testconfig() {
	
	Simpleclass readConfig = new Simpleclass();
	
	Properties prop = readConfig.readConfigDetails();
	System.out.println(prop.getProperty("username"));
}
				   
		}
		



	

