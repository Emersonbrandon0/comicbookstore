package com.brandonemerson;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	String email;
	String password;
	Boolean signedIn;
	
	public String signIn(){
		setSignedIn(true);
		return "Dashboard?faces-redirect=true";
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
	public Boolean getSignedIn() {
		return signedIn;
	}
	public void setSignedIn(Boolean signedIn) {
		this.signedIn = signedIn;
	}

}
