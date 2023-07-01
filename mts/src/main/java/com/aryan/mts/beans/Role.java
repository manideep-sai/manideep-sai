package com.aryan.mts.beans;

public enum Role {
	
	ADMIN("Admin"), CUSTOMER("Customer");
	
	private String role;
	
	private Role(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
