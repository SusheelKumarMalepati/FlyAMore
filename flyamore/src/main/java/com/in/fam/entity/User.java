package com.in.fam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="User")
public class User {
	@Column(nullable=false)
	private String userId;
	@Id
	private String userEmail;
	@Column(nullable=false)
	private long userPhoneNumber;
	@Column(nullable=false)
	private String userPassword;
	public User(String userId, String userEmail, long userPhoneNumber, String userPassword) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userPhoneNumber = userPhoneNumber;
		this.userPassword = userPassword;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
