package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertion {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	@BeforeTest
	public void website() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  js = (JavascriptExecutor)driver;
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.manage().window().maximize();
	}
	
  @Test
  public void login() throws InterruptedException {
	  driver.get("http://testfire.net/login.jsp");

	  driver.findElement(By.id("uid")).sendKeys("jsmith");
	  WebElement pass = driver.findElement(By.id("passw"));
	  js.executeScript("arguments[0].value='demo1234'",pass);
	  driver.findElement(By.name("btnSubmit")).click();
  }
  
  @Test
  public void verifylogin() {
	  String expected = "Altoro Mutual";
	  
	String actual = driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")).getText();
//	  String actual = driver.getTitle();
	
//	SoftAssert softAssert = new SoftAssert();
	Assert.assertEquals(actual, expected, "user not login");
  }
  
  @Test(dependsOnMethods = "verifylogin")
  public void account() {
	 driver.findElement(By.id("btnGetAccount")).click();
	  
  }
  @Test(dependsOnMethods = "account")
  public void verifyaccount() {
	  boolean c = driver.findElement(By.xpath("//h1[text()='Account History - 800002 Savings']")).isDisplayed();
	  Assert.assertTrue(c, "Account verification failed");
  }
  @AfterTest
  public void siteclose() throws InterruptedException{
	  
		  driver.close();   
  }
}
