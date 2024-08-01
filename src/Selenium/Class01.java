package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Class01
{
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver ","C:\\Users\\win10\\Downloads\\chromedriver-win64\\chromedriver.exe ");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com"); 
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
	}
	
}
