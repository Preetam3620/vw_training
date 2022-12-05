package packageExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeLogin {
	@FindBy(id = "ctl00_contentPlaceHolder_txtCustomerID")
	private WebElement txtusername;
	@FindBy(id = "ctl00_contentPlaceHolder_txtPassword")
	private WebElement txtpassword;
	@FindBy(id = "ctl00_contentPlaceHolder_Butsub")
	private WebElement btnlogin;
	@FindBy(id = "ctl00_contentPlaceHolder_lblMsg")
	private WebElement lblerror;
	@FindBy(xpath = "//*[@id=\"ctl00_Head1\"]/title")
	private WebElement lblheading;
	
	public EmployeeLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void empLogin(String username, String password) {
		txtusername.sendKeys(username);
		txtpassword.sendKeys(password);
		btnlogin.click();
	}
	
	public String getError() {
		return lblerror.getText();
	}
		
	public void clearData() {
		txtusername.clear();
		txtpassword.clear();
	}
	
	public String getPageHeading() {
		return lblheading.getText();				
	}
}
