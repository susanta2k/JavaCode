package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\MyWorkSheet\\Tools\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
					
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='http://www.popuptest.com/popup3.html']")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent Window ID:"+ parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child Window ID:"+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("Child window pop up title:"+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("Parent window title:"+ driver.getTitle());
		
		driver.quit();
	}

}
