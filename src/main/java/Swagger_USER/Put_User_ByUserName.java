package Swagger_USER;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Reusable_Requests.PutRequest;
import Utility.JSONReader;

public class Put_User_ByUserName {

	@Test
	 public void PutUserByUserName() throws FileNotFoundException, IOException, ParseException {
		 
			String response;
			JSONReader _JSONRead = new JSONReader();
			PutRequest _putReq = new PutRequest();
		    String Req_URL = _JSONRead.ReadJSONFile("Put_User", ".\\Data\\User.Json");
		    
		    String ID = _JSONRead.ReadJSONFile("updateid", ".\\Data\\User.Json");
		    String username = _JSONRead.ReadJSONFile("updateusername", ".\\Data\\User.Json");
		    String firstName = _JSONRead.ReadJSONFile("updatefirstName", ".\\Data\\User.Json");
		    String lastName = _JSONRead.ReadJSONFile("updatelastName", ".\\Data\\User.Json");
		    String email = _JSONRead.ReadJSONFile("updateemail", ".\\Data\\User.Json");
		    String password = _JSONRead.ReadJSONFile("updatepassword", ".\\Data\\User.Json");
		    String phone = _JSONRead.ReadJSONFile("updatephone", ".\\Data\\User.Json");
		    String userStatus = _JSONRead.ReadJSONFile("updateserStatus", ".\\Data\\User.Json");
		    
		    response = _putReq.putRequest(Req_URL, "{\"id\":"+ID+",\"username\":"+username+",\"firstName\":"+firstName+",\"lastName\":"+lastName+",\"email\":"+email+",\"password\":"+password+",\"phone\":"+phone+",\"userStatus\":"+userStatus+"}");
		    Assert.assertEquals(response.contains("200") , true , "Post Order is successful");
		    

		    }
	
}
