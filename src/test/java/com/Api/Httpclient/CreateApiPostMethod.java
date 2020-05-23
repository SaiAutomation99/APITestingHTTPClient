package com.Api.Httpclient;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreateApiPostMethod {
	
	
	@Test
	public void createPost() throws ClientProtocolException, IOException {
		
		String name="https://reqres.in/api/register/1";
		
		CloseableHttpClient client=HttpClients.createDefault();
		
		HttpPost post=new HttpPost(name);
		
		HashMap map=new HashMap();
		map.put("Content-Type", "application/json");
		
		
		JSONObject object=new JSONObject();
		
		object.put("user", "sai123659");
		
		PrintWriter ps=new PrintWriter("C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\post.json");
		ps.write(object.toJSONString());
		
		ps.flush();
		ps.close();
		
		post.setEntity(new StringEntity(object.toString()));
		
		
		CloseableHttpResponse response=client.execute(post);
		
		int i=response.getStatusLine().getStatusCode();
		System.out.println(i);
		
		
		String names=EntityUtils.toString(response.getEntity(), "UTF-8");
		System.out.println(names);
		
	
	}

}
