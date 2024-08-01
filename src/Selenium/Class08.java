package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class08 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(1000);
		 WebElement un=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		 un.sendKeys("Admin");
		 
		 WebElement pw=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		 pw.sendKeys("admin123");
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src =ts.getScreenshotAs(OutputType.FILE); 
		 File dest=new File("C:\\Users\\win10\\Desktop\\Selenium\\screen.png");
		 FileUtils.copyFile(src, dest);
		 
		 WebElement log=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		 log.click();
		 
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
	}

}
