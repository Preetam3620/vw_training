package org.assignments;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.util.WebBrowser;

public class TablesAssignment {
	
	@Test
	public void findAndVerify() {
		int rowno = 1;
		String company = "Amazon";
		WebDriver driver = WebBrowser.openBrowser("https://www.techlistic.com/p/demo-selenium-practice.html");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));

		for (WebElement row : rows) {
			if (row.getText().equals(company)) {
				break;
			}
			rowno++;
		}
		rowno++;

		String data = "Amazon;Giovanni Rovelli;Italy";
		List<String> expectedData = Arrays.asList(data.split(";"));
		List<String> actualData = new ArrayList<>();

		List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + rowno + "]/td"));
		for (WebElement cell : rowData) {
			actualData.add(cell.getText());
		}

		assertEquals(actualData, expectedData);
	}

}
