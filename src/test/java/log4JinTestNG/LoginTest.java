package log4JinTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;
	
	public Logger log = LogManager.getLogger("LoginTest.class");
	
	
	/* Logger is an interface and we create an instance (log) of Logger interface
	and LogManager is an class and getLogger its static method 
	same as like we use WebDriver driver = new ChromeDriver() */
	
	@Test
	public void siteTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize(); 

		driver.get("http://testfire.net/login.jsp");
		Thread.sleep(1000);
		
		log.info("Application launched"); /*iska mtbl ki humara code yha tak run ho gya hai sahi se*/

		driver.findElement(By.id("uid")).sendKeys("jsmith");
		WebElement pass = driver.findElement(By.id("passw"));
		pass.sendKeys("demo1234"); 
		log.info("user enter login and password");
		
		driver.findElement(By.name("btnSubmit")).click();
		log.info("page submitted");
		
		


		WebElement signoff = driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")); 
		if(signoff.isDisplayed())
		{
			log.info("user logine successfully");
		}
		else
		{
			log.info("unable to login");
		}
		driver.close();
		
		log.info("browser closed");
	}
}
