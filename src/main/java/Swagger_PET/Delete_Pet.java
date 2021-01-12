package Swagger_PET;

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


public class Delete_Pet {
	
	 @Test
	 public void DeletePet() throws FileNotFoundException, IOException, ParseException {
		 
		 	String response;
			JSONReader _JSONRead = new JSONReader();
			DeleteRequest _DeleteReq = new DeleteRequest();
			
		    String Req_URL = _JSONRead.ReadJSONFile("Pet_Delete", ".\\Data\\PetData.json");
		    response = _DeleteReq.deleteRequest(Req_URL);
		    
		    Assert.assertEquals(response.contains("200") , true , "Post New Pet request is successful");
	 }

}
