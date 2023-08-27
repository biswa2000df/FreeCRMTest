package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.utils.TestUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
public	static Properties prop;
public	static WebDriver driver;



	
	 public TestBase() throws IOException {
		 
		 prop=new Properties();
		 
		 FileInputStream fs=new FileInputStream("C:\\Users\\biswa\\Downloads\\framework\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		 
		 prop.load(fs);
		 
	 }
	
	 
	 public static void initialization() {
		 
		 System.out.println("2");
		 
		 String browserName=prop.getProperty("browser");
		 
		 
		 System.out.println(browserName);
		 
		 if(browserName.equals("chrome")) {
			 
			 WebDriverManager.chromedriver().setup();
			 
			
			 
			 ChromeOptions option=new ChromeOptions();
			 option.addArguments("--remote-allow-origins=*");
			 
			 driver=new ChromeDriver(option);
		 }
		 
		 else if(browserName.equals("FF"))
		 {
			 
			 WebDriverManager.firefoxdriver().setup();
			 
			 driver=new FirefoxDriver();
			 
		 }
		 
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LODE_TIMEOUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		 
		 driver.get(prop.getProperty("url"));
		 
		 
		 
		 
	 }
	
	
	
	
	

}
