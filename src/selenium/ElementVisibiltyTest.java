package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibiltyTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\MyWorkSheet\\Tools\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
					
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//isDisplayed method is used to check whether that particular element is present on the web page or not.
		boolean b = driver.findElement(By.id("loginbutton")).isDisplayed();
		System.out.println(b);
		
		//isEnabled method is used to check whether a particular field/button is enabled or not
		boolean b2 = driver.findElement(By.id("loginbutton")).isEnabled();
		System.out.println(b2);
		
		//isSelected method is used to check whether a particular button(radio button/check box/drop down) is selected or not
		driver.findElement(By.id("u_0_9")).click();
		boolean b3 = driver.findElement(By.id("u_0_9")).isSelected();
		System.out.println(b3);
		
		driver.quit();
		
	}

}
