package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		Actions act = new Actions(driver);
		
//		 drag and drop .........................
		
//		WebElement frm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frm);
//		WebElement sour = driver.findElement(By.xpath("//p[text()='Drag me around']"));
//		act.dragAndDropBy(sour, 100, 100).build().perform();
		
		
//		drop here-----------------------
		
		
//		WebElement click = driver.findElement(By.xpath("//a[text()='Droppable']"));
//		act.click(click).build().perform();
//		
//		WebElement frm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frm);
//		WebElement sour = driver.findElement(By.id("draggable"));
//		WebElement tar = driver.findElement(By.id("droppable"));
		
//		1st way------
		
//		act.dragAndDrop(sour, tar).build().perform();
		
		
//		2nd way-------
		
//		act.clickAndHold(sour).moveToElement(tar).release().build().perform();
		
		
		
//		Resizable---------------------------------------
		
		
		WebElement size = driver.findElement(By.xpath("//a[text()='Resizable']"));
		act.click(size).build().perform();
		
		WebElement frm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frm);
		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		act.clickAndHold(resize).moveByOffset(50, 100).release().build().perform();
		
		

		
	}

}
