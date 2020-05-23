package com.Api.Httpclient;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class JsonArrayInsideJsonArray {
	
	@Test(priority = 1)
	public void arrayInsideArray() {
		
		 String jsonarray="{\r\n" + 
		 		"  \"meta\": {\r\n" + 
		 		"    \"code\": 200\r\n" + 
		 		"  },\r\n" + 
		 		"  \"data\": [\r\n" + 
		 		"    [\r\n" + 
		 		"      {\r\n" + 
		 		"        \"_index\": \"test\",\r\n" + 
		 		"        \"_type\": \"test\",\r\n" + 
		 		"        \"_id\": \"sdgsdfg\",\r\n" + 
		 		"        \"_version\": 1,\r\n" + 
		 		"        \"_shards\": {\r\n" + 
		 		"          \"total\": 2,\r\n" + 
		 		"          \"successful\": 1,\r\n" + 
		 		"          \"failed\": 0\r\n" + 
		 		"        },\r\n" + 
		 		"        \"created\": true\r\n" + 
		 		"      },\r\n" + 
		 		"      {\r\n" + 
		 		"        \"_index\": \"test\",\r\n" + 
		 		"        \"_type\": \"test\",\r\n" + 
		 		"        \"_id\": \"test\",\r\n" + 
		 		"        \"_version\": 1,\r\n" + 
		 		"        \"_shards\": {\r\n" + 
		 		"          \"total\": 2,\r\n" + 
		 		"          \"successful\": 1,\r\n" + 
		 		"          \"failed\": 0\r\n" + 
		 		"        },\r\n" + 
		 		"        \"created\": true\r\n" + 
		 		"      },\r\n" + 
		 		"\r\n" + 
		 		"    ]\r\n" + 
		 		"  ]\r\n" + 
		 		"}";
		 
		 
		 JSONObject obj=new JSONObject(jsonarray);
		int code=obj.getJSONObject("meta").getInt("code");
		System.out.println(code);
		JSONArray jsonarray1=obj.getJSONArray("data");
		
		for (int i = 0; i < jsonarray1.length(); i++) {
			
			JSONArray array2 =jsonarray1.getJSONArray(i);
			
			for (int j = 0; j < array2.length(); j++) {
				
				
				int h=array2.getJSONObject(i).getJSONObject("_shards").getInt("total");
				System.out.println(h);
			}
		}
		
	}
	
	
	
	
	@Test(enabled = false)
	public void m1() {
		
		
		String str="{\r\n" + 
				"  \"name\":\"John\",\r\n" + 
				"  \"age\":30,\r\n" + 
				"  \"cars\": [\r\n" + 
				"    { \"name\":\"Ford\", \"models\":[ \"Fiesta\", \"Focus\", \"Mustang\" ] },\r\n" + 
				"    { \"name\":\"BMW\", \"models\":[ \"320\", \"X3\", \"X5\" ] },\r\n" + 
				"    { \"name\":\"Fiat\", \"models\":[ \"500\", \"Panda\" ] }\r\n" + 
				"  ]\r\n" + 
				" }";
		
		JSONObject json=new JSONObject(str);
		
		JSONArray array=json.getJSONArray("cars");
		System.out.println(array.length());

		for (int i = 0; i < array.length(); i++) {
			
			JSONArray array1=array.getJSONObject(i).getJSONArray("models");
			System.out.println(array1.length());
			for (int j = 0; j < array1.length(); j++) {
				
				System.out.println(array1.getJSONObject(j).toString());
				
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
