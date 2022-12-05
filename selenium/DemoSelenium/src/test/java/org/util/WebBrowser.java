package org.util;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class WebBrowser {
	public static WebDriver openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	public static String getTitle(WebDriver driver) {
		return driver.getTitle();
	}
}
