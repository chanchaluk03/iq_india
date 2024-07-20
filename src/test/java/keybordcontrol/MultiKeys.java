package keybordcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiKeys {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://text-compare.com/");
		WebElement one = driver.findElement(By.id("inputText1"));
		WebElement two = driver.findElement(By.id("inputText2"));
		one.sendKeys("This is automated script");
		
//		key control ctrl+A-------
		
		act.keyDown(one,Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
//		ctrl+C------------
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
//		Tab key-----------
		
		act.sendKeys(Keys.TAB).build().perform();
		
//		ctrl+V-----------
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
//		compaire button press-----
		
		driver.findElement(By.xpath("//div[text()='Compare!']")).click();
		
		
//		check both value are correct or not ------------
		
		String a = one.getText();
		String b = two.getText();
		
		if(a.equals(b)) {
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
	}

}
