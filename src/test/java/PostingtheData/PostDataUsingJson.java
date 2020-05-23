package PostingtheData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostDataUsingJson {
	
	
	
	
	@Test
	public void dataPost() throws ClientProtocolException, IOException {
		
		
		JSONObject obj=new JSONObject();
		
		obj.put("key", "value");
		CloseableHttpClient client=HttpClients.createDefault();
		
		HttpPost post=new HttpPost("https://reqres.in/api/users");
		post.setHeader("Content-Type", "application/json");
		
		post.setEntity(new StringEntity(obj.toString()));
		
		File f=new File("C:\\Users\\Sai\\eclipse-workspace\\APIJavaHTTPClient\\src\\test\\java\\com\\Api\\Httpclient\\Create4.json");
		PrintWriter pw=new PrintWriter(f);
		pw.write(obj.toString());
		
		
		CloseableHttpResponse response=client.execute(post);
		System.out.println(response.getStatusLine().getStatusCode());
		
		
		pw.flush();
		pw.close();
		
		
	}

}
