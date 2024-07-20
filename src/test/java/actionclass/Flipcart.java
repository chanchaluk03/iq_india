package actionclass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		driver.get("https://www.flipkart.com/");
		WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Furniture')]"));
		act.moveToElement(home).build().perform();
		WebElement decoder = driver.findElement(By.xpath("//a[(text()='Home Decor')]"));
		act.moveToElement(decoder).build().perform();
		WebElement lighting = driver.findElement(By.xpath("//a[(text()='Lightings')]"));
		act.moveToElement(lighting).build().perform();
		act.click(lighting).build().perform();
		String w1 = driver.getWindowHandle();
		WebElement lamp = driver.findElement(By.xpath("//a[contains(text(),'WEIRD WOLF 3')]"));
		act.click(lamp).build().perform();
		Set<String> w2 = driver.getWindowHandles();
		for(String s : w2)
		{
			if(!s.equals(w1))
			{
				driver.switchTo().window(w1);
				driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
//				act.click(lamp).build().perform();
			}
		}
		

	}

}
