package testingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	public static WebDriver driver;

	@BeforeClass
	public void launchbrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(2000);
		
	}
	
	@BeforeMethod
	public void login() {
		driver.get("http://testfire.net/login.jsp");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234"); 
		driver.findElement(By.name("btnSubmit")).click();
	}

	@Test
	public void createFirstTest() throws InterruptedException {
		driver.findElement(By.id("LinkHeader2")).click();
		driver.findElement(By.xpath("//h2[1]/child::a")).click();
		Thread.sleep(2000);
	}

	@Test
	public void createSecondTest() throws InterruptedException {

		driver.findElement(By.id("LinkHeader2")).click();
		driver.findElement(By.xpath("//h2[2]/child::a")).click();
		Thread.sleep(2000);
	}

	@Test
	public void createThirdTest() throws InterruptedException {

		driver.findElement(By.id("LinkHeader2")).click();
		driver.findElement(By.xpath("//h2[3]/child::a")).click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void logOut() throws InterruptedException {
		driver.findElement(By.id("LoginLink")).click();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
}
