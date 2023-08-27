package com.crm.qa.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class kanha {
	
	public static void main(String[] args) throws IOException {
		 
			 
		Properties prop=new Properties();
			 
		System.out.println("dajl;ksj");
		
			 FileInputStream fs=new FileInputStream("C:\\Users\\biswa\\Downloads\\framework\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			 
			 System.out.println(System.getProperty("user.dir"));
			 
			 prop.load(fs);
			 
			 System.out.println(prop.getProperty("username"));
			 
		 
	}

}
