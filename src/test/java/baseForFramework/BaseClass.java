package baseForFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public BaseClass(){
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

	}
	
}
