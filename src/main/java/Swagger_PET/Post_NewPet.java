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


public class Post_NewPet {
	
	 @Test
	 public void PostPet() throws FileNotFoundException, IOException, ParseException {
		 
		String response;
		JSONReader _JSONRead = new JSONReader();
		PostRequest _postReq = new PostRequest(); 
		
        	
	    String Req_URL = _JSONRead.ReadJSONFile("Post_Pet", ".\\Data\\PetData.json");
	    
	    String PetID = _JSONRead.ReadJSONFile("id", ".\\Data\\PostPet.json");
	    String Petname = _JSONRead.ReadJSONFile("name", ".\\Data\\PostPet.json");
	    String Petstatus = _JSONRead.ReadJSONFile("status", ".\\Data\\PostPet.json");
	    
	    
	    response = _postReq.postRequest(Req_URL, "{\"id\":"+PetID+",\"name\":"+Petname+",\"status\":"+Petstatus+"}");
		Assert.assertEquals(response.contains("200") , true , "Post New Pet request is successful");
	 }

}
