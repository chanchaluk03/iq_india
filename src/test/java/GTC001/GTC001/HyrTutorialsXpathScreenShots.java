package GTC001.GTC001;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrTutorialsXpathScreenShots {

	public static void main(String[] args) throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		driver.get("https://www.hyrtutorials.com/p/contactus.html");
//		
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		String path = "C:\\Users\\HP\\eclipse-workspace\\GTC001\\Screenshot\\img.png";
//		File target = new File(path);
//		try {
//			FileUtils.copyFile(src, target);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
// 			with BASE64-----------------------------------------
		
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		driver.get("https://www.hyrtutorials.com/p/contactus.html");
//		String path = "C:\\Users\\HP\\eclipse-workspace\\GTC001\\Screenshot\\img2.png";
//		FileOutputStream file = new FileOutputStream(path);
//		String base64 = ts.getScreenshotAs(OutputType.BASE64);
//		byte[] arr = Base64.getDecoder().decode(base64);
//		file.write(arr);
		
		
		
//			with Byte------------------------------------------
		
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		driver.get("https://www.hyrtutorials.com/p/contactus.html");
//		String path = "C:\\Users\\HP\\eclipse-workspace\\GTC001\\Screenshot\\img2.png";
//		FileOutputStream file = new FileOutputStream(path);
//		byte[] arr  = ts.getScreenshotAs(OutputType.BYTES);
//		file.write(arr);
		
		
		
//		create dynamic Screenshot with help of date time-------------------
		
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		LocalDateTime now = LocalDateTime.now();
//		DateTimeFormatter formt = DateTimeFormatter.ofPattern("ddMMyyyyhhmmss");
//		String str = now.format(formt);
//		System.out.println(str);
//		
//		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
//		String path = "C:\\Users\\HP\\eclipse-workspace\\GTC001\\Screenshot\\"+str+".png";
//		FileOutputStream file = new FileOutputStream(path);
//		byte[] arr  = ts.getScreenshotAs(OutputType.BYTES);
//		file.write(arr);
//		file.close();
		
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter formt = DateTimeFormatter.ofPattern("ddMMyyyyhhmmss");
		String str = now.format(formt);
		System.out.println(str);
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//div[@id='search-input']/input[@id='search']")).sendKeys("hare krishna");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		String path = "C:\\Users\\HP\\eclipse-workspace\\GTC001\\Screenshot\\"+str+".png";
		FileOutputStream file = new FileOutputStream(path);
		byte[] arr  = ts.getScreenshotAs(OutputType.BYTES);
		file.write(arr);
		file.close();
		
		


}
}
