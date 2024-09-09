package extentReportInTestNG;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		
		ExtentReports extentReport = new ExtentReports();
		File file = new File(".\\Extent-Report\\report2.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(file);
		
		// ExtentReports is like an engine and ExtentSparkReporter is like an train-bogi ...
		// there are 4 types of Extent reporter = 1. ExtentSparkReporter  
		// 2. ExtentAventReporter  3. ExtentMailReporter and 4. ExtentKlovReporter ...
		
		extentReport.attachReporter(spark);
		
		
		// add test for extent report--------------------
		// remember all your test cases should be created directly under the ExtentReports...
		// by default every test cases pass....
		// there are 3 method to write test -------
		
		
		// method 1-------
		
		ExtentTest test1 = extentReport.createTest("Test 1");
		
		// there are no method to directly providing status so we need to provide status with help of LOG-----
		
		test1.pass("this is pass");
		test1.assignAuthor("chanchal");
		
		
		// method 2-------
		
		ExtentTest test2 = extentReport.createTest("Test 2");
		test2.log(Status.FAIL, "this is failed");
		
		
		// method 3-------
		
		extentReport.createTest("Test 3").skip("this is skiped");
		
		
		// configuration and add-on report------------------------------
		
		
		spark.config(
				  ExtentSparkReporterConfig.builder()
				    .theme(Theme.DARK)
				    .documentTitle("My Report")
				    .build()
				);

		
		// flush use for creating reporting after our all code done flush use in the last ..
		
		extentReport.flush();
		
		
		
		
		// to open Extent-Report with Automation automatically-----------------
		
		Desktop.getDesktop().browse(new File("C:\\Users\\HP\\eclipse-workspace\\GTC001\\Extent-Report\\report2.html").toURI());
		

		
	}

}
