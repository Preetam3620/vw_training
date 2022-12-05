package packageExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	// Page properties
	WebDriver driver;

	@FindBy(id="txtCustomerID")
	private WebElement txtusername;
	@FindBy(id="txtPassword")
	private WebElement txtpassword;
	@FindBy(id="Butsub")
	private WebElement btsignin;
	@FindBy(linkText = "Echo Employee Login")
	private WebElement lnkemplogin;
	@FindBy(css = "div.container-fluid>div>div>h4")
	private WebElement lblheading;
	@FindBy(id="lblMsg")
	private WebElement lblerror;

	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// page behaviour
	public void login(String username, String password) {
		 txtusername.sendKeys(username);
		 txtpassword.sendKeys(password);
		 btsignin.click();
	 }
	
	public void navigateEmployee() {
		lnkemplogin.click();
	}
	
	public String getPageHeading() {
		return lblheading.getText();				
	}
	
	public String getError() {
		return lblerror.getText();
	}
	
	public void clearData() {
		txtusername.clear();
		txtpassword.clear();
	}
}
