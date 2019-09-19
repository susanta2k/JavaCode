package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\MyWorkSheet\\Tools\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
					
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Different customize xpath
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shirt");
//		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shirt");
//		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("shirt");
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for anything')]")).sendKeys("shirt");
		
		//Dynamic xpath when element id will be keep changing
		
//		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("shirt");
//		driver.findElement(By.xpath("//input[starts-with(@id,'gh-')]")).sendKeys("shirt");
		driver.findElement(By.xpath("//input[ends-with(@id,'-ac')]")).sendKeys("shirt");
		
//		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("shirt");
//		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search for ')]")).sendKeys("shirt");
//		driver.findElement(By.xpath("//input[ends-with(@placeholder,'anything')]")).sendKeys("shirt");
		
	}

}
