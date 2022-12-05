package org.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.util.WebBrowser;

public class DemoSynchronize {

	@Test
	public void selectSearchResult() {
	WebDriver driver = WebBrowser.openBrowser("https://www.google.co.in");
	driver.findElement(By.name("q")).sendKeys("a");

	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.pcTkSc>div>span")));
	driver.findElement(By.cssSelector("div.pcTkSc>div>span")).click();

	}
}
// div > div.pcTkSc > div.wM6W7d