package GTC001.GTC001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://testfire.net/login.jsp");
		Thread.sleep(1000);
//		driver.findElement(By.id("uid")).sendKeys("jsmith");
		
		driver.findElement(By.xpath("//input[@id='uid']")).sendKeys("jsmith");
		
		driver.findElement(By.name("passw")).sendKeys("demo1234");
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Transfer Funds")).click();
		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("hcl-software.com")).click();
		
		driver.findElement(By.partialLinkText("View Recent Transactions")).click();
		
		driver.findElement(By.partialLinkText("Contact Us")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.tagName("img")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("subheader")).click();
		Thread.sleep(1000);
		
//		driver.close();

	}

}
