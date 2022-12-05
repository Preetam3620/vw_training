package org.basic;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.util.WebBrowser;
import org.util.WebTable;

public class WorkingOnTable {

	@Test
	public void getTableData() {

		WebDriver driver = WebBrowser.openBrowser("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement table = driver.findElement(By.id("customers"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement r : rows) 
		{
			List<WebElement> cells = r.findElements(By.tagName("td"));
			for (WebElement c : cells) 
			{
				System.out.println(c.getText());
			}
		}

		driver.close();
	}
	
	@Test
	public void verfiyTableData() {
		
		int rowNo = 2;
		int colNo = 2;
		String expData = "Maria Anders";
		WebDriver driver = WebBrowser.openBrowser("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		String actData = WebTable.getCellData(driver, By.id("customers"), rowNo, colNo);
		assertEquals(actData, expData);
		
		String expRowData = "Google:Maria Anders: Germany";
		List<String> expRData = Arrays.asList(expRowData.split(";"));
		List<String> actRData = WebTable.getRowData(driver, By.id("customers"), rowNo);
		
		assertEquals(actRData, expRData);
		driver.close();
	}

}
