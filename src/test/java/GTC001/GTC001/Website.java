package GTC001.GTC001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Website {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("search_query")).sendKeys("kalki 2898 trailer");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
	
		Thread.sleep(1000);
		

	}

}
