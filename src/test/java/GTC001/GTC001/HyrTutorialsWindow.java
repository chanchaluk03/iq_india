package GTC001.GTC001;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrTutorialsWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String oldwindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[@class='post-body entry-content']/descendant::input[@id='name']")).sendKeys("main 1st Window");
		Thread.sleep(3000);
		
		
		
//		handeling a new browser window button 1 with their id -------------------
		
//		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
//		Set<String> winsId= driver.getWindowHandles();
		
//			print windows id -------------
		
//		for(String str : winsId)
//		{
//			System.out.println(str);
//		}
		
//		jump to new window and work on it-----------

//		for(String str : winsId )
//		{
//			if(!str.equals(oldwindow))
//			{
//				driver.switchTo().window(str);
//				Thread.sleep(5000);
//				String title = driver.getTitle();
//				System.out.println(title);
//				driver.manage().window().maximize();
//				Thread.sleep(5000);
//				
//				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("chanchal");
//				Thread.sleep(3000);
//				
//				driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Singh");
//				Thread.sleep(3000);
//
//				driver.findElement(By.xpath("//input[@id='malerb']")).click();
//				
//				driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
//				driver.findElement(By.xpath("//input[@id='hindichbx']")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//input[@id='frenchchbx']")).click();
//				Thread.sleep(5000);
//				
//				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@123");
//				Thread.sleep(5000);
//				
//				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
//				Thread.sleep(5000);
//				
//				driver.findElement(By.xpath("//button[@id='clearbtn']")).click();
//				Thread.sleep(8000);
//				driver.close();
//			}
//		}
//		driver.switchTo().window(oldwindow);
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Lo fir aa gye yha");
//		Thread.sleep(6000);
//		driver.quit();
		
		
		
		
//		handeling open a new tab with their id ------------------
		
		
		
//		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
//		Set<String> winsID = driver.getWindowHandles();
		
		
//		print current window and new tab id -------------
		
//		for(String str : winsID)
//		{
//			System.out.println(str);
//					
//		}
		
		
//		jump to new tab and print tab title-----------
		
//		for(String str : winsID)
//		{
//			if(!str.equals(winsID))
//			{
//				driver.switchTo().window(str);
//				String title = driver.getTitle();
//				System.out.println(title);
//				Thread.sleep(3000);
//				driver.close();
//			}
//			
//		}
//		driver.quit();
		
		
		
//		Open multiple Windows ----------------
		
//		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
//		Set<String> WinId = driver.getWindowHandles();
//		
//		for(String id : WinId)
//		{
//			System.out.println(id);
//		}
//		
//		for(String str : WinId)
//		{
//			if(!str.equals(oldwindow))
//			{
//				driver.switchTo().window(str);
//				Thread.sleep(3000);
//				String title = driver.getTitle();
//				System.out.println(title);
//				driver.close();
//			}
//		}
//		driver.switchTo().window(oldwindow);
//		Thread.sleep(5000);
//		driver.quit();
		
		
		
		
//		open multiple window and multiple tabs----------------
		
//		driver.findElement(By.xpath("//button[@id='newTabsWindowsBtn']")).click();
//		Set<String> wintab = driver.getWindowHandles();
//		
//		for(String str : wintab)
//		{
//			if(!str.equals(oldwindow))
//			{
//				driver.switchTo().window(str);
//				Thread.sleep(3000);
//				String title = driver.getTitle();
//				System.out.println(title);
//				driver.close();
//			}
//		}
//		driver.quit();
		
		
// full control of all new tabs and windows -----------------------	
		
		
//		String bc=""; //Basic Controls
//		String cm=""; //Contact Me
//		String xp=""; // Xpath Practice
//		String ad=""; // Alert Demo
		
//		driver.findElement(By.xpath("//button[@id='newTabsWindowsBtn']")).click();
//		Set<String> wintab = driver.getWindowHandles();
		
//			print windows/tab title with their id------------
		
//		for(String str : wintab)
//		{
//			if(!str.equals(oldwindow))
//			{
//				driver.switchTo().window(str);
//				Thread.sleep(3000);
//				String title = driver.getTitle();
//				System.out.println(title);
//				
//				if(title.contains("Basic Controls"))
//				{
//					bc = str;
//					System.out.println(bc);
//				}
//				else if (title.contains("Contact Me"))
//				{
//					cm = str;
//					System.out.println(cm);
//				}
//				else if (title.contains("Xpath Practice"))
//				{
//					xp = str;
//					System.out.println(xp);
//				}
//				else
//				{
//					ad = str;
//					System.out.println(ad);
//				}
//			}
//		}
		
//				working on Contact Me window--------------------
		
		
//		driver.switchTo().window(cm);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='ContactForm1_contact-form-name']")).sendKeys("java programming");
//		driver.findElement(By.xpath("//input[@id='ContactForm1_contact-form-email']")).sendKeys("test@123");
//		driver.findElement(By.xpath("//textarea[@id='ContactForm1_contact-form-email-message']")).sendKeys("Hello Java Automation");
//		Thread.sleep(5000);
//		String str2 = driver.getCurrentUrl();
//		System.out.println(str2);
//		
//		Thread.sleep(3000);
		
//				return to parent window------------------------
		
//		driver.switchTo().window(oldwindow);
//		Thread.sleep(3000);
//		
//		driver.quit();
		
		
		
	}

}
