package Swagger_USER;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Reusable_Requests.ArrayPostRequest;
import Reusable_Requests.PostRequest;
import Utility.JSONArray;
import Utility.JSONReader;

public class Post_User_CreateWithList {
	
	 @Test
	 public void PostUserCreateWithList() throws FileNotFoundException, IOException, ParseException {
		 
		 ArrayPostRequest _postReqarray = new ArrayPostRequest();
		 JSONReader _JSONRead = new JSONReader();
		 JSONArray _JSONReadARRAY = new JSONArray();
		  
		 String Req_URL = _JSONRead.ReadJSONFile("Post_User_createWithArray", ".\\Data\\User.Json");

	     String Arrayobject=_JSONReadARRAY.ReadJSONFile("D:\\Selenium\\Rest\\RestAssuredAssignment\\Data\\UserArray.Json");
	     _postReqarray.ArraypostRequest(Req_URL, Arrayobject);
	 }

}
