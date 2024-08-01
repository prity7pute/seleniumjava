package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class05 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		 
		 Thread.sleep(5000);
			WebElement img1=driver.findElement(By.xpath("//img[alt=\"The peaks of High Tatras\"]"));
			WebElement trash=driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-state-default ui-droppable\"]"));
		     Actions a=new Actions(driver);
		     a.dragAndDrop(img1, trash).perform();
			

	}

}
 