package com.Api.Httpclient;

import java.io.PrintWriter;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreateJsonByDemo {
	
	@Test
	public void createDemoJson() {
		
		
		JSONObject obj=new JSONObject();
		
		obj.put("name", "value");
		
		HashMap hash=new HashMap();
		
		hash.put("value", "name");
		
		
		JSONArray array=new JSONArray();
		//HashMap hash1=new HashMap();
		hash.put("kk", "ll");
		
		obj.put("hash", hash);
		
		array.add(hash);
		
		
		
	obj.put("array", array);
	PrintWriter pw=null;
	try {
	 pw=new PrintWriter("C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\jsoncreate.json");
	pw.write(obj.toJSONString());
	
	
	}catch(Exception e) {
		
		
	}finally {
		pw.flush();
		pw.close();
	}
	
		
		
	}

}
