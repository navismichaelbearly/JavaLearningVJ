package com.n2s;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userid")
	private int userid;
	
	private String username;
	
	private Set<Contact> phonenumbers = new HashSet<Contact>();
	
	
	public User() {
	
	}
	
	
	public User(String username, Set<Contact> phonenumbers) {
		super();
		this.username = username;
		this.phonenumbers = phonenumbers;
	}


	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Contact> getPhonenumbers() {
		return phonenumbers;
	}

	public void setPhonenumbers(Set<Contact> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}
	
	
	
	
	
}
