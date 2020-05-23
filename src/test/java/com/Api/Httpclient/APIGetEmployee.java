package com.Api.Httpclient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class APIGetEmployee {
	
	@Test
	public void testData() throws ClientProtocolException, IOException {
		
		
		String s="http://dummy.restapiexample.com/api/v1/employees";
		
		CloseableHttpClient client=HttpClients.createDefault();
		HttpGet get=new HttpGet(s);
		CloseableHttpResponse response=client.execute(get);
		String g=EntityUtils.toString(response.getEntity(), "UTF-8");
		JSONObject object=new JSONObject(g);
		Set<String> m=object.keySet();
		Iterator<String> al=m.iterator();
		while(al.hasNext()) {
			
			System.out.println(al.next());
			System.out.println(object.get(al.next()));
			
			
			
		
		}
		//object.putOnce(key, value)
		JSONArray array=object.getJSONArray("data");
		HashMap<String, String> hash=new HashMap<String, String>();
		
		
		for (int i = 0; i < array.length(); i++) {
			
			JSONObject arr=array.getJSONObject(i);
			
			JSONObject json=new JSONObject(arr.toString());
//			Set<String> str=json.keySet();
//			System.out.println(str);
//			Iterator<String> it=str.iterator();
//			while(it.hasNext()) {
//				
////				System.out.println(it.next().toString());
////				System.out.println(json.get(it.next()).toString());
////				//hash.put(it.next().toString(), json.get(it.next()).toString());
//
//			}
			
			//JSONObject jsonobj=new JSONObject(arr.toString());
			
			
			//arr.getJSONObject("employee_salary").
			
			String s1=json.get("id").toString();
			
		System.out.println(s1);
			
			
		}
		
		
		String name=object.get("status").toString();
		
		
		
		
		System.out.println(hash);
		
		
		
		
		
	}

}
