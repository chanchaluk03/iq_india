package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {
	public static WebDriver driver = new ChromeDriver();
  @Test
  public void hrm() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }
  
  @Test
  public void login() throws InterruptedException {
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("(//input[@placeholder='Username'])")).sendKeys("Admin");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("admin123");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(2000);
  }
  
//  @Test
//  public void clickmyinfo() throws InterruptedException {
//	  
//	  driver.findElement(By.xpath("//aside[@class='oxd-sidepanel']/descendant::span[6]")).click();
//	  Thread.sleep(2000);
//  }
  
//  @Test
//  public void confirmlogin()
//  {
//	  System.out.println(driver.findElement(By.xpath("//h6[text()='mandaMock userOliveira']")).isDisplayed());
//	  driver.quit();
//  }
	
  @Test
  public void youtube() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//div[@id='search-input']/input[@id='search']")).sendKeys("hare krishna");
		driver.findElement(By.id("search-icon-legacy")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
  }
  
  
  @Test
  public void wiki() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("searchInput")).sendKeys("Indian army");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
  }
  
}
