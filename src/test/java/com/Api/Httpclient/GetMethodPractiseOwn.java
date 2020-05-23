package com.Api.Httpclient;

import java.util.Iterator;
import java.util.Set;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class GetMethodPractiseOwn {
	
	
	@Test
	public void getMethod() {
		
		CloseableHttpResponse response=null;
		String name=null;
		
		String dummyspiurl="https://reqres.in/api/users/2";
		
		CloseableHttpClient client=HttpClients.createDefault();
		HttpGet get=new HttpGet(dummyspiurl);
		try {
		response=client.execute(get);
	name	=EntityUtils.toString(response.getEntity(), "UTF-8");

		
		}catch(Exception e) {
			
		}
		
		JSONObject json=new JSONObject(name);
		System.out.println(json);
		
		//String h=json.get("email").toString();
		//System.out.println(h);
		
		Set<String> set=json.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			
		String keys	=it.next();
		System.out.println("keysset-----------------"+keys);
		
		if(json.get(keys) instanceof JSONObject) {
			
			System.out.println("object"+json.get(keys).toString());
			
			Object obj=json.get(keys);
			JSONObject json1=new JSONObject(obj.toString());
			//String id=json1.get("id").toString();
			Set<String> set1=json1.keySet();
			Iterator<String> it1=set1.iterator();
			while(it1.hasNext()) {
				
				//System.out.println(it1.next());
				
				//System.out.println("data----------------------"+json1.get("text"));
				
				if(it1.next().equals("last_name")) {
					
					System.out.println("qqqqqqqqqqqqqqqqqq"+json1.get(it1.next()));
				}
			}

		}else if (json.get(keys) instanceof JSONArray) {
			
			System.out.println("array"+json.get(keys));
			
		}
		}
		
		
		
		
		
	}

}
