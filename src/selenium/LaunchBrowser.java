package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
	
	//Launching Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\MyWorkSheet\\Tools\\Drivers\\chromedriver.exe");
//	System.setProperty("webdriver.gecko.driver", "D:\\MyWorkSheet\\Automation\\SeleniumDrivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// Printing page Title
		String title = driver.getTitle();
		System.out.println(title);
		//Printing Current URL
		String cURL = driver.getCurrentUrl();
		System.out.println(cURL);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
//		driver.findElement(By.id("login1")).sendKeys("sksahoo2019");
//		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.name("proceed")).click();
		
		// Handling java script alert in web page
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		if (text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct alert");
		}else
		{
			System.out.println("Incorrect alert");
		}
		alert.accept();		
		
		
//		driver.findElement(By.className("rd_logout")).click();
		
		driver.quit();
	}

}
