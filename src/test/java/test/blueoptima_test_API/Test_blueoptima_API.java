package test.blueoptima_test_API;

import org.testng.annotations.Test;

import test.blueoptima_page.Pageclass;


public class Test_blueoptima_API {
	
	//Initialsing Page-Class Object.
	Pageclass pageclass = new Pageclass();
	
	/**
	 * Method for performing test case.
	 */
	@Test
	public void test_fourpoints()
	{	
		//Maximizing and navigating to URL.
		pageclass.driver.manage().window().maximize();
		pageclass.driver.get("https://uix-stage02.blueoptima.com/uix/login");
		
		//Enter Username , Password and click on Login. (Assuming No session is already present).
		pageclass.enter_user();
		pageclass.enter_pass();
		pageclass.click_Login();
		
		//Clicking on Developer Tab after waiting for it to load.
		pageclass.devclickandvalidate();
		
		//Validating one graph.
		pageclass.graph_verify();
		
		//Closing Browser- Keeping it commented to check the page loaded.. Can Uncomment for closing .
//		pageclass.driver.close();	
	}   
}