package com.Api.Httpclient;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


import org.apache.http.Header;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class PostMethod2 {

	public static void main(String[] args) throws ParseException, IOException {
		CloseableHttpClient connection=HttpClients.createDefault();
		HttpGet getmethod=new HttpGet("http://dummy.restapiexample.com/api/v1/employees");
		CloseableHttpResponse response=connection.execute(getmethod);
		String name=EntityUtils.toString(response.getEntity(), "UTF-8");
		JSONObject object=new JSONObject(name);
		Header[] l=response.getAllHeaders();
		for (Header header : l) {
			//System.out.println(header.getName()+"value="+header.getValue());
		}
		//System.out.println(object.toString());
		
		//System.out.println(name);
		Set<String> obj=object.keySet();
		System.out.println(obj.size());
	Iterator<String> it=obj.iterator();
	//System.out.println(it.);
	while(it.hasNext()) {
		System.out.println(it.next());
		
		if(object.get(it.next().trim()) instanceof JSONArray) {
			System.out.println("array");
		}else if(object.get(it.next()) instanceof JSONObject ){
			System.out.println("object");
		}else {
			System.out.println("o");
		}
	}

	}

}
