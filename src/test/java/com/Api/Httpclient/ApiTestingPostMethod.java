package com.Api.Httpclient;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Iterator;
import java.util.Set;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class ApiTestingPostMethod {
	
	public static void jsonarray(JSONObject obj,JSONArray object) {
		//System.out.println(object.toString());
		System.out.println("lenght>>>>"+object.length());
		for(int i=0;i<object.length();i++) {
			
			System.out.println(object.get(i));
			JSONObject k=new JSONObject(object.get(i).toString());
			Set<String> keys=k.keySet();
			Iterator<String> it=keys.iterator();
			String keyname="";
			while(it.hasNext()) {
				 keyname=it.next();
				System.out.println("keys>>>>"+keyname);
				break;
				
			}
			System.out.println(keyname);
			System.out.println(k.get(keyname));
			
			if(k.get(keyname).toString().isEmpty()) {
				String name=k.get(keyname).toString().replace("", "sai");
				System.out.println(name);
			}else {
				System.out.println("not found");
			}
			
		}
		//JSONObject obj1=new JSONObject(object.toString());
		
		
	}

	public static void main(String[] args) throws ClientProtocolException, IOException {
		CloseableHttpClient connection=HttpClients.createDefault();
		HttpGet getmethod=new HttpGet("http://dummy.restapiexample.com/api/v1/employees");
		CloseableHttpResponse response=connection.execute(getmethod);
		String name=EntityUtils.toString(response.getEntity(), "UTF-8");
		JSONObject object=new JSONObject(name);
		Header[] header=response.getAllHeaders();
		for (Header header2 : header) {
			System.out.println(header2.getName()+"+"+header2.getValue());
		}		
		Set<String> keys=object.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			String keyname=it.next();
			System.out.println(">>>>>>>>>>>>>>>>>>"+keyname);
			
			if(object.get(keyname) instanceof JSONArray) {
				//JSONArray h=null;
				jsonarray(object,object.getJSONArray(keyname));
				//jsonarray(object,h);

 
				
			}else if(object.get(keyname) instanceof JSONObject) {
				
				 
			}
		}
		//System.out.println(object);
		if(object instanceof JSONObject){
			//System.out.println(object);
		}

	}

}
