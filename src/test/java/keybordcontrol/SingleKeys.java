package keybordcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		WebElement box = driver.findElement(By.id("target"));
		act.sendKeys(org.openqa.selenium.Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(org.openqa.selenium.Keys.TAB).build().perform();
		

	}

}
