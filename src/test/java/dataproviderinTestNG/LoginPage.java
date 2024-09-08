package dataproviderinTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static WebDriver driver;
	
		@Test(dataProvider = "chanchal",dataProviderClass = LoginPageDataprovider.class)
		
		//define username and password under method-----
		public void dataTest(String username,String Pass) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		SoftAssert soft = new SoftAssert();
		
		driver.get("http://testfire.net/login.jsp");
		
		// input username and password using dataProvider---------
		
		
		driver.findElement(By.xpath("//input[@id='uid']")).sendKeys(username);
		driver.findElement(By.name("passw")).sendKeys(Pass);
		driver.findElement(By.name("btnSubmit")).click();
		
		boolean b = driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
		Assert.assertEquals(b, true,"user not login");
		
		
//		String expected = "Altoro Mutual";
//		
//		String actual = driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")).getText();
//		
//		soft.assertEquals(actual, expected, "user not login");
		
		driver.close();
	}
}
