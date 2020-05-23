package com.Api.Httpclient;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class JsonInsideJsonPractise {
	
	
	
	@Test
	public void insideJson() {
		
        String jsonString = "{\n\"status\": \"Success\",\n\"data\": [{\n\"careTypeId\": \"10\",\n\"careTypeName\": \"Vacation Care\",\n\"interest\": [\"Monday\", \"Tuesday\"],\n\"childDaysOfInterestId\": \"212\"\n}, {\n\"careTypeId\": \"10\",\n\"careTypeName\": \"Vacation Care\",\n\"daysOfinterest\": [\"Monday\", \"Tuesday\", \"Thursday\"],\n\"childDaysOfInterestId\": \"202\"\n }],\n\"message\": \"ChildDaysOf Interest\"\n }";

        
        JSONObject obj=new JSONObject(jsonString);
        
       String name= obj.get("status").toString();
       
     JSONArray array=  obj.getJSONArray("data");
     
     for (int i = 0; i < array.length(); i++) {
    	 
    	JSONObject obja= array.getJSONObject(i);
    	System.out.println(obja);
    	//obja.get(key)
    	if(obja.toString().contains("212")) {
    		
        	JSONArray array1=obja.getJSONArray("interest");
        	for (int j = 0; j < array1.length(); j++) {
    			System.out.println(array1.get(j));
    		}
    		
    	}else if(obja.toString().contains("202")) {
    		
    	JSONArray array1=obja.getJSONArray("daysOfinterest");
    	for (int j = 0; j < array1.length(); j++) {
			System.out.println(array1.get(j));
		}
    	
    	}
		
	}
        
  //daysOfinterest
        
        
	}

}
