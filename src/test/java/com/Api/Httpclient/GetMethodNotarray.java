package com.Api.Httpclient;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class GetMethodNotarray {
	
	public JSONObject json=null;
	public String na=null;

	//public boolean b=false;

	
	@Test
	public void getMethod() throws ClientProtocolException, IOException {
		try {
		
		boolean b=m1();
		if(b) {
			
			String h=json.getJSONObject(na).getString("first_name");
			System.out.println(h);
			
		}
		
		}catch(Exception e) {
			
		}
	}
	
	public boolean m1() throws ClientProtocolException, IOException {
		
		String url="https://reqres.in/api/users/2";
		CloseableHttpClient client=HttpClients.createDefault();
		 boolean b=false;

		HttpGet get=new HttpGet(url);
		CloseableHttpResponse respone=client.execute(get);
		
		String name=EntityUtils.toString(respone.getEntity(), "UTF-8");
		
		
		 json=new JSONObject(name);
		
		Set<String> set=json.keySet();
		Iterator<String> in=set.iterator();
		while(in.hasNext()) {
			na=in.next();
			System.out.println(na);
			if(json.get(na) instanceof JSONObject) {
				 b=true;
				// break;
				
			}
		}
		
		
		return b;

	}

}
