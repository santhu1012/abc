package com.commomIQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider 
{
	public static WebDriver driver;
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\imp_IQ\\library\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		 driver.get("http://jqueryui.com/slider/");
	        driver.switchTo().frame(0); //need to switch to this frame before clicking the slider
	        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
	        Actions move = new Actions(driver);
	        Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
	        action.perform();
	}
	
}
