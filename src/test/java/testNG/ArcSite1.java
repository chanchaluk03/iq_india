package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class ArcSite1 {
	WebDriver driver = new ChromeDriver();

	 
  public void launchsite() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://app.arcfacilities.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("UserID")).sendKeys("qatest-interview@yopmail.com");
	  driver.findElement(By.id("Password")).sendKeys("QATest@n");
	  driver.findElement(By.id("btnLogin")).click();
  }
  
  public void clickicon() throws InterruptedException {
	  
	  WebElement frm = driver.findElement(By.id("myFrameSPA"));
	  driver.switchTo().frame(frm);
	  Thread.sleep(2000);  
	  driver.findElement(By.xpath("//h4[text()=' O&M documentation ']")).click();
  }
  
  public void clickadd() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[text()='See all']")).click();
	  
//	  WebElement frm2 = driver.findElement(By.xpath("//iframe[@id='myFrame']"));
//	  driver.switchTo().frame(frm2);
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//button[@class='btn asset-btn-primary']")).click();
  }
  
  
}
