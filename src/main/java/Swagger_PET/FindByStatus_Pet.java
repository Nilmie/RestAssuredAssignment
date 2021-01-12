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


public class FindByStatus_Pet {
	
	 @Test
	 public void Get_Pet_bystatus() throws FileNotFoundException, IOException, ParseException {
		 
		 	String response;
			JSONReader _JSONRead = new JSONReader();
			GetRequest _GetReq = new GetRequest();
			
			String Req_URL = _JSONRead.ReadJSONFile("GetPet_bystatus", ".\\Data\\PetData.json");
			response = _GetReq.getRequest(Req_URL);
			
			Assert.assertEquals(response.contains("9222968140496909352") , true , "Get Available Pet request is successful");

	 }
	 
}
