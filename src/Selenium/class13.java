package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class13 {
	 WebDriver driver=new ChromeDriver();
	 String driverPath = "C:\\Users\\win10\\Downloads\\chromedriver-win64\\chromedriver.exe";  
	 
	 void navigate() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 }
   void login(String a,String b) throws InterruptedException {
	   Thread.sleep(1000);
	   WebElement un=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
	   un.sendKeys(a);
	   
	   WebElement pw=driver.findElement(By.xpath("//input[@type=\"password\"]"));
	   pw.sendKeys(b);
}
   void login() {
   //WebElement log=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	// log.click();
	 
}
