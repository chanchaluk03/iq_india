package datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dateandmonth {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String month ="May 2025";
		String day = "10";
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		driver.manage().window().maximize();
		WebElement frm1=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frm1);
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		
		while(true)
		{
			String text =driver.findElement(By.className("ui-datepicker-title")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		driver.findElement(By.xpath("//tbody[1]/tr/td/a[contains(text(),"+day+")]")).click();
	}
}
