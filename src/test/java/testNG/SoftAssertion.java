package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static SoftAssert soft = new SoftAssert();
	@BeforeTest
	public void website() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  js = (JavascriptExecutor)driver;
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.manage().window().maximize();
	}
	@Test
	public void incorrectlogin() {
		driver.get("http://testfire.net/login.jsp");

//			with incorrect username--------
		
		  driver.findElement(By.id("uid")).sendKeys("smith");
		  WebElement pass = driver.findElement(By.id("passw"));
		  js.executeScript("arguments[0].value='demo1234'",pass);
		  driver.findElement(By.name("btnSubmitn")).click();
		  
		  
		  String actualUrl = driver.getCurrentUrl();
		  String expectedUrl = "http://testfire.net/bank/main.jsp";
		  
		  soft.assertSame(actualUrl, expectedUrl, "User not login please check url");
		  
		  
//		  with incorrect password--------
		  
		  driver.findElement(By.id("uid")).sendKeys("Jsmith");
		  WebElement pas = driver.findElement(By.id("passw"));
		  js.executeScript("arguments[0].value='demo12345'",pas);
		  driver.findElement(By.name("btnSubmitk")).click();
		  
		  soft.assertTrue(false, "Incorrect Password");
		  
//		  with incorrect button--------
		  
		  driver.findElement(By.id("uid")).sendKeys("Jsmith");
		  WebElement passs = driver.findElement(By.id("passw"));
		  js.executeScript("arguments[0].value='demo1234494'",passs);
		  driver.findElement(By.name("btnSubmit")).click();
		  
		  soft.assertTrue(false, "button not found");
		  
		  
	}
	
	
  @Test
  public void currectlogin() throws InterruptedException {
	  driver.get("http://testfire.net/login.jsp");

	  driver.findElement(By.id("uid")).sendKeys("jsmith");
	  WebElement pass = driver.findElement(By.id("passw"));
	  js.executeScript("arguments[0].value='demo1234'",pass);
	  driver.findElement(By.name("btnSubmit")).click();
	  
	  Assert.assertTrue(true, "user login successfully");
  }
  
  @Test
  public void verifylogin() {
	  String expected = "Altoro Mutual";
	  
	String actual = driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")).getText();

	soft.assertEquals(actual, expected, "user not login");
	
	soft.assertAll();
  }
  
  @Test
  public void account() {
	 driver.findElement(By.id("btnGetAccount")).click();
	  
  }
//  @Test(dependsOnMethods = "account")
//  public void verifyaccount() {
//	  boolean c = driver.findElement(By.xpath("//h1[text()='Account History - 800002 Savings']")).isDisplayed();
//	  soft.assertTrue(c, "Account verification failed");
//	  
//	  soft.assertAll();
//  }
  @AfterTest
  public void siteclose() throws InterruptedException{
		  driver.close();   
  }
}
