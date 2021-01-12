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


public class Get_Inventory {
	
	 @Test
	 public void GetPetInventory() throws FileNotFoundException, IOException, ParseException {
		 
			String response;
			JSONReader _JsonRead = new JSONReader();
			GetRequest _GetReq = new GetRequest();
			  	
		    String Req_URL = _JsonRead.ReadJSONFile("Get_Inventory", ".\\Data\\StoreOrder.json");
		    response = _GetReq.getRequest(Req_URL);
		    System.out.println(response);
		    
		    Assert.assertEquals(response.contains("sold") , true , "Response body contains sold");		  
	 }

}
