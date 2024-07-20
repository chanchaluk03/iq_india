package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QueryContextMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement click = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(click).build().perform();
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		act.click(copy).build().perform();
		String get = driver.switchTo().alert().getText();
		System.out.println(get);
		
//		WebElement cl= driver.findElement(By.xpath("//a[text()='Adding new Context Menu Triggers']"));
//		act.click(cl).build().perform();
//		
//		WebElement bt = driver.findElement(By.id("add-trigger"));
//		act.click(bt).build().perform();
//		
//		WebElement r = driver.findElement(By.className("context-menu-one clear btn btn-neutral menu-injected"));
//		act.contextClick(r).build().perform();
	}

}
