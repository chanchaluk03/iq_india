package pageFactoryinTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver Driver;
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="uid")
	WebElement username;
	
	@FindBy(id="passw")
	WebElement password;
	
	@FindBy(name="btnSubmit")
	WebElement submitbutton;

	public void EnterUserName() {
		username.sendKeys("jsmith");
		
	}
	
	public void EnterPassword() {
		password.sendKeys("demo1234");
	}
	
	public void Submit() {
		submitbutton.click();
	}
}
