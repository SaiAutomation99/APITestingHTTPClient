package OwnData;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class Owndatagetdata {
	
	
	@Test
	public void testData() {
		
		
		String s="{\r\n" + 
				"    \"hello\": {\r\n" + 
				"        \"hai\": \"hai\",\r\n" + 
				"        \"hai1\": \"hai2\"\r\n" + 
				"    },\r\n" + 
				"    \"password\": \"1234\",\r\n" + 
				"    \"username\": \"sai\"\r\n" + 
				"}";
		
		
		JSONObject object=new JSONObject(s);
		
		String user=object.getJSONObject("hello").getString("hai");
		
		//String user=object.get("hello").toString();
		System.out.println(user);
		System.out.println("own data created");
	}

}
