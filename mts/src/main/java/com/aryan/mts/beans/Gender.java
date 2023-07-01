package com.aryan.mts.beans;

public enum Gender {
	
	MALE("Male"), FEMALE("Female"), NOT_DEFINED("NotDefined");
	
	private String gender;

	private Gender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
