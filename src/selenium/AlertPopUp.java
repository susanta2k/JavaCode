package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\MyWorkSheet\\Tools\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
						
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			
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
			
			
//			driver.findElement(By.className("rd_logout")).click();
			
			driver.quit();
		}

}
