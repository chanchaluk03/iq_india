package GTC001.GTC001;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrTutorialsWaits {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//			 implicit wait for applicable for all objects --------
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		driver.findElement(By.id("btn1")).click();
//		
//		driver.findElement(By.id("txt1")).sendKeys("chanchal");
//		
//		driver.findElement(By.id("btn2")).click();
//		driver.findElement(By.id("txt2")).sendKeys("singh");
		
//			print Entered text in textfield---------		 
		
//		String we = driver.findElement(By.id("txt1")).getAttribute("value");
//		System.out.println(we);
		
		
		
//		WebDriver wait -----------------
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		driver.findElement(By.id("btn1")).click();
//		WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
//		we.sendKeys("Wait kro");
//		
//		driver.findElement(By.id("btn2")).click();
//		WebElement web=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt2")));
//		web.sendKeys("or wait kro");
		
		
		
//		Fluent wait-------------------------
		
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
//		.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class)
//		.ignoring(ElementNotInteractableException.class);
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		
//		driver.findElement(By.id("btn1")).click();
//		WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
//		we.sendKeys("text");
//		
//		driver.findElement(By.id("btn2")).click();
//		WebElement web = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
//		web.sendKeys("text again");
		
		
	}

}
