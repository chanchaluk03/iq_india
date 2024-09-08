package dependenciesInTestNG;

import org.testng.annotations.Test;

public class DependShipment {
	static String trackingnumber = null;
	@Test(priority = 0)
	public void createshipment() {
		
		
		System.out.println("shipment created");
		
		trackingnumber = "tr505";
	}
	
	@Test(dependsOnMethods = {"createshipment"})
	public void trackshipment() throws Exception {
		
		System.out.println(10/0);
		
		if(trackingnumber!=null)
		{
			System.out.println("shipment tracked");
		}
		else
		{
			throw new Exception("tracking number missing");
		}
	}
	
	@Test (dependsOnMethods = {"trackshipment"})
	public void cancelshipment() throws Exception {
		
		if(trackingnumber!=null)
		{
			System.out.println("shipment cancelled");
		}
		else
		{
			throw new Exception("tracking number missing");
		}

	}

}
