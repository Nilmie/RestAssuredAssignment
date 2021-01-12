
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


public class Post_Order {
	
	 @Test
	 public void PostOrder() throws FileNotFoundException, IOException, ParseException {
		 
		String response;
		JSONReader _JSONRead = new JSONReader();
		PostRequest _postReq = new PostRequest(); 
		
        	
	    String Req_URL = _JSONRead.ReadJSONFile("OrderURL", ".\\Data\\StoreOrder.Json");
	    
    	    
	    String OrderID = _JSONRead.ReadJSONFile("id", ".\\Data\\StoreOrder.Json");
	    String OrderPetID = _JSONRead.ReadJSONFile("petId", ".\\Data\\StoreOrder.Json");
	    String OrderQuentity = _JSONRead.ReadJSONFile("quantity", ".\\Data\\StoreOrder.Json");
	    String OrderShipDate = _JSONRead.ReadJSONFile("shipDate", ".\\Data\\StoreOrder.Json");
	    String OrderStatus = _JSONRead.ReadJSONFile("status", ".\\Data\\StoreOrder.Json");
	    String OrderComplete = _JSONRead.ReadJSONFile("complete", ".\\Data\\StoreOrder.Json");
	    
	    response = _postReq.postRequest(Req_URL, "{\"id\":"+OrderID+",\"petId\":"+OrderPetID+",\"quantity\":"+OrderQuentity+",\"shipDate\":"+OrderShipDate+",\"status\":"+OrderStatus+",\"complete\":"+OrderComplete+"}");
	    
	    Assert.assertEquals(response.contains("200") , true , "Post Order is successful");
	 }

}
