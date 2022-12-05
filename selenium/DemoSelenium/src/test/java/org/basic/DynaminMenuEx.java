package org.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.util.WebBrowser;

public class DynaminMenuEx {
	
	@Test
	public void selectMenu()
	{
		WebDriver driver = WebBrowser.openBrowser("https://demo.automationtesting.in/Register.html");
		Actions builder = new Actions(driver);
		//
		
		List<WebElement> menus = driver.findElements(By.cssSelector("li.dropdown > a"));
		for(WebElement m: menus)
		{
			if(m.getText().equals("SwitchTo"))
			{
				builder.moveToElement(m).perform();
				break;
			}
		}
		
		List<WebElement> submenus = driver.findElements(By.cssSelector("ul.dropdown-menu > li> a"));
		for(WebElement sm: submenus)
		{
			if(sm.getText().equals("Windows"))
			{
				sm.click();
				break;
			}
		}
	}

}
