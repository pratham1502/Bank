package com.example.BankPortal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankPortal.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByEmail(String email);
	
	Optional<User> findByPhonenumber(String phonennumber);
	
	Optional<User> findByAccountNumber(String accountNUmber);
	

}
