package listnersInTestNG;

import java.awt.Desktop;
import java.io.File;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



@Listeners(listnersInTestNG.ListenerTest.class)

public class TestCases {
	
	public static WebDriver  driver = new ChromeDriver();
	public static SoftAssert soft = new SoftAssert();
	
	@BeforeTest
	public void waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uid")).sendKeys("mngr588409");
		driver.findElement(By.name("password")).sendKeys("gAsybyh");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void testToscreenshot() throws IOException {
		
		String expected = "Guru99 Bank";
		String actual = driver.findElement(By.xpath("//h2[text()=\"Guru99 Bank\"]")).getText();		
		
		
		soft.assertEquals(actual, expected,"user not login");
		
			
		
		if (!actual.equals(expected))
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			LocalDateTime now =  LocalDateTime.now();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyyhhmmss");
			String str = now.format(format);
			
			
			
			String path = "C:\\Users\\HP\\eclipse-workspace\\GTC001\\Screenshot\\"+str+".png";
			FileOutputStream file = new FileOutputStream(path);
			byte[] arr  = ts.getScreenshotAs(OutputType.BYTES);
			file.write(arr);
			file.close();
			
			
			
			// attach ScreenShot into Extent Report------------------------------
			
			
			ExtentReports ex = new ExtentReports();
			File f = new File(".//ListenerReport//screen.html");
			ExtentSparkReporter sr = new ExtentSparkReporter(f);
			
			ex.attachReporter(sr);
			
			ex.createTest("Screen Shot")
			.addScreenCaptureFromPath(path)
			.assignAuthor("chanchal")
			.info("this is failed test screenshot");
			
			ex.flush();
			
			Desktop.getDesktop().browse(new File("C:\\Users\\HP\\eclipse-workspace\\GTC001\\ListenerReport\\screen.html").toURI());
			
			soft.assertAll();
			
		}

	}
	
//	@Test(dependsOnMethods = "testToscreenshot")
//	public void skiptest() {
//		
//		System.out.println("This Method to test skip");
//	}
	
	
	@Test
	public void timeout() throws InterruptedException {
		
		System.out.println("This Method to test timeout");
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

	
}
