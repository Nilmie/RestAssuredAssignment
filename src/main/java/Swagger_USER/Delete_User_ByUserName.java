package Swagger_USER;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Reusable_Requests.DeleteRequest;
import Utility.JSONReader;

public class Delete_User_ByUserName {
	
	 @Test
	 public void DeleteUserByUserName() throws FileNotFoundException, IOException, ParseException {
		 
		 	String response;
			JSONReader _JSONRead = new JSONReader();
			DeleteRequest _DeleteReq = new DeleteRequest();
			
		    String Req_URL = _JSONRead.ReadJSONFile("Delete_User", ".\\Data\\User.json");
		    response = _DeleteReq.deleteRequest(Req_URL);
		    
		    Assert.assertEquals(response.contains("200") , true , "Delete user is successful");
	  
	 }

}
