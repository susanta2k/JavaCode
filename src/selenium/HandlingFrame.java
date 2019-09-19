package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\MyWorkSheet\\Tools\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
					
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("susanta2k");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Contacts']"));
		
		driver.quit();
	}
}
