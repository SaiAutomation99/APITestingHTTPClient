package com.Api.Httpclient;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;


public class PostMethodApi {
	
	
	
	public CloseableHttpResponse postMethod(String endpointurl) throws ClientProtocolException, IOException {
		
		
		
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("Content-Type", "application/json");
		
		
		System.out.println("enter");
		
		ObjectMapper mapper=new ObjectMapper();
		
//		User user=new User("morpheus","leader");
	ArrayList<String> al=new ArrayList<String>();
	al.add("eve.holt@reqres.in");
		al.add("pistol");
		TestPosatMethod test=new TestPosatMethod("morpheus","leader",al);

//		System.out.println(user.getName());
//		System.out.println(user.getAge());
//		System.out.println("user");
		
		mapper.writeValue(new File("C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\file.json"), test);
		
		String jsonstring=mapper.writeValueAsString(test);
		
		
		
		CloseableHttpClient client=HttpClients.createDefault();
		
		HttpPost post=new HttpPost(endpointurl);
		post.setEntity(new StringEntity(jsonstring));
		
		CloseableHttpResponse response=client.execute(post);
		
		return response;
		
	}

	public static void main(String[] args) {
		
		String endpointurl="https://reqres.in/api/users";
		
		PostMethodApi j=new PostMethodApi();
		try {
		CloseableHttpResponse response=j.postMethod(endpointurl);
		
		System.out.println(response.getStatusLine().getStatusCode());
		
		System.out.println(response.toString());
		
		
		}catch(Exception e) {
			
			System.out.println("enters catch block");
			
			e.printStackTrace();
		}
		
	}

}
