package pageFactoryinTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public WebDriver driver;
	public LoginPage login;
	@Test
	public void AppTest() {
	WebDriverManager.chromedriver().setup();	
	driver = new ChromeDriver();
	driver.get("http://testfire.net/login.jsp");
	driver.manage().window().maximize();
	
	login = new LoginPage(driver);
	
	login.EnterUserName();
	login.EnterPassword();
	login.Submit();
	
	driver.close();
}

}
