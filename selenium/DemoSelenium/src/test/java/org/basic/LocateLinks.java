package org.basic;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.util.WebBrowser;

public class LocateLinks {
	WebDriver driver;

	@BeforeClass
	public void openPage() {
		driver = WebBrowser.openBrowser("https://www.google.com/");
	}
	
	@Test
	public void images() {
		driver.findElement(By.linkText("Images")).click();
		String actTitle = WebBrowser.getTitle(driver);
		assertEquals(actTitle.trim(), "Google Images");
		driver.navigate().back();
	}
	
	@Test 
	public void advertising() {
		driver.findElement(By.linkText("Advertising")).click();
		assertEquals(WebBrowser.getTitle(driver).trim(), "Get More Customers With Easy Online Advertising | Google Ads");
		driver.navigate().back();
	}
	
	@Test
	public void search() {
		driver.findElement(By.partialLinkText("Search")).click();
		String actTitle = WebBrowser.getTitle(driver);
		assertEquals(actTitle.trim(), "Google Search – Discover how Google Search works");
		driver.navigate().back();
	}
}
