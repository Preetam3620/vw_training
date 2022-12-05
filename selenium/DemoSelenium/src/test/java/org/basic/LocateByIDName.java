package org.basic;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import org.util.WebBrowser;
public class LocateByIDName {
	
	@Test
	public void invalidLogin() {
		String expErr = "Invalid Username/Passwrd";
		
		WebDriver driver = WebBrowser.openBrowser("https://www.echotrak.com/Login.aspx?ReturnUrl=%2fLoginEmp.aspx");
	
		
		WebElement username = driver.findElement(By.id("txtCustomerID"));
		username.sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin@12");
		driver.findElement(By.name("Butsub")).click();

		WebElement labelError = driver.findElement(By.id("lblMsg"));
		String actError = labelError.getText();
		
		assertEquals(actError, expErr);
	}
}
