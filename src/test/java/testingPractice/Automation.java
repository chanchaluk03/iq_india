package testingPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement name = driver.findElement(By.id("name"));
		act.sendKeys(name, "chanchal").build().perform();
		WebElement mail = driver.findElement(By.id("email"));
		act.sendKeys(mail, "test@gmail.com").build().perform();
		WebElement phone = driver.findElement(By.id("phone"));
		act.sendKeys(phone, "808080").build().perform();
		driver.findElement(By.id("textarea")).sendKeys("new delhi");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("sunday")).click();
		driver.findElement(By.id("monday")).click();
		driver.findElement(By.id("tuesday")).click();
		driver.findElement(By.id("wednesday")).click();
		driver.findElement(By.id("thursday")).click();
		driver.findElement(By.id("friday")).click();
		driver.findElement(By.id("saturday")).click();
		
		WebElement st =  driver.findElement(By.id("country"));
		Select sl = new Select(st);
		sl.selectByIndex(9);
		
		WebElement color = driver.findElement(By.id("colors"));
		Select slt = new Select(color);
		List<WebElement> lst = slt.getOptions();
		for(WebElement w : lst)
		{
			String str = w.getText();
			System.out.println(str);
		}
		
		driver.findElement(By.id("datepicker")).click();
		
		Thread.sleep(2000);
		String month = "August 2024";
		String day = "10";
		
		while(true)
		{
			String text =driver.findElement(By.className("ui-datepicker-title")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/a[2]")).click();
			}
		
			driver.findElement(By.xpath("/html[1]/body[1]/div[5]/table[1]/tbody[1]/tr/td/a[contains(text(),"+day+")]")).click();
		
		String st1 = driver.findElement(By.xpath("//td[text()='Mukesh']/following-sibling::td[2]")).getText();
		System.out.println(st1);
		
		WebElement bar = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		act.click(bar);
		act.sendKeys("java");
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("(//div[@class='widget-content']/child::button[2]/preceding-sibling::button[1])")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.accept();
		
		driver.findElement(By.xpath("(//div[@class='widget-content']/child::button[3])")).click();
		Thread.sleep(3000);
		Alert al1 = driver.switchTo().alert();
		al1.sendKeys("automation");
		al1.accept();
		
		
		WebElement click = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(click).build().perform();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).build().perform();
		
		WebElement slid =driver.findElement(By.xpath("//div[@id='slider']/span"));
		act.clickAndHold(slid);
		act.moveByOffset(200, 0).release().build().perform();
		
		
		
	}
}
}
