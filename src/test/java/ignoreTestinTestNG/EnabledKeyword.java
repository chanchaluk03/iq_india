package ignoreTestinTestNG;

import org.testng.annotations.Test;

public class EnabledKeyword {

	@Test
	public void TC001() {
		System.out.println("TC001");
	}

	@Test
	public void TC002() {
		System.out.println("TC002");
	}
	
	@Test (enabled = false)
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
