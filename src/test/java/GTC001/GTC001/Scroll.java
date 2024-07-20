package GTC001.GTC001;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
//		driver.get("https://www.hyrtutorials.com/");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollTo(0,1900)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)"); 
//		driver.findElement(By.xpath("//a[@class='back-to-top']")).click();
		
		
//		Scroll height use for know page height-JS code---(document.body.scrollHeight)----
		
//		driver.get("https://www.hyrtutorials.com/");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(2000);
		WebElement we =driver.findElement(By.xpath("//a[text()='Yada Giri Reddy ']"));
		js.executeScript("arguments[0].scrollIntoView()", we);
		we.click();
		
	}
}
