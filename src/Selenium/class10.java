package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver ","C:\\Users\\win10\\Downloads\\chromedriver-win64\\chromedriver.exe ");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 String parentw=driver.getWindowHandle();
	     //System.out.println(Parent);
	     
         WebElement insta=driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		 insta.click();
		 Set<String>allwindow=driver.getWindowHandles();
		 
		// System.out.println("all window");
		 
		 for(String win:allwindow) {
			 if(!(parentw.equals(win))){
				 driver.switchTo().window(win);
			 }
			 
		 }
	     Thread.sleep(1000);
	     WebElement insta1=driver.findElement(By.xpath("//input[@name='username']"));
		 insta1.sendKeys("12345");
	}

}
