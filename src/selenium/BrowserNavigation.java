package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\MyWorkSheet\\Tools\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
					
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();

	}

}
