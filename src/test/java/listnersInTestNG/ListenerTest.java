package listnersInTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
	
	
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("onFinish :"+context.getName());
	    
	  }
	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("onStart :"+context.getName());
	    
	  }
	
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("onTestFailedButWithinSuccessPercentage :"+result.getName());
	    
	  }
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("The name of the testcase failed is :"+result.getName());
	   
	  }
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		 System.out.println("The name of the testcase Skipped is :"+result.getName());	
	    
	  }
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
		 System.out.println("The name of the testcase started is :"+result.getName());
	    
	  }
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		 System.out.println("The name of the testcase success is :"+result.getName());	
	    
	  }
	
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	    System.out.println("onTestFailedWithTimeout :"+result.getName());
	  }
	
}
