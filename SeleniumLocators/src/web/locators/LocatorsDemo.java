package web.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// Set The Path for browser Drivers

		System.setProperty("webdriver.chrome.driver",
				"C:\\Babu Reddy\\Java_selenium\\Selenium_Softwares\\chromeDriver.exe");
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\BabuReddy\\Java_selenium\\Selenium_Softwares\\geckodriver.exe");

		// To Configure Respective Browsers
		// WebDriver c_Driver = new ChromeDriver();
		WebDriver f_Driver = new FirefoxDriver();

		// to Open Base Url
		// c_Driver.get("https://www.google.com");
		f_Driver.get("https://www.youtube.com");

		// Navigate Method
		/*
		 * String url = "https://youtube.com";
		 * c_Driver.navigate().to("https://www.gmail.com");
		 * c_Driver.manage().window().maximize();
		 * c_Driver.manage().window().fullscreen(); c_Driver.navigate().back();
		 * c_Driver.navigate().forward(); c_Driver.navigate().to(url);
		 * c_Driver.navigate().to("https://in.yahoo.com/?p=us");
		 * c_Driver.navigate().refresh();
		 */

		// To Submit query in Google Search. By using findElement() Method
		/*
		 * WebElement searchRes = c_Driver.findElement(By.name("q"));
		 * searchRes.sendKeys("life of testing engineer"); searchRes.submit();
		 */

		// List<WebElement> list = f_Driver.findElement("");

	}

}
