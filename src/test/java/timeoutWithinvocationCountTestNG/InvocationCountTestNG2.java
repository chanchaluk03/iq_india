package timeoutWithinvocationCountTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCountTestNG2 {
	WebDriver driver;

	@BeforeMethod

	public void check() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		SoftAssert soft = new SoftAssert();

		driver.get("http://testfire.net/login.jsp");
	}
	@Test(invocationCount=3)
	public void site() {

		driver.findElement(By.xpath("//input[@id='uid']")).sendKeys("jsmith");
		driver.findElement(By.name("passw")).sendKeys("demo1234");
		driver.findElement(By.name("btnSubmit")).click();

		boolean b = driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
		Assert.assertEquals(b, true,"user not login");
	}


	@AfterMethod
	public void teardown() {
		//		if(driver!=null) {
		//			driver.quit();
		//		}
		driver.quit();

	}
}
