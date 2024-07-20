package actionclass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseControl {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement el =driver.findElement(By.xpath("//span[text()='Electronics']"));
		ac.moveToElement(el).build().perform();
		Thread.sleep(2000);
		WebElement cam =driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
		ac.moveToElement(cam).build().perform();
		Thread.sleep(1000);
		WebElement game = driver.findElement(By.xpath("//a[text()='Gaming']"));
		ac.moveToElement(game).build().perform();
		Thread.sleep(1000);
		WebElement pad = driver.findElement(By.xpath("//a[text()='Gamepads']"));
		ac.click(pad).build().perform();
		String oldid =driver.getWindowHandle();
		WebElement slt = driver.findElement(By.xpath("(//a[text()='SONY PS5 DualSense Wireless Controller Bluetooth  Gamep...'])[1]"));
		ac.click(slt).build().perform();
		Set<String> winid =driver.getWindowHandles();
		
		for(String id : winid)
		{
			if(!id.equals(oldid))
			{
				driver.switchTo().window(id);
				
				Thread.sleep(2000);
				WebElement g1 = driver.findElement(By.xpath("(//div[@class='_0QyAeO'])[1]"));
				ac.moveToElement(g1).build().perform();
				Thread.sleep(1000);
				WebElement g2 = driver.findElement(By.xpath("(//div[@class='_0QyAeO'])[2]"));
				ac.moveToElement(g2).build().perform();
				Thread.sleep(1000);
				WebElement g3 = driver.findElement(By.xpath("(//div[@class='_0QyAeO'])[3]"));
				ac.moveToElement(g3).build().perform();
				Thread.sleep(1000);
				WebElement g4 = driver.findElement(By.xpath("(//div[@class='_0QyAeO'])[4]"));
				ac.moveToElement(g4).build().perform();
				Thread.sleep(1000);
				WebElement g5 = driver.findElement(By.xpath("(//div[@class='_0QyAeO'])[5]"));
				ac.moveToElement(g5).build().perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("301019");
				driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
			}
		}
	}
}
