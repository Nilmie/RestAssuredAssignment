package Swagger_USER;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Reusable_Requests.GetRequest;
import Utility.JSONReader;

public class Get_User_ByUserName {

	 @Test
	 public void GetUserByUserName() throws FileNotFoundException, IOException, ParseException {
		 
		String response;
		JSONReader _JsonRead = new JSONReader();
		GetRequest _GetReq = new GetRequest();
		  	
	    String Req_URL = _JsonRead.ReadJSONFile("Get_User_byUserName", ".\\Data\\User.json");
	    response = _GetReq.getRequest(Req_URL);
	    
	    Assert.assertEquals(response.contains("nilmie") , true , "Response body contains nilmie");

	 }
}
