package ignoreTestinTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTestCase1 {

	@Test
	public void TC001() {
		System.out.println("TC001");
	}

	@Test
	public void TC002() {
		System.out.println("TC002");
	}
	
	@Ignore
	@Test 
	public void TC003() {
		System.out.println("TC003");
	}

	@Test
	public void TC004() {
		System.out.println("TC004");
	}

	@Test
	public void TC005() {
		System.out.println("TC005");
	}

}
