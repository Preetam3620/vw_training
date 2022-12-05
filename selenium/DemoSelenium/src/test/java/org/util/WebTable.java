package org.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable {

	public static List<String> getRowData(WebDriver driver, By locator, int rownum)
	{
		List<String> data = new ArrayList<>();
		WebElement table = driver.findElement(locator);
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		WebElement row = rows.get(rownum-1);
		
		List<WebElement> cells = row.findElements(By.tagName("td"));
		for(WebElement cell : cells)
		{
			data.add(cell.getText());
		}
		return data;
		
	}
	
	public static String getCellData(WebDriver driver, By locator, int rownum, int colno)
	{
		WebElement table = driver.findElement(locator);
		List<WebElement> rows = table.findElements(By.tagName("tr"));		
		WebElement row = rows.get(rownum-1);
		
		List<WebElement> cells = row.findElements(By.tagName("td"));
		WebElement cell = cells.get(colno-1);
		
		return cell.getText();
	}
}
