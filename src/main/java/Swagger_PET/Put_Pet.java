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


public class Put_Pet {
	
	 @Test
	 public void PutPet() throws FileNotFoundException, IOException, ParseException {
		 
			String response;
			JSONReader _JSONRead = new JSONReader();
			PutRequest _putReq = new PutRequest();
			
		    String Req_URL = _JSONRead.ReadJSONFile("Put_Pet", ".\\Data\\PetData.json");
		    
		    String PetID = _JSONRead.ReadJSONFile("id", ".\\Data\\UpdatePet.json");
		    String Petname = _JSONRead.ReadJSONFile("name", ".\\Data\\UpdatePet.Json");
		    String Petstatus = _JSONRead.ReadJSONFile("status", ".\\Data\\UpdatePet.Json");
		    
		    response = _putReq.putRequest(Req_URL, "{\"id\":"+PetID+",\"name\":"+Petname+",\"status\":"+Petstatus+"}");
		    
		    Assert.assertEquals(response.contains("200") , true , "Post New Pet request is successful");  
	 }

}
