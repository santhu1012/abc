package com.commomIQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class HalfebayTest 
{
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\imp_IQ\\library\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.get("http://jqueryui.com/slider/");
	}

}
