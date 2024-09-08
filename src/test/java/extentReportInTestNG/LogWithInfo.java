package extentReportInTestNG;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogWithInfo {
	
	@Test
	public void log() {
		ExtentReports extentReport = new ExtentReports();
		File file = new File(".\\Extent-Report\\report7.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(file);
		
		extentReport.attachReporter(spark);
		
		
		// Text Based Test format-----------------------------------------------------------
		
		extentReport
		.createTest("Text Based Test")
		.log(Status.INFO, "Info 1")
		.log(Status.INFO, "<b>Info 2<b>")
		.log(Status.INFO, "<i>Info 3<i>")
		.log(Status.INFO, "<b><i>Info 4<i><b>");
		
		
		
		// json or xml data Based format----------------------------------------------------
		// store json and xml data into String..
		
		
		String xmlData = "<menu id=\"file\" value=\"File\">\r\n"
				+ "  <popup>\r\n"
				+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
				+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
				+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
				+ "  </popup>\r\n"
				+ "</menu>";
		
		
		
		String jsonData = "{\"menu\": {\r\n"
				+ "  \"id\": \"file\",\r\n"
				+ "  \"value\": \"File\",\r\n"
				+ "  \"popup\": {\r\n"
				+ "    \"menuitem\": [\r\n"
				+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
				+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
				+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}}";
		
		
	
		
//		extentReport
//		.createTest("XML Based Test")
//		.log(Status.INFO, xmlData);
		
//		extentReport
//		.createTest("JSON Based Test")
//		.log(Status.INFO, jsonData);
		
		// these report will not provide proper aligned data...so ...........
		
		
		extentReport
		.createTest("XML Based Test")
		.info(MarkupHelper.createCodeBlock(xmlData,CodeLanguage.XML));
		
		
		extentReport
		.createTest("JSON Based Test")
		.log(Status.INFO, MarkupHelper.createCodeBlock(jsonData,CodeLanguage.JSON));
		
		
		// these report will be provide proper aligned data...
		
		
		
		
		
		// List data Map data and Set data -------------------------------------------
		
		
		
		List<String> lst = new ArrayList<>();
		lst.add("apple");
		lst.add("orange");
		lst.add("mango");
		
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Yellow");
		
		
		Set<Integer> st = map.keySet();
		
		
		extentReport
		.createTest("List Based Test")
		.info(MarkupHelper.createOrderedList(lst))
		// we can use unorderedlist also... 
		.info(MarkupHelper.createUnorderedList(lst));
		
		
		extentReport
		.createTest("Map Based Test")
		.info(MarkupHelper.createOrderedList(map))
		.info(MarkupHelper.createUnorderedList(map));
		
		
		extentReport
		.createTest("Set Based Test")
		.info(MarkupHelper.createOrderedList(st))
		.info(MarkupHelper.createUnorderedList(st));
		
		
		
		// Highlight any Message -------------------------------------------------
		
		extentReport
		.createTest("Highlight Message")
		.info(MarkupHelper.createLabel("This is a test message", ExtentColor.PURPLE));
		
		
		
		
		
		// show exceptions---------------------------------------------------------
		
		
		try {
			int i = 10/0;
		}
		catch(Exception e) {
		
			extentReport
			.createTest("Exception show")
			.info(e);
		}
		
		
		// custom Exception..
		
		Throwable th = new RuntimeException("This is custom Exception");
		
		extentReport
		.createTest("custom Exception show")
		.info(th);
		
		
		extentReport
		.createTest("custom Exception show fail")
		.fail(th);
		
		
		extentReport.flush();

}
}
