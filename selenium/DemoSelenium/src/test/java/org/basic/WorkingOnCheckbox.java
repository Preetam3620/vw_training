package org.basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.util.WebBrowser;

public class WorkingOnCheckbox {
	@Test
	public void selectCheckBox() {
		WebDriver driver = WebBrowser.openBrowser("https://demoqa.com/checkbox");
		WebElement chkbox = driver.findElement(By.className("rct-checkbox"));
		if (!chkbox.isSelected()) {
			chkbox.click();// check previously unchecked checkboxf
		}
	}
}
