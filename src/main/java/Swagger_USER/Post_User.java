package Swagger_USER;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Reusable_Requests.PostRequest;
import Utility.JSONReader;

public class Post_User {
	
	 @Test
	 public void PostUser() throws FileNotFoundException, IOException, ParseException {
		 
		String response;
		JSONReader _JSONRead = new JSONReader();
		PostRequest _postReq = new PostRequest(); 
		
        	
	    String Req_URL = _JSONRead.ReadJSONFile("Post_User_URL", ".\\Data\\User.Json");
    	    
	    String ID = _JSONRead.ReadJSONFile("id", ".\\Data\\User.Json");
	    String username = _JSONRead.ReadJSONFile("username", ".\\Data\\User.Json");
	    String firstName = _JSONRead.ReadJSONFile("firstName", ".\\Data\\User.Json");
	    String lastName = _JSONRead.ReadJSONFile("lastName", ".\\Data\\User.Json");
	    String email = _JSONRead.ReadJSONFile("email", ".\\Data\\User.Json");
	    String password = _JSONRead.ReadJSONFile("password", ".\\Data\\User.Json");
	    String phone = _JSONRead.ReadJSONFile("phone", ".\\Data\\User.Json");
	    String userStatus = _JSONRead.ReadJSONFile("userStatus", ".\\Data\\User.Json");
	    
	    response = _postReq.postRequest(Req_URL, "{\"id\":"+ID+",\"username\":"+username+",\"firstName\":"+firstName+",\"lastName\":"+lastName+",\"email\":"+email+",\"password\":"+password+",\"phone\":"+phone+",\"userStatus\":"+userStatus+"}");
	    Assert.assertEquals(response.contains("200") , true , "Post Order is successful");
	 }

}
