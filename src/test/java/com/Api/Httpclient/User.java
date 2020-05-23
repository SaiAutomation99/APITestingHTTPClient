package com.Api.Httpclient;

import java.util.List;

public class User {
	
	
	
	public String name;
	public String age;
	//public User user;
	
	public List<String> order=null;
	
	public User(String name,String age) {
		
		this.name=name;
		this.age=age;
		
	}
	
	public User(List<String> order) {
		
		this.order=order;
		//this.user=user;
	}
	
	//getters and setters
	public String getName() {
		
		return name;
	}
	public String getAge() {
		
		return age;
	}
	
	public void setName(String name) {
		
		this.name=name;
		
	}
	public void setAge(String age) {
		
		this.age=age;
		
	}
	
	public void setOrder(List<String> order) {
		
		this.order=order;
	}
	
	public List<String> getOrder(){
		return order;
	}
}
