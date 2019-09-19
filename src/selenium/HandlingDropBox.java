package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\MyWorkSheet\\Tools\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
					
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		//Handling drop box	
		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Art");
				
		
		driver.quit();
	}
}
