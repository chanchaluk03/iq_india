package dataproviderinTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2DArray {
	
	
	// 1st way ----------
	
	
//	@Test(dataProvider = "coding2")
//	public void Test(String s1,String s2) {
//		System.out.print(s1+" ");
//		System.out.println(s2);
//	}
//	
	
//	@Test(dataProvider = "obj2")
//	public void Test2(Object o,Object obj) {
//		System.out.print(o+" ");
//		System.out.println(obj);
//	}
	
	
	// 2nd way-----------
	
	
//	@Test(dataProvider = "coding2")
//	public void Test(String arr[]) {
//		System.out.println(arr[0]+""+arr[1]);
//		
//	}
//	
//	
//	@Test(dataProvider = "obj2")
//	public void Test2(Object arr2[]) {
//		
//		System.out.println(arr2[0]+""+arr2[1]);
//	}
	
	
	// 3rd way-------------
	
	
	@Test(dataProvider = "coding2")
	public void Test(String arr[]) {
		int len = arr.length;
		for(int i =0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	@Test(dataProvider = "obj2")
	public void Test2(Object arr2[]) {
		int len = arr2.length;
		for(int i =0;i<len;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
	}
	
	
	
@DataProvider(name="coding2")
public String [][] DataSource() {
	String [][] str = new String[][] {{"test","automation"},
									  {"selenium","testNG"}};
	return str;
}


@DataProvider(name="obj2")
public Object [][] DataSource1() {
	Object [][] s = new Object[][] {{505,"automation"},
									{7.5,'A'}};
	return s;
}
	
}
