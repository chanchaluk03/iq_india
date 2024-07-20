package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interactions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement dr = driver.findElement(By.id("draggable"));
//		act.clickAndHold(dr);
		act.moveToLocation(200, 800);
		
		

	}

}
