package groupsInTestNG;

import org.testng.annotations.Test;

public class Group2 {

	@Test(groups = {"regression","daily"})
	public void TC010() {
		System.out.println("TC010");
	}

	@Test(groups = {"regression"})
	public void TC011() {
		System.out.println("TC011");
	}

	@Test(groups = {"smoke"})
	public void TC012() {
		System.out.println("TC012");
	}

	@Test(groups = {"daily"})
	public void TC013() {
		System.out.println("TC013");
	}
	
	@Test(groups = {"regression","smoke"})
	public void TC014() {
		System.out.println("TC014");
	}
	@Test(groups = {"sanity","smoke"})
	public void TC015() {
		System.out.println("TC015");
	}

	@Test(groups = {"unit","smoke"})
	public void TC016() {
		System.out.println("TC016");
	}

	@Test(groups = {"regression","daily"})
	public void TC017() {
		System.out.println("TC017");
	}

	@Test(groups = {"regression","smoke"})
	public void TC018() {
		System.out.println("TC018");
	}
}
