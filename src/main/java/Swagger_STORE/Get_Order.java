package Swagger_STORE;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import Reusable_Requests.*;
import Utility.JSONReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Get_Order {
	
	 @Test
	 public void GetOrderByID() throws FileNotFoundException, IOException, ParseException {
		 
		String response;
		JSONReader _JsonRead = new JSONReader();
		GetRequest _GetReq = new GetRequest();
		  	
	    String Req_URL = _JsonRead.ReadJSONFile("Get_OrdeByID", ".\\Data\\StoreOrder.json");
	    response = _GetReq.getRequest(Req_URL);
	    
	    Assert.assertEquals(response.contains("2") , true , "Response body contains quentity : 2");

	 }

}
