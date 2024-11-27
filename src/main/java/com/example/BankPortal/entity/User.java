package com.example.BankPortal.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	
	@NotEmpty
	private String password;
	
	@Email
	@NotEmpty
	@Column(unique=true)
	private String email;
	
	
	
	@Column(unique = true)
	private String phonenumber;
	
	@NotEmpty
	private String address;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Account account;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
