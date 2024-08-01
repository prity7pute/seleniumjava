package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver ","C:\\Users\\win10\\Downloads\\chromedriver-win64\\chromedriver.exe ");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		 Thread.sleep(1000);
			WebElement alertok=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
			alertok.click();
		 Alert a=driver.switchTo().alert();
		 a.accept();
		 
		 WebElement alertokcancel=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
			alertokcancel.click();
		 
		 WebElement alertcancel=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			alertcancel.click();
			a.dismiss();
			
			WebElement alerttextbox=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
			alerttextbox.click();
		 	WebElement alerttext=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
			alerttext.click();
			a.sendKeys("Preeti");
			a.accept();
	}

}
