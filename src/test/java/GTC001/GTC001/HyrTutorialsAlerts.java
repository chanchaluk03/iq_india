package GTC001.GTC001;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrTutorialsAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		
//		click on a alert box and print popup box output--------------
		
		
//		driver.findElement(By.xpath("//div[contains(text(),'an alert box')]/child::button")).click();
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(5000);
//		al.accept();
//		WebElement out = driver.findElement(By.xpath("//div[@id='output']"));
//		String str = out.getText();
//		System.out.println(str);
		
		
//		click on a confirm box and print popup box output.-------------
		
		
//		driver.findElement(By.xpath("//div[contains(text(),'confirm box')]/child::button")).click();
//		Alert alr = driver.switchTo().alert();
//		Thread.sleep(5000);
//		alr.dismiss();
//		WebElement output = driver.findElement(By.xpath("//div[@id='output']"));
//		String str = output.getText();
//		System.out.println(str);
		
		
//		click on a prompt box and print popup box output---------------
		
		
//		driver.findElement(By.xpath("//div[contains(text(),'prompt box')]/button")).click();
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(2000);
//		al.sendKeys("chanchal");
//		Thread.sleep(5000);
//		al.accept();
//		
//		WebElement out = driver.findElement(By.xpath("//div[@id='output']"));
//		String str = out.getText();
//		System.out.println(str);
//		driver.quit();
		
		
	
		

		

	}

}
