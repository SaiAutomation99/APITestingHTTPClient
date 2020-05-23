package com.Api.Httpclient;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreateJsonOwn {
	
	String jsonstring=null;
	
	
	@Test
	public void mainJson() throws Exception {
		 jsonstring=createMethod();
		
		System.out.println(jsonstring);
		
		String h=m1(jsonstring);
		System.out.println(h);
		
	}
	
	public String createMethod() throws Exception {
	
	JSONObject json=new JSONObject();
	json.put("name", "sai");
	
	JSONArray array=new JSONArray();
	
	Map map=new LinkedHashMap();
	map.put("lastname","prasanth");
	map.put("firstname", "padiginati");
	
	map.put("middlename", "[sai,p]");
	
	array.add(map);	
	
	json.put("values", array);
	
	
	PrintWriter pw=new PrintWriter("C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\CreateJson.json");
	pw.write(json.toJSONString());
	
	
	
	pw.flush();
	pw.close();
	
	return json.toJSONString();
	}
	
	public String m1(String json) {
		org.json.JSONObject object=null;
		
		org.json.JSONObject json1=new org.json.JSONObject(json);
		
		String name=json1.get("name").toString();
		
		System.out.println(name);
		
		org.json.JSONArray array=json1.getJSONArray("values");
				
		for (int i = 0; i < array.length(); i++) {
			
			object=array.getJSONObject(i);
			
			System.out.println(object.toString());
			
			String v=object.getString("middlename");
			System.out.println(v);
				
		}
		return object.getString("middlename");
	}

}
