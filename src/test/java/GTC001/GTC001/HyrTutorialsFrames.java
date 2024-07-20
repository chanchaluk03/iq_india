package GTC001.GTC001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrTutorialsFrames {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Main page");
		Thread.sleep(3000);		
		
//		to count all frame in current window--------
		
//		int count = driver.findElements(By.tagName("iframe")).size();
//		System.out.println("frames is this window "+count);
		
//		handle frame 1 and work on it-------------
		
		
//		driver.switchTo().frame("frm1");
//		Thread.sleep(3000);
//		
//		WebElement we = driver.findElement(By.xpath("//select[@id='course']"));
//		Select sl = new Select(we);
//		sl.selectByIndex(1);
//		sl.selectByIndex(3);
//		Thread.sleep(3000);
//		
//		driver.switchTo().parentFrame();
//		
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("again main page");
//		Thread.sleep(3000);
//		driver.quit();
		
		
// 		handle frame 2 and work on it ----------------------
		
		
//		driver.switchTo().frame("frm2");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("chanchal");
//		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Singh");
//		Thread.sleep(3000);
//		
//		driver.switchTo().parentFrame();
//		
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Return from frame 2");
//		Thread.sleep(5000);
//		driver.quit();
		
		
//		handle frame 3 and work on it---------------
		// code not working ---
		
//		driver.switchTo().frame("frm3");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("frame 3");
//		Thread.sleep(3000);
//		driver.switchTo().frame("frm1");
//		Thread.sleep(2000);
//		WebElement we = driver.findElement(By.id("course"));
//		Select sl = new Select(we);
//		sl.selectByIndex(1);
//		sl.selectByIndex(3);
//		Thread.sleep(3000);
//		
//		driver.switchTo().frame("frm2");
//		Thread.sleep(3000);
//		driver.findElement(By.id("firstName")).sendKeys("chanchal Singh");
//		driver.findElement(By.id("lastName")).sendKeys("java language");
//		Thread.sleep(3000);
//		
//		driver.switchTo().parentFrame();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Return frame 3");
//		Thread.sleep(1000);
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Return from frame 3");
//		Thread.sleep(3000);
//		driver.quit();
//		

	}

}
