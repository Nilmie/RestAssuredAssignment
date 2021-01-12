package Swagger_PET;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import Reusable_Requests.*;
import Utility.JSONReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class UploadImage_Pet {
	
	 @Test
	 public void UploadImage_Pet_ForPet1() throws FileNotFoundException, IOException, ParseException {
		 
		    JSONReader _JSONRead = new JSONReader();
	        PostRequest _postReq = new PostRequest();

	        String Req_URL = _JSONRead.ReadJSONFile("Post_uploadimage", ".\\Data\\PetData.json");
	        String ImageURL = _JSONRead.ReadJSONFile("photoUrls", ".\\Data\\PetData.json");

	        File sourceimage = new File(ImageURL);
	 
	        Map<String, String> headers = new HashMap<String, String>();
	        headers.put("Content-Type", "multipart/form-data");
	
	        RequestSpecification request =     RestAssured
	        		.given()
	        		.headers(headers)
	        		.multiPart(sourceimage);

	        Response response=request.post(Req_URL);
	                
	        String statusCode =  response.asString();
	        Assert.assertEquals((statusCode.contains("200")) , true , "Request is successful");
	    
	 }

}
