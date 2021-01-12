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


public class Post_PetByID {
	
	 @Test
	 public void PostPetByID() throws FileNotFoundException, IOException, ParseException {
		 
			String response;
			JSONReader _JSONRead = new JSONReader();
			PostRequest _postReq = new PostRequest(); 
			
			String Req_URL = _JSONRead.ReadJSONFile("Post_PetByID", ".\\Data\\PetData.json");
		    
		    String PetID = _JSONRead.ReadJSONFile("id", ".\\Data\\UpdatePet.json");
		    String Petname = _JSONRead.ReadJSONFile("name", ".\\Data\\UpdatePet.Json");
		    String Petstatus = _JSONRead.ReadJSONFile("status", ".\\Data\\UpdatePet.Json");
		    
		    response = _postReq.postRequest(Req_URL, "{\"id\":"+PetID+",\"name\":"+Petname+",\"status\":"+Petstatus+"}");
		  
		    
		    }

}
