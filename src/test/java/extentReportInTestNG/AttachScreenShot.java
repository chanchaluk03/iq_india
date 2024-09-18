package extentReportInTestNG;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttachScreenShot {
	
	static WebDriver driver;
	
	@Test
	public void log() throws IOException, InterruptedException {
		ExtentReports extentReport = new ExtentReports();
		File file = new File(".\\Extent-Report\\report9.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(file);
		
		extentReport.attachReporter(spark);
		
		
		// Test Level Screenshot attach---------------------------------------------------
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		driver.get("https://www.inmotionhosting.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String path = "C:\\Users\\HP\\eclipse-workspace\\GTC001\\Screenshot\\Image.png";
		FileOutputStream f = new FileOutputStream(path);
		String base64 = ts.getScreenshotAs(OutputType.BASE64);
		byte arr[] = Base64.getDecoder().decode(base64);
		f.write(arr);
		
		
		
		extentReport
		.createTest("Screenshot 1", "test level screenshot")
		.info("this is info message")
		.addScreenCaptureFromPath(path, "frist image")
		.assignDevice("window10");
		
		
		
		
		
		extentReport.flush();
		
		Desktop.getDesktop().browse(new File("C:\\Users\\HP\\eclipse-workspace\\GTC001\\Extent-Report\\report8.html").toURI());


}
}
