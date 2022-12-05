package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;
import packageExtensions.EmployeeLogin;
import packageExtensions.Login;

public class SetUp {
	static WebDriver driver;
	static Login login;
	static EmployeeLogin elogin;
	@BeforeAll
	public static void before_all() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx");
		login = new Login(driver);
		elogin = new EmployeeLogin(driver);
		
	}
	
	public static Login login() {
		return login;
	}
	
	public static EmployeeLogin elogin() {
		return elogin;
	}
	
	@AfterAll
	public static void after_all() {
//		driver.close();
	}
}
