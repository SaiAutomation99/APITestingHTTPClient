package com.Api.Httpclient;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class GetApiMethod {
	
	
	public boolean flag=false;
	public boolean hiest=false;
	@Test
	public void getMethod() {
		
		
String url="http://dummy.restapiexample.com/api/v1/employees";
		
		CloseableHttpClient client=HttpClients.createDefault();
		HttpGet getmethod=new HttpGet(url);
		try {
		CloseableHttpResponse response=client.execute(getmethod);
		
		String res=EntityUtils.toString(response.getEntity(), "UTF-8");
		
		JSONObject json=new JSONObject(res);
		
		Header[] header=response.getAllHeaders();
		for (Header header2 : header) {
			//System.out.println(header2);
		}
		
		String name=m1("data",json);
		System.out.println(name);
		System.out.println("jxnn");

		
		if(flag) {
			
			System.out.println("object");
		}
		
		if(hiest) {
			System.out.println("array");
			JSONArray jsonarray=new JSONArray(name);
			System.out.println(jsonarray.length());
			for (int i = 0; i < jsonarray.length(); i++) {
				
				
				JSONObject object=new JSONObject(jsonarray.get(i).toString());
				
				Set<String> set=object.keySet();
				
				ArrayList<String> al=new ArrayList<String>(set);
				
				for (int j = 0; j < al.size(); j++) {
					
					if(al.get(j).contains("employee_age")) {
						
						System.out.println(object.get(al.get(j)).toString());
					}
					
				}
				
				
			}
			
			
			
		}
	
		}catch(Exception e) {
			
			
		}
		
	}
	
	public String m1(String s,JSONObject obj) {
		
		
		if(obj.get(s) instanceof JSONObject) {
			flag=true;
			return obj.get(s).toString();
		}else if(obj.get(s) instanceof JSONArray) {
			hiest=true;
			return obj.get(s).toString();
		}
		
		return obj.get(s).toString();
		
		
	
		
		
		
	}

}
