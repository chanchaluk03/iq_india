package GTC001.GTC001;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExcuter {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("http://testfire.net/login.jsp");
		
//		locate and input from java Script-------------
		
		
//		js.executeScript("document.getElementById('uid')[0].value='jsmith'");
//		js.executeScript("document.getElementsByName('passw')[0].value='demo1234'");
//		js.executeScript("document.getElementsByTagName('input')[4].click()");
//		js.executeScript("document.getElementsByTagName('h1')[0].style.border='5px solid green'");
		
		
//		locate form selenium and input from java script----------------
		
		WebElement name = driver.findElement(By.id("uid"));
		js.executeScript("arguments[0].value='jsmith'",name);
		
		WebElement pass = driver.findElement(By.name("passw"));
		js.executeScript("arguments[0].value='demo1234'",pass);
		
		WebElement login = driver.findElement(By.name("btnSubmit"));
		js.executeScript("arguments[0].click()",login);
		
		

	}

}
