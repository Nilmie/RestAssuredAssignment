package Reusable_Requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class ArrayPostRequest {
	
    public String  ArraypostRequest(String url,String arrayobj)
    {
         RequestSpecification request = RestAssured.given();
         request.header("Content-Type", "application/json");
        
         request.body(arrayobj);
         Response response = request.post(url);
         
         System.out.println("Response Body is =>  " + response.asString());
         int statusCode = response.getStatusCode();
         System.out.println("Retruned Status Code : " + statusCode);
          
        return Integer.toString(statusCode);
        
    }

}
