package com.qa.utils;

import java.io.File;

public class FileUtils {
	
	public static void createDirectory(String dir){
		File f = new File(dir);
		if(!f.exists()){
			f.mkdirs();
		}
	}
	
	public static void deleteDirectory(String dir){
		File f = new File(dir);
		if(f.exists()){
			f.deleteOnExit();
		}
	}

}
