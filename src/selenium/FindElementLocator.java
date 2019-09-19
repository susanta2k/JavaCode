package selenium;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementLocator {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\MyWorkSheet\\Tools\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
						
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			//Find element by linkText -  It is useful for selecting any link
			driver.findElement(By.linkText("register")).click();
			
			//Find element by id
			driver.findElement(By.id("firstname")).sendKeys("susanta");
			
			//Find element by cssSelector
//			driver.findElement(By.cssSelector("firstname")).sendKeys("susanta");
			
			//Find element by class name is not useful as it can be duplicate
//			driver.findElement(By.className("fld wide wide fld regular-text bold-text float-box")).sendKeys("susanta");
			
			//Find element by partiallinkText is not useful 
//			driver.findElement(By.partialLinkText("firstname")).sendKeys("susanta");
			
			//Find element by name
//			driver.findElement(By.name("username")).sendKeys("susanta2k");
//			driver.findElement(By.name("password")).sendKeys("password123");
			
			//Find element by xpath
//			driver.findElement(By.xpath("//input[@type = 'submit']")).click();
//			driver.findElement(By.xpath("//input[@type = 'submit'and @value = 'Login']")).click();
			
			

			driver.quit();
						
			}
			
			
		}


