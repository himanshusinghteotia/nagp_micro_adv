package com.nagp.user.entities;

public class User {
	private Integer id;
	private String name;
	private String age;
	private String email;
	
	public User() {}
	
	public User(Integer id, String name,String age,String email) {
		this.id = id;
		this.name = name;
		this.age=age;
		this.email=email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
