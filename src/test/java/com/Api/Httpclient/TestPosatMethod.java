package com.Api.Httpclient;

import java.util.ArrayList;
import java.util.List;

public class TestPosatMethod {

	public String name;
	public String job;
	public ArrayList<String> al;
	public String id;
	public String createdAt;

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCreateddate() {
		return createdAt;
	}


	public void setCreateddate(String createdAt) {
		this.createdAt = createdAt;
	}

	public TestPosatMethod(String name, String job,ArrayList<String> al) {

		this.name=name;
		this.job=job;
		this.al=al;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public ArrayList<String> getAl() {
		return al;
	}


	public void setAl(ArrayList<String> al) {
		this.al = al;
	}

	public TestPosatMethod(String name, String job) {

		this.name=name;
		this.job=job;
		//this.al=al;

	}
}
