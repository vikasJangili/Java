package com.java.spring.beans;

public class Student {

	private int id;
	private String name;
	private String branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void printDetails() {
		System.out.println("student details are "+this.getId() +"::"+this.getName() +":: "+this.getBranch());
	}

}
