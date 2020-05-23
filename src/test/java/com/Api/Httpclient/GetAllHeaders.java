package com.Api.Httpclient;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.annotations.Test;

public class GetAllHeaders {
	
	
	
	@Test
	public void getAllHeaders() {
		
		String url="https://reqres.in/api/users?page=2";
		
		try {
		CloseableHttpClient connection=HttpClients.createDefault();
		HttpGet getcall=new HttpGet(url);
		CloseableHttpResponse response=connection.execute(getcall);
		
		Header[] header=response.getAllHeaders();
		
		
		HashMap<String, String> hash=new HashMap<String, String>();
		
		for (Header header2 : header) {
			//System.out.println(header2.getName()  +  "-----"+header2.getValue());
			
			hash.put(header2.getName(), header2.getValue());
			
		}
		System.out.println(hash);
		
		Set<String> keyset=hash.keySet();
		
		Iterator<String> it=keyset.iterator();
		
		while(it.hasNext()) {
			
			String name=it.next();
			if(name.contains("Age")) {
				
				
				System.out.println("Age    :"+hash.get(name));
			}
			
		}
		
		
		}catch (Exception e) {
			
			
		}finally {
			
			System.out.println("finally");
			
		}
		
		
		
		
	}

}
