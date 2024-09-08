package priorityinTestNG;

import org.testng.annotations.Test;

public class TestCasePriortize {
	
@Test(priority=0)
public void Signin() {
	System.out.println("inside Signin");
}

@Test(priority=1)
public void SearchFlight() {
	System.out.println("inside SearchFlight");
}

@Test(priority=2)
public void BookFlight() {
	System.out.println("inside BookFlight");
}

@Test(priority=3)
public void SaveTicket() {
	System.out.println("inside SaveTicket");
}

@Test(priority=4)
public void Logout() {
	System.out.println("inside Logout");
}


}
