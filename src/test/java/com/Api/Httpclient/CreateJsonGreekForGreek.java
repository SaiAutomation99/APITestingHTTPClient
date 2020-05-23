package com.Api.Httpclient;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreateJsonGreekForGreek {
	
	
	
	@Test
	public void createJson() throws FileNotFoundException {
		
		
		JSONObject jsonobj=new JSONObject();
		
		jsonobj.put("name", "sai");
		jsonobj.put("age", "12");
		jsonobj.put("lastname", "prasanth");
		 Map m = new LinkedHashMap(4); 
	        m.put("streetAddress", "21 2nd Street"); 
	        m.put("city", "New York"); 
	        m.put("state", "NY"); 
	        m.put("postalCode", 10021); 
	          
	        // putting address to JSONObject 
	        jsonobj.put("address", m);
	        
	        JSONArray array=new JSONArray();
	        
	        
	        m=new LinkedHashMap();
	        
	        m.put("type", "home"); 
	        m.put("number", "212 555-1234"); 
	       
	        array.add(m);
	        
	        jsonobj.put("phoneNumbers", array); 
	
		  PrintWriter pw = new PrintWriter("C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\Create.json"); 
	        pw.write(jsonobj.toString()); 
	          
	        pw.flush(); 
	        pw.close();		
	}

}
