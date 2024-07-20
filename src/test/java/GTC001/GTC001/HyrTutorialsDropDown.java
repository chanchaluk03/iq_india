package GTC001.GTC001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrTutorialsDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		driver.manage().window().maximize();
		Thread.sleep(6000);
		
// 			Single-Selection Dropdown-----------
		
		
//		WebElement drop = driver.findElement(By.id("course"));
//		Select sl = new Select(drop);
//		sl.selectByIndex(2);
//		Thread.sleep(5000);
//		sl.selectByValue("js");
//		Thread.sleep(6000);
//		sl.selectByVisibleText("Java");
//		Thread.sleep(6000);
//		driver.quit();
		
		

//		select dropdown with loop one by one and print all elements---------
		
		
//		WebElement drop = driver.findElement(By.id("course"));
//		Select sl = new Select(drop);
//		List<WebElement> lst = sl.getOptions();
//		for(WebElement w : lst)
//		{
//			String str = w.getText();
//			System.out.println(str);
//			sl.selectByVisibleText(str);
//			Thread.sleep(3000);
//		}

		
		
//		Print Single-Selection Dropdown-----------
		
		
//		WebElement single = driver.findElement(By.id("course"));
//		Select sl = new Select(single);
//		List<WebElement> web = sl.getOptions();
//		
//		for(WebElement w : web)
//		{
//			String str = w.getText();
//			System.out.println(str);
//		}
//		driver.quit();
		
	
		
		
//			Multi-Selection Dropdown-----------
		
		
//	WebElement multi = driver.findElement(By.id("ide"));
//	Select sl = new Select(multi);
//	sl.selectByIndex(2);
//	Thread.sleep(5000);
//	sl.selectByIndex(1);
//	Thread.sleep(5000);
//	sl.selectByIndex(3);
//	Thread.sleep(5000);
//	sl.deselectAll();
//	driver.quit();
		
		
		
		
//			Print Multi-Selection Dropdown-----------
		
//		List<WebElement> multi = driver.findElements(By.id("ide"));
//		
//		for(WebElement w : multi)
//		{
//			String str = w.getText();
//			System.out.println(str);
//		}
//		driver.quit();

		
	}

}
