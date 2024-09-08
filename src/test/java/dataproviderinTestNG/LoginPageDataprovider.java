package dataproviderinTestNG;

import org.testng.annotations.DataProvider;

public class LoginPageDataprovider {

	@DataProvider(name = "chanchal")
	public String [][] LoginData(){
		String[][] id = new String [][]{
			{"jsmith","demo1234"},
			{"jsmith","demo12"},
			{"mith","demo1234"}};
			return id;
	}

	// @DataProvider(name = "chanchal",parallel=true) -- use for create single instance for all data at a time in single click..

	// @DataProvider(name = "chanchal",indices = {0,1}) -- use for run instance with their index number.
}

