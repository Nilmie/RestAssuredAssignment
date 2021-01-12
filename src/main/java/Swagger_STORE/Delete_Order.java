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


public class Delete_Order {
	
	 @Test
	 public void Delete_OrderByID() throws FileNotFoundException, IOException, ParseException {
		 
		 	String response;
			JSONReader _JSONRead = new JSONReader();
			DeleteRequest _DeleteReq = new DeleteRequest();
			
		    String Req_URL = _JSONRead.ReadJSONFile("Delete_OrdeByID", ".\\Data\\StoreOrder.json");
		    response = _DeleteReq.deleteRequest(Req_URL);
		    
		    Assert.assertEquals(response.contains("200") , true , "Delete Order is successful");
	  
	 }

}
