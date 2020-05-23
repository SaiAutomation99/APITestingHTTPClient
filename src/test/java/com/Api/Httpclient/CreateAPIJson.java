package com.Api.Httpclient;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreateAPIJson {
	
	
	@Test
	public void createJson() {
		
		
		JSONObject object=new JSONObject();
		
		object.put("username", "sai");
		object.put("password", "1234");
		
		Map map=new HashMap();
		
		map.put("hai", "hai");
		map.put("hai1", "hai2");
		
		object.put("hello", map);
		
		try {
		PrintWriter print=new PrintWriter("C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\create1.json");
		print.write(object.toJSONString());
		print.flush();
		print.close();
		
		}catch(Exception e) {
			
		}
		
	}

}
