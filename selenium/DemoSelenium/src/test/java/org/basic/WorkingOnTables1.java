package org.basic;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.util.WebBrowser;
import org.testng.annotations.Test;

public class WorkingOnTables1 {

	@Test
	public void verifyRowData() {
		int rowno = 3;
		String data = "Meta;Francisco Chang;Mexico";
		List<String> expectedData = Arrays.asList(data.split(";"));
		List<String> actualData = new ArrayList<>();

		WebDriver driver = WebBrowser.openBrowser("https://www.techlistic.com/p/demo-selenium-practice.html");
		// All table cells //table[@id='customers']/tbody/tr/td
		// row data - //table[@id='customers']/tbody/tr[3]/td

		List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + rowno + "]/td"));
		for (WebElement cell : rowData) {
			actualData.add(cell.getText());
		}

		assertEquals(actualData, expectedData);
	}

	@Test
	public void verifyCellData() {
		int rowno = 3;
		int colno = 3;
		String expectedData = "Mexico";

		WebDriver driver = WebBrowser.openBrowser("https://www.techlistic.com/p/demo-selenium-practice.html");
		// Cell data = ////table[@id='customers']/tbody/tr[3]/td[3]

		WebElement cell = driver
				.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + rowno + "]/td[" + colno + "]"));
		String actualData = cell.getText();
		assertEquals(actualData, expectedData);
	}

}
