package test.blueoptima_test;

import org.testng.annotations.Test;

import test.blueoptima_page.Pageclass;

/**
 * Unit test for simple App.
 */
public class Test_blueoptima {
	
	Pageclass pageclass = new Pageclass();
	@Test
	public void test_fourpoints()
	{	pageclass.driver.manage().window().maximize();
		pageclass.driver.get("https://uix-stage02.blueoptima.com/uix/login");
		pageclass.enter_user();
		pageclass.enter_pass();
		pageclass.click_Login();
		pageclass.devclickandvalidate();
		pageclass.select_checkbox_and_graph_verify();
//		pageclass.driver.close();
		
	}
	
    
}
