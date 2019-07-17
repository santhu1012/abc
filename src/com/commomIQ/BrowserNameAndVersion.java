package com.commomIQ;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserNameAndVersion
{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\imp_IQ\\library\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	/*	driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	*/	
		Capabilities cap = ((RemoteWebDriver)driver).getCapabilities();
		
		String browserName = cap.getBrowserName().toLowerCase();
		
		System.out.println(browserName);
		
		String os = cap.getPlatform().toString();
		System.out.println(os);
		
		String v = cap.getVersion().toString();
				
				System.out.println(v);


	}

}
