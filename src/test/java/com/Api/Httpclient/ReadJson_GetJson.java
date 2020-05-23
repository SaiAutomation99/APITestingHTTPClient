package com.Api.Httpclient;

import java.io.BufferedReader;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class ReadJson_GetJson {


	@Test
	public void readJson() throws Exception{
		String linereader=null;

		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\Create.json"));

		String line=bf.readLine();
		//System.out.println(line);
		while(line!=null) {

			linereader=line;
			line=bf.readLine();

		}

		JSONObject json=new JSONObject(linereader);
		System.out.println(json);
		
		String name_firstname=json.get("name").toString();
		System.out.println(name_firstname);

		String city=json.getJSONObject("address").getString("city");

		System.out.println("city-----------"+city);

		JSONArray array=json.getJSONArray("phoneNumbers");
		System.out.println(array.length());

		for (int i = 0; i < array.length(); i++) {

			JSONObject obj=array.getJSONObject(i);
			String type=obj.get("type").toString();
			System.out.println(type);

		}


		bf.close();



	}

}
