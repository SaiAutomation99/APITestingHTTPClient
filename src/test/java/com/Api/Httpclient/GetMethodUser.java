package com.Api.Httpclient;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class GetMethodUser {
	
	
	String url="https://reqres.in/api/users?delay=3";
	
	@Test
	public void m1() throws ClientProtocolException, IOException {
		
		CloseableHttpClient client=HttpClients.createDefault();
		
		HttpGet get=new HttpGet(url);
		CloseableHttpResponse response=client.execute(get);
		
		Header[] header=response.getAllHeaders();
		for (Header header2 : header) {
			System.out.println(header2.getName()+    header2.getValue());
		}
		
		String name=EntityUtils.toString(response.getEntity(), "UTF-8");
		
		JSONObject object=new JSONObject(name);
		
		System.out.println(object.toString());
		
		Set<String> keys=object.keySet();
		Iterator<String> kk=keys.iterator();
		while(kk.hasNext()) {
			
			String h=kk.next();
			
			if(object.get(h) instanceof JSONObject) {
				
				System.out.println(object.get(h));
			}
		}
		
		
		
		
		
		
	}
	
	

}
