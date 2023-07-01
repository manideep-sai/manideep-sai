package com.aryan.mts.beans;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
@DynamicUpdate
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@NotNull(message = "First Name cannot be empty")
	@Column(name = "first_name")
	private String firstName;
	
	@NotNull(message = "Last Name cannot be empty")
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "mobile_number", unique = true)
	private long mobileNumber;
	
	@NotNull(message = "Email cannot be empty")
	@Column(name = "email", nullable = false, unique = true)
	@Email(message = "Please enter a valid email address")
	private String email;
	
	@NotNull(message = "Password must be atleast 8 characters and less than 16 characters long")
	@Length(min = 8, max = 16)
	@Column(name = "password")
	private String password;
	
	@NotNull(message = "Gender is Required")
	@Enumerated
	@Column(name = "gender")
	private Gender gender;
	
	@Enumerated
	@Column(name = "role")
	private Role role;

	public User() {
		super();
	}
	
	public User(long userId, String firstName, String lastName, String email, String password, Gender gender, Role role) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.role = role;
	}

	public User(long userId, String firstName, String lastName, long mobileNumber, String email, String password, Gender gender, Role role) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.role = role;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
