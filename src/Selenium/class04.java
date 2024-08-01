package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class class04 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://uncodemy.com/");
		 Thread.sleep(2000);
		WebElement ct=driver.findElement(By.xpath("//span[@id=\"categoriesBtn"));
	     Actions a=new Actions(driver);
		a.moveToElement(ct).perform();
		Thread.sleep(1000);
		WebElement st=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
		a.moveToElement(st).perform();
		
		Thread.sleep(1000);
		WebElement mt=driver.findElement(By.xpath("//a[normalize-space()='Manual Testing'"));
		mt.click();
		}

}
