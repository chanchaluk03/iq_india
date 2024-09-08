package timeoutWithinvocationCountTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCountTestNG {
	WebDriver driver;

	@Test(timeOut=15000,invocationCount=3)

	public void check() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://randomuser.me/");
		Thread.sleep(3000);
		String we = driver.findElement(By.id("user_value")).getText();
		System.out.println(we);
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
