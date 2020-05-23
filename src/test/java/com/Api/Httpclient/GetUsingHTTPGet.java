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

public class GetUsingHTTPGet {
	
	
	@Test
	public void UsingGetMethod() throws ClientProtocolException, IOException {
		
		
		String url="https://reqres.in/api/users?page=2";
		
		CloseableHttpClient client=HttpClients.createDefault();
		HttpGet getmethod=new HttpGet(url);
		CloseableHttpResponse response=client.execute(getmethod);		
		String jsonresponse=EntityUtils.toString(response.getEntity(), "UTF-8");
			
		JSONObject obj=new JSONObject(jsonresponse);       // import org.json.JSONObject;
		
		//System.out.println(obj);
		String name=obj.get("page").toString();
		//System.out.println(name);
		
		//obj.keys();
		
		
		Set<String> all=obj.keySet();
		
	Iterator<String> al=	all.iterator();
	
	
	while(al.hasNext()) {
		
		String h=al.next();
		//System.out.println(h);
		
		
		if(obj.get(h) instanceof JSONObject) {
			
			System.out.println("object");
			
		}else if(obj.get(h) instanceof JSONArray) {
			
			JSONArray json=new JSONArray(obj.get(h).toString());		
			
			System.out.println(json.length());
			
			
			for(int i=0;i<json.length();i++) {
				
				
				JSONObject jsonobj=new JSONObject(json.get(i).toString());
				
				
				Set<String> keys=jsonobj.keySet();
				
				
				Iterator<String> alll=keys.iterator();
				
				if(keys.contains("id")) {
					
					
					System.out.println(jsonobj.get("id").toString());
					break;
				}
			}
		}
	}
	}
}
				
//				while(alll.hasNext()) {
//					
//					
//					//System.out.println(alll.next());
//					
//					if("id".contains(alll.next())) {
//						
//						
//						//System.out.println(jsonobj.get("id").toString());
//					}
//					
//				//	System.out.println(jsonobj.get(alll.next()).toString());
//					
//					// Object objj=jsonobj.get(alll.next());
//					 
////					 if(alll.next().contains("id")) {
////						 
////						 Object objj=jsonobj.get(alll.next());
////						// System.out.println(objj.toString());
////						 break;
////						 
////					 }else {
////						 
////						 System.out.println("came to else");
////					 }	
//				}
//				
//				
//			}
//			
//		}
//	}	
//		
//	}

