package org.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.util.WebBrowser;

public class WorkingOnDropDown {
	WebDriver driver;
	
	@BeforeClass
	public void openPage() {
		driver = WebBrowser.openBrowser("https:demoqa.com/select-menu");
	}

	@Test
	public void selectItemByValue() {
		boolean flag = false;
//		WebDriver driver = WebBrowser.openBrowser("https:demoqa.com/select-menu");

		WebElement dd = driver.findElement(By.id("oldSelectMenu"));
		Select ddcolors = new Select(dd);

		List<WebElement> options = ddcolors.getOptions();
		for (WebElement op : options) {
			if (op.getAttribute("value").equals("4")) {
				ddcolors.selectByValue("4");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("1: Incorrect option sent!!");
		}
	}

	@Test
	public void selectItemByText() {
		boolean flag = false;
//		WebDriver driver = WebBrowser.openBrowser("https://demoqa.com/select-menu");

		Select ddcolors = new Select(driver.findElement(By.id("oldSelectMenu")));

		List<WebElement> options = ddcolors.getOptions();
		for (WebElement op : options) {
			if (op.getText().equals("Purple")) {
				ddcolors.selectByVisibleText("Purple");
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("2: Incorrect option sent!!");
		}
	}
	
	@Test
	public void multiSelect() {
		Select dropDownCars = new Select(driver.findElement(By.id("cars")));
		
		dropDownCars.selectByVisibleText("Audi");
		dropDownCars.selectByValue("saab");
		dropDownCars.selectByValue("volvo");
		dropDownCars.deselectByValue("saab");
	}

	@AfterClass
	public void closeChrome() throws InterruptedException {
//		driver.quit();
	}

}
