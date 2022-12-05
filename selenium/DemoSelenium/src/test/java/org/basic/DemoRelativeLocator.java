package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;
import org.util.WebBrowser;

public class DemoRelativeLocator {
	
	@Test
	public void filterProduct() throws InterruptedException {
		WebDriver driver = WebBrowser.openBrowser("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Handbags");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement checkBrand = driver.findElement(RelativeLocator.
				with(By.xpath("//input[@type='checkbox']")).toLeftOf(By.xpath("//span[text()='Lavie']")));
		
		js.executeScript("arguments[0].click()", checkBrand);
	}

}
