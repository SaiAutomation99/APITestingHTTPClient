package com.Api.Httpclient;

import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreateJson2 {
	
	
	@Test
	public void CreateJson() throws Exception{
		
		JSONObject json=new JSONObject();
		
		json.put("name", "sai");
		json.put("name1", "sai1");
		json.put("name2", "sai2");
		
		
		Map map=new LinkedHashMap();
		map.put("name3", "sai3");
		map.put("name4", "sai4");
		map.put("name5", "sai5");
		
		json.put("address", map);
		
		JSONArray array=new JSONArray();
		
		Map map1=new LinkedHashMap();
		map1.put("array", "data");
		
		array.add(map1);
		
		json.put("Arrays", array);
		
		PrintWriter writer=new PrintWriter("C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\CreateJson1.json");
		writer.write(json.toJSONString());
		


		writer.flush();
		writer.close();
		
		
	}

}
