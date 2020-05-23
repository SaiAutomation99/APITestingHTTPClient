package com.Api.Httpclient;

import java.util.Iterator;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class ValueGet {
	
	
	
	///this is for the string without array
	
	@Test(enabled = false)
	public void m1() {
		
		String s="{\r\n" + 
				"    \"User\": {\r\n" + 
				"        \"FirstName\": \"John\",\r\n" + 
				"        \"LastName\": \"Reese\"\r\n" + 
				"    },\r\n" + 
				"    \"Command\": \"CreateNewUser\"\r\n" + 
				"}";
		
		
		
		JSONObject json=new JSONObject(s);
		
		//String s1=json.getJSONObject("User").getString("LastName").toString();
		
		String name=json.get("User").toString();
		JSONObject jsonObject=new JSONObject(name);
		
		String firstname=jsonObject.get("FirstName").toString();
System.out.println(firstname);
	
		//System.out.println(s1);
		
		
				
	}
	
	@Test(enabled = false)
	public void jsonArray() {
		
		 boolean b=false;
		 String arrayname=null;
		
		String jsonarray="{\"employees\":[    \r\n" + 
				"    {\"name\":\"Ram\", \"email\":\"ram@gmail.com\", \"age\":23},    \r\n" + 
				"    {\"name\":\"Shyam\", \"email\":\"shyam23@gmail.com\", \"age\":28},  \r\n" + 
				"    {\"name\":\"John\", \"email\":\"john@gmail.com\", \"age\":33},    \r\n" + 
				"    {\"name\":\"Bob\", \"email\":\"bob32@gmail.com\", \"age\":41}   \r\n" + 
				"]}  ";
		
		JSONObject object=new JSONObject(jsonarray);
		
		
		Set<String> key=object.keySet();
		Iterator<String> it=key.iterator();
		while(it.hasNext()) {
		 arrayname	=it.next();
			System.out.println(arrayname);
			if(object.get(arrayname) instanceof JSONArray) {
				
				b=true;
			}
		}
		
		if(b) {
			System.out.println(b);
			JSONArray array=object.getJSONArray(arrayname);
			System.out.println(array.length());
			
			for (int i = 0; i < array.length(); i++) {
				
				JSONObject obj=array.getJSONObject(i);
				
				String name=obj.get("name").toString();
				
				System.out.println(name);
				
				break;
				
			}
		}
		
	}
	@Test(enabled = false)
	public void jsonResponse() {
		
		String str="{\r\n" + 
				"\"name\":\"John\",\r\n" + 
				"\"age\":30,\r\n" + 
				"\"cars\":[ \"Ford\", \"BMW\", \"Fiat\" ]\r\n" + 
				"}";
		
		JSONObject json=new JSONObject(str);
		String s=json.get("cars").toString();
		System.out.println(s);
		
		
		
	}
	
	@Test
	public void StrResponse() {
		
		String str="myObj = {\r\n" + 
				"  \"name\":\"John\",\r\n" + 
				"  \"age\":30,\r\n" + 
				"  \"cars\": [\r\n" + 
				"    { \"name\":\"Ford\", \"models\":[ \"Fiesta\", \"Focus\", \"Mustang\" ] },\r\n" + 
				"    { \"name\":\"BMW\", \"models\":[ \"320\", \"X3\", \"X5\" ] },\r\n" + 
				"    { \"name\":\"Fiat\", \"models\":[ \"500\", \"Panda\" ] }\r\n" + 
				"  ]\r\n" + 
				" }";
		
		
		String d="{\r\n" + 
				"\"claim_loss_type_cd\": \"TEL\",\r\n" + 
				"\"claim_type\": \"002\",\r\n" + 
				"\"claim_reason\": \"001\",\r\n" + 
				"\"policy_number\": \"1234kk3366ff664\",\r\n" + 
				"\"info\": {\r\n" + 
				"    \"ApplicationContext\": {\r\n" + 
				"        \"country\": \"US\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		
		JSONObject json=new JSONObject(d);
		String s=json.getJSONObject("info").getJSONObject("ApplicationContext").getString("country");
		
		
		System.out.println(s);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
