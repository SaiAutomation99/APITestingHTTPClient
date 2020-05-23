package com.Api.Httpclient;

import java.util.Iterator;
import java.util.Set;

import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class JsonGetCall {
	
	@Test
	public void m1() {
		
		String name="{\r\n" + 
				"    \"users\": [{\r\n" + 
				"            \"id\": 2244994945,\r\n" + 
				"            \"id_str\": \"2244994945\",\r\n" + 
				"            \"name\": \"Twitter Dev\",\r\n" + 
				"            \"screen_name\": \"TwitterDev\",\r\n" + 
				"            \"location\": \"Internet\",\r\n" + 
				"            \"description\": \"Your official source for Twitter Platform news, updates & events. Need technical help? Visit https://t.co/mGHnxZU8c1 ⌨️ #TapIntoTwitter\",\r\n" + 
				"            \"url\": \"https://t.co/FGl7VOULyL\",\r\n" + 
				"            \"entities\": {\r\n" + 
				"                \"url\": {\r\n" + 
				"                    \"urls\": [{\r\n" + 
				"                            \"url\": \"https://t.co/FGl7VOULyL\",\r\n" + 
				"                            \"expanded_url\": \"https://developer.twitter.com/\",\r\n" + 
				"                            \"display_url\": \"developer.twitter.com\",\r\n" + 
				"                            \"indices\": [\r\n" + 
				"                                0,\r\n" + 
				"                                23\r\n" + 
				"                            ]\r\n" + 
				"                        }\r\n" + 
				"                    ]\r\n" + 
				"                },\r\n" + 
				"                \"description\": {\r\n" + 
				"                    \"urls\": [{\r\n" + 
				"                            \"url\": \"https://t.co/mGHnxZU8c1\",\r\n" + 
				"                            \"expanded_url\": \"https://twittercommunity.com/\",\r\n" + 
				"                            \"display_url\": \"twittercommunity.com\",\r\n" + 
				"                            \"indices\": [\r\n" + 
				"                                93,\r\n" + 
				"                                116\r\n" + 
				"                            ]\r\n" + 
				"                        }\r\n" + 
				"                    ]\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"protected\": false,\r\n" + 
				"            \"followers_count\": 502084,\r\n" + 
				"            \"friends_count\": 1472,\r\n" + 
				"            \"listed_count\": 1514,\r\n" + 
				"            \"created_at\": \"Sat Dec 14 04:35:55 +0000 2013\",\r\n" + 
				"            \"favourites_count\": 2203,\r\n" + 
				"            \"utc_offset\": null,\r\n" + 
				"            \"time_zone\": null,\r\n" + 
				"            \"geo_enabled\": true,\r\n" + 
				"            \"verified\": true,\r\n" + 
				"            \"statuses_count\": 3393,\r\n" + 
				"            \"lang\": \"en\",\r\n" + 
				"            \"contributors_enabled\": false,\r\n" + 
				"            \"is_translator\": false,\r\n" + 
				"            \"is_translation_enabled\": null,\r\n" + 
				"            \"profile_background_color\": \"null\",\r\n" + 
				"            \"profile_background_image_url\": \"null\",\r\n" + 
				"            \"profile_background_image_url_https\": \"null\",\r\n" + 
				"            \"profile_background_tile\": null,\r\n" + 
				"            \"profile_image_url\": \"null\",\r\n" + 
				"            \"profile_image_url_https\": \"https://pbs.twimg.com/profile_images/880136122604507136/xHrnqf1T_normal.jpg\",\r\n" + 
				"            \"profile_banner_url\": \"https://pbs.twimg.com/profile_banners/2244994945/1498675817\",\r\n" + 
				"            \"profile_link_color\": \"null\",\r\n" + 
				"            \"profile_sidebar_border_color\": \"null\",\r\n" + 
				"            \"profile_sidebar_fill_color\": \"null\",\r\n" + 
				"            \"profile_text_color\": \"null\",\r\n" + 
				"            \"profile_use_background_image\": false,\r\n" + 
				"            \"has_extended_profile\": null,\r\n" + 
				"            \"default_profile\": false,\r\n" + 
				"            \"default_profile_image\": false,\r\n" + 
				"            \"following\": false,\r\n" + 
				"            \"follow_request_sent\": false,\r\n" + 
				"            \"notifications\": false,\r\n" + 
				"            \"translator_type\": \"null\"\r\n" + 
				"        }, {\r\n" + 
				"            \"id\": 6253282,\r\n" + 
				"            \"id_str\": \"6253282\",\r\n" + 
				"            \"name\": \"Twitter API\",\r\n" + 
				"            \"screen_name\": \"TwitterAPI\",\r\n" + 
				"            \"location\": \"San Francisco, CA\",\r\n" + 
				"            \"description\": \"The Real Twitter API. Tweets about API changes, service issues and our Developer Platform. Don't get an answer? It's on my website.\",\r\n" + 
				"            \"url\": \"https://t.co/8IkCzCDr19\",\r\n" + 
				"            \"entities\": {\r\n" + 
				"                \"url\": {\r\n" + 
				"                    \"urls\": [{\r\n" + 
				"                            \"url\": \"https://t.co/8IkCzCDr19\",\r\n" + 
				"                            \"expanded_url\": \"https://developer.twitter.com\",\r\n" + 
				"                            \"display_url\": \"developer.twitter.com\",\r\n" + 
				"                            \"indices\": [\r\n" + 
				"                                0,\r\n" + 
				"                                23\r\n" + 
				"                            ]\r\n" + 
				"                        }\r\n" + 
				"                    ]\r\n" + 
				"                },\r\n" + 
				"                \"description\": {\r\n" + 
				"                    \"urls\": []\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"protected\": false,\r\n" + 
				"            \"followers_count\": 502084,\r\n" + 
				"            \"friends_count\": 1472,\r\n" + 
				"            \"listed_count\": 1514,\r\n" + 
				"            \"created_at\": \"Sat Dec 14 04:35:55 +0000 2013\",\r\n" + 
				"            \"favourites_count\": 2203,\r\n" + 
				"            \"utc_offset\": null,\r\n" + 
				"            \"time_zone\": null,\r\n" + 
				"            \"geo_enabled\": true,\r\n" + 
				"            \"verified\": true,\r\n" + 
				"            \"statuses_count\": 3393,\r\n" + 
				"            \"lang\": \"en\",\r\n" + 
				"            \"contributors_enabled\": false,\r\n" + 
				"            \"is_translator\": false,\r\n" + 
				"            \"is_translation_enabled\": null,\r\n" + 
				"            \"profile_background_color\": \"null\",\r\n" + 
				"            \"profile_background_image_url\": \"null\",\r\n" + 
				"            \"profile_background_image_url_https\": \"null\",\r\n" + 
				"            \"profile_background_tile\": null,\r\n" + 
				"            \"profile_image_url\": \"null\",\r\n" + 
				"            \"profile_image_url_https\": \"https://pbs.twimg.com/profile_images/880136122604507136/xHrnqf1T_normal.jpg\",\r\n" + 
				"            \"profile_banner_url\": \"https://pbs.twimg.com/profile_banners/2244994945/1498675817\",\r\n" + 
				"            \"profile_link_color\": \"null\",\r\n" + 
				"            \"profile_sidebar_border_color\": \"null\",\r\n" + 
				"            \"profile_sidebar_fill_color\": \"null\",\r\n" + 
				"            \"profile_text_color\": \"null\",\r\n" + 
				"            \"profile_use_background_image\": false,\r\n" + 
				"            \"has_extended_profile\": null,\r\n" + 
				"            \"default_profile\": false,\r\n" + 
				"            \"default_profile_image\": false,\r\n" + 
				"            \"following\": false,\r\n" + 
				"            \"follow_request_sent\": false,\r\n" + 
				"            \"notifications\": false,\r\n" + 
				"            \"translator_type\": \"null\"\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    \"next_cursor\": 0,\r\n" + 
				"    \"next_cursor_str\": \"0\",\r\n" + 
				"    \"previous_cursor\": 0,\r\n" + 
				"    \"previous_cursor_str\": \"0\",\r\n" + 
				"    \"total_count\": null\r\n" + 
				"}";
		
		JSONObject object=new JSONObject(name);
		Set<String> str=object.keySet();
		Iterator<String> al=str.iterator();
		while(al.hasNext()) {
			
			System.out.println(al.next());
		}
		
		JSONArray array=object.getJSONArray("users");
		//System.out.println(array.length());
		
		for (int i = 0; i < array.length(); i++) {
			
			
			JSONObject obj=array.getJSONObject(i);
			JSONObject ob=new JSONObject(obj.toString());
			
			JSONArray array1=obj.getJSONObject("entities").getJSONObject("url").getJSONArray("urls");
			
			for (int j = 0; j < array1.length(); j++) {
				JSONObject obj1=array.getJSONObject(i);
				String l=obj1.get("url").toString();
				System.out.println(l);

				
				
			}
			System.out.println(array1.length());
			
		}
		
		
		
	}

}
