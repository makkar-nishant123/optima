package test.blueoptima_test_API;

import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;

public class Test_blueoptima_API {
	
	@Test
	public void getdata_api() {
		// API Name or Command .
		String Command = "getData";

		// Input (Can be in different format) we are passing it as String.
		String Input = "";
		
		// Calling Method for API execution.
		API_POC.ApiHelper.test_api(Command, Input, ContentType.JSON, null, null);
	}
}