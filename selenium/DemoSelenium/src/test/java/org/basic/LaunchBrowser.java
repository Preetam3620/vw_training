package org.basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LaunchBrowser {

	@Test
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        String title = driver.getTitle();
        System.out.println("Title of the page :"+title);
        driver.close();
    }
}
