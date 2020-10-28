package com.guru.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HelloBean {
	
	@Id
	private long id;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloBean(String message) {
		super();
		this.message = message;
	}

	public HelloBean() {
		super();
	}

	@Override
	public String toString() {
		return "HelloBean [message=" + message + "]";
	}
	
	
	
}
