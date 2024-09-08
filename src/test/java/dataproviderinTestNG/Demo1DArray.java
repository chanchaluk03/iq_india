package dataproviderinTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1DArray {
	
	@Test(dataProvider = "coding")
	public void Test(String s1) {
		System.out.println(s1);
	}
	
	@Test(dataProvider = "obj")
	public void Test2(Object o) {
		System.out.println(o);
	}
	
	
	
@DataProvider(name="coding")
public String [] DataSource() {
	String [] s = new String[] {"test","automation","java"};
	return s;
}


@DataProvider(name="obj")
public Object [] DataSource1() {
	Object [] s = new Object[] {505,"automation",3.8,1234567891};
	return s;
}
	
}
