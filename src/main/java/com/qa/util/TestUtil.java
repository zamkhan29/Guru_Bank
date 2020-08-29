package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestUtil{

	static Properties prop;
	public static Properties getProperties() {
		try {
			FileInputStream fis = new FileInputStream("F:\\workspace\\Guru_Bank\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop = new Properties();
			prop.load(fis);
		}
		catch(IOException d) {
			d.printStackTrace();
		}
		
		return prop;
	}
	/*  FileReader reader=new FileReader("db.properties");  
      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password")); */ 


}
