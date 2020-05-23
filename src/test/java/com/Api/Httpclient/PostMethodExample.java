package com.Api.Httpclient;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostMethodExample {
	
	
	@Test
	public void postExample() throws JsonGenerationException, JsonMappingException, IOException {
		
		String url="https://reqres.in/api/users";
		
		HashMap<String,String> hash=new HashMap<String, String>();
		hash.put("Content-Type", "application/json");
		
		ObjectMapper mapper=new ObjectMapper();
//		ArrayList<String> al=new ArrayList<String>();
//		al.add("eve.holt@reqres.in");
//		al.add("pistol1");
		TestPosatMethod test=new TestPosatMethod("morpheus6","leader8");
		

		mapper.writeValue(new File("C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\mapper.json"), test);
		
		//C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\mapper.json
		String writingdatajson=mapper.writeValueAsString(test);
		
		CloseableHttpClient client=HttpClients.createDefault();
		HttpPost post=new HttpPost(url);
		post.setEntity(new StringEntity(writingdatajson));
		
		CloseableHttpResponse response=client.execute(post);
		System.out.println(response.getStatusLine().getStatusCode());
		//System.out.println(response);
		
		String responsename=EntityUtils.toString(response.getEntity(), "UTF-8");
		 
		JSONObject object=new JSONObject(responsename);
		System.out.println(object.toString());

		//TestPosatMethod test1=mapper.readValue(responsename, TestPosatMethod.class);
		//TestPosatMethod user=mapper.readValue(responsename, TestPosatMethod.class);
		
	//	TestPosatMethod users=	mapper.readValue(object.toString(), TestPosatMethod.class);
		
		//System.out.println(user.password.equals(test.getPassword()));
		
		System.out.println(test.name);
		
		
		
	}
	
//	closebaleHttpResponse = restClient.post(url, usersJsonString, headerMap); //call the API
//	
//	//validate response from API:
//	//1. status code:
//	int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
//	Assert.assertEquals(statusCode, testBase.RESPONSE_STATUS_CODE_201);
//	
//	//2. JsonString:
//	String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
//	
//	JSONObject responseJson = new JSONObject(responseString);
//	System.out.println("The response from API is:"+ responseJson);
//	
//	//json to java object:
//	Users usersResObj = mapper.readValue(responseString, Users.class); //actual users object
//	System.out.println(usersResObj);
//	
//	Assert.assertTrue(users.getName().equals(usersResObj.getName()));
//	
//	Assert.assertTrue(users.getJob().equals(usersResObj.getJob()));
//	
//	System.out.println(usersResObj.getId());
//	System.out.println(usersResObj.getCreatedAt());

}
