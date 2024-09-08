package groupsInTestNG;

import org.testng.annotations.Test;

public class Group1 {
  
  @Test(groups = {"regression","smoke"})
	public void TC001() {
		System.out.println("TC001");
	}

	@Test(groups = {"smoke"})
	public void TC002() {
		System.out.println("TC002");
	}

	@Test(groups = {"regression"})
	public void TC003() {
		System.out.println("TC003");
	}

	@Test(groups = {"regression","sanity"})
	public void TC004() {
		System.out.println("TC004");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void TC005() {
		System.out.println("TC005");
	}
	@Test(groups = {"sanity"})
	public void TC006() {
		System.out.println("TC006");
	}

	@Test(groups = {"unit","smoke"})
	public void TC007() {
		System.out.println("TC007");
	}

	@Test(groups = {"unit"})
	public void TC008() {
		System.out.println("TC008");
	}

	@Test(groups = {"daily"})
	public void TC009() {
		System.out.println("TC009");
	}
}
