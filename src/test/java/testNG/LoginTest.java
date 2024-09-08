package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	@BeforeTest
	public void site() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  js = (JavascriptExecutor)driver;
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.manage().window().maximize();
	}
  @Test
  public void applogin() throws InterruptedException {
	
	  driver.get("http://testfire.net/login.jsp");

	  driver.findElement(By.id("uid")).sendKeys("jsmith");
	  WebElement pass = driver.findElement(By.id("passw"));
	  js.executeScript("arguments[0].value='demo1234'",pass);
	  driver.findElement(By.name("btnSubmit")).click();
	  System.out.println("user login successfully");
  }
  @Test
  public void verifylogin() {
	WebElement signoff = driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")); 
	if(signoff.isDisplayed())
	{
		System.out.println("user logine successfully");
	}
	else
	{
		System.out.println("unable to login");
	}
  }
  @AfterTest
  public void drclose() {
	  driver.close();
	  
  }
}
