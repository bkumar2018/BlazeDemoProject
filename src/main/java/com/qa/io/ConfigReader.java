package com.qa.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.qa.constants.FileConstants;

public class ConfigReader {
	
	public static Properties readConfigPropertiesFile(){
		FileInputStream inStream = null; 
		Properties prop = new Properties();
		try{
			inStream =  new FileInputStream(FileConstants.getConfigFile());
			prop.load(inStream);	
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		return prop;
	}

}
