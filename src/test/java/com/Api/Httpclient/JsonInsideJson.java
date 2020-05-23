package com.Api.Httpclient;

import org.testng.annotations.Test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonInsideJson {
	
	
	@Test
	public void jsonInsideJson() {
		


		        String jsonString = "{\n\"status\": \"Success\",\n\"data\": [{\n\"careTypeId\": \"10\",\n\"careTypeName\": \"Vacation Care\",\n\"daysOfinterest\": [\"Monday\", \"Tuesday\"],\n\"childDaysOfInterestId\": \"212\"\n}, {\n\"careTypeId\": \"10\",\n\"careTypeName\": \"Vacation Care\",\n\"daysOfinterest\": [\"Monday\", \"Tuesday\", \"Thursday\"],\n\"childDaysOfInterestId\": \"202\"\n }],\n\"message\": \"ChildDaysOf Interest\"\n }";
		        try {
		            JSONObject mainJsonObject = new JSONObject(jsonString);
		            JSONArray dataArray = mainJsonObject.getJSONArray("data");
		            System.out.println(dataArray.length());
		            for (int i = 0; i < dataArray.length(); i++) {
		                JSONObject jsonObject = dataArray.getJSONObject(i);
		                System.out.println(jsonObject.toString());
		                JSONArray daysOfInterestArray = jsonObject.getJSONArray("daysOfinterest");
		                for (int j = 0; j < daysOfInterestArray.length(); j++) {
		                    System.out.println("Days of interest : " + daysOfInterestArray.get(j));
		                }
		            }
		        } catch (JSONException e) {
		            e.printStackTrace();
		        }

		    }
		}
		
	


