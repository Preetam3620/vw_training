package org.basic;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.util.WebBrowser;

public class WorkingOnRadio {
	
	@Test
	public void selectRadio() throws InterruptedException {
		
		WebDriver driver = WebBrowser.openBrowser("https://echoecho.com/htmlforms10.htm");
		List<WebElement> radios = driver.findElements(By.name("group1"));
		
		WebElement element = driver.findElement(By.className("table5"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
		
		for(WebElement rb: radios) {
			if(rb.getAttribute("value").equals("Milk"))
			{
				rb.click();
				break;
			}
		}
		
		for(WebElement rb: radios) {
			if(rb.getAttribute("value").equals("Cheese"))
			{
				rb.click();
				break;
			}
		}
		
		radios = driver.findElements(By.name("group2"));
		for(WebElement rb: radios) {
			if(rb.getAttribute("value").equals("Beer"))
			{
				rb.click();
				break;
			}
		}
		
	}
}
