package Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JSONArray {
	
	  JSONParser Parser = new JSONParser();


    public String ReadJSONFile (String filePath) throws FileNotFoundException, IOException, ParseException
    {
        Object  arrayobj = Parser.parse(new FileReader(filePath));
        String Arrayobj=arrayobj.toString();
        return Arrayobj;
    }

}
