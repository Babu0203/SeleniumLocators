package web.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import okio.Timeout;

public class LocatorWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Babu Reddy\\Java_selenium\\Selenium_Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		WebDriverWait eWait = new WebDriverWait(driver, 20, 5);
		eWait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]"))));
		
	}

}
