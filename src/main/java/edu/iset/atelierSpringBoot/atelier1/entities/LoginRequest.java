package edu.iset.atelierSpringBoot.atelier1.entities;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class LoginRequest {
	private String email;
	public LoginRequest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;

}
