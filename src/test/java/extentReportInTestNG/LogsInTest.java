package extentReportInTestNG;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogsInTest {
	
@Test
public void log() {
	ExtentReports extentReport = new ExtentReports();
	File file = new File(".\\Extent-Report\\report3.html");
	ExtentSparkReporter spark = new ExtentSparkReporter(file);
	
	extentReport.attachReporter(spark);
	
	// chaining log-----------------
	
	extentReport.createTest("Test 1")
	.log(Status.INFO, "Info 1")
	.log(Status.INFO, "info 2")
	.log(Status.PASS, "this is pass")
	.log(Status.FAIL, "this is fail")
	.log(Status.SKIP, "this is skipped")
	.log(Status.WARNING, "this is warning");
	
	
	extentReport.createTest("Test 2")
	.log(Status.INFO, "Info 3")
	.log(Status.INFO, "info 4")
	.log(Status.PASS, "this is pass")
	.log(Status.FAIL, "this is fail")
	.log(Status.SKIP, "this is skipped")
	.log(Status.WARNING, "this is warning");
	
	extentReport.flush();
	
}

}
