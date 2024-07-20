package GTC001.GTC001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrTutorialsXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int sum =0;
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//label[normalize-space(text()='First Name')]/following-sibling::input")).sendKeys("Chanchal");
		driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[1]")).sendKeys("Singh");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("@gmail.com");
		driver.findElement(By.xpath("//div[@class='container']/child::div[2]/input")).sendKeys("1234");
		driver.findElement(By.xpath("//label[text()='Repeat Password']/following-sibling::input[1]")).sendKeys("1234");
		
		//Register button------
		
//		driver.findElement(By.xpath("//div[@class='container']/child::div[3]/button[1]")).click();
		
		
		//Clear button-----
		
//		driver.findElement(By.xpath("//div[@class='container']/child::div[3]/button[2]")).click();
		
		//Reset button------
		
//		driver.findElement(By.xpath("//div[@class='container']/child::div[3]/button[3]")).click();

		//Refresh button------
		
//		driver.findElement(By.xpath("//div[@class='container']/child::div[3]/input")).click();
		
		
		
		//Get value with text function-----------
		
		
//		List<WebElement> temp = driver.findElements(By.xpath("//td[text()<='5000']"));
//		for(WebElement w : temp)
//		{
//			System.out.println(w.getText());
//		}
		
		
		// get value and sum all values---------

//		List<WebElement> temp = driver.findElements(By.xpath("//td[text()<='5000']"));
//		for(WebElement w : temp)
//		{
//			String str = w.getText();
//			int a = Integer.parseInt(str); 
//			System.out.println(a);
//			sum = a+sum;
//		}
//		System.out.println("sum of all values= "+sum);
		
		
		// click checkbox and click linktext with child parent relation---------
		
//		driver.findElement(By.xpath("//td[text()='5000']/preceding-sibling::td[3]/child::input")).click();
//		driver.findElement(By.xpath("//td[text()='2000']/preceding-sibling::td[3]/child::input")).click();
//		driver.findElement(By.xpath("//td[text()='7000']/preceding-sibling::td[3]/child::input")).click();
//		driver.findElement(By.xpath("//td[text()='3000']/preceding-sibling::td[3]/child::input")).click();
//		driver.findElement(By.xpath("//td[text()='Canada']/preceding-sibling::td[2]/child::input")).click();
//		driver.findElement(By.xpath("//td[text()='1000']/preceding-sibling::td[3]/child::input")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//td[text()='5000']/following-sibling::td[1]/a[1]")).click();
		
		
		//click linkText with contains method----------
		
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//a[contains(text(),'into account')]")).click();
		
//		Thread.sleep(3000);
//		driver.quit();
		
		
	}

}
