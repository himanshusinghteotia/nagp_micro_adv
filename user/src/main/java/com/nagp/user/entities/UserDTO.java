package com.nagp.user.entities;

public class UserDTO {
	private String name;
	private String age;
	private String email;
	
	public UserDTO() { }
	
	public UserDTO(String name,String age,String email) {
		this.name = name;
		this.age=age;
		this.email=email;
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
