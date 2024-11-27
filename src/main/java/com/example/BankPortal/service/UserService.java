package com.example.BankPortal.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.ModelAndView;

import com.example.BankPortal.dto.LoginRequest;
import com.example.BankPortal.dto.OtpRequest;
import com.example.BankPortal.dto.OtpVerificationRequest;
import com.example.BankPortal.entity.User;
import com.example.BankPortal.exception.InvalidTokenException;

import jakarta.servlet.http.HttpServletRequest;

public interface UserService {
	
	public ResponseEntity<String> registerUser(User user);
	
	public ResponseEntity<String> login(LoginRequest loginRequest, HttpServletRequest request)
		throws InvalidTokenException;
	
	public ResponseEntity<String> generateOTP(OtpRequest otpRequest);
	
	public ResponseEntity<String> verifyOTPANDLogin(OtpVerificationRequest otpVerificationRequest)
		throws InvalidTokenException;
	
	public ResponseEntity<String> updateUser(User user);
	
	public ModelAndView logout(String token) throws InvalidTokenException;
	
	public boolean resetPassword(User user,String Password);
	
	public User saveUser(User user);

    public User getUserByIdentifier(String identifier);

    public User getUserByAccountNumber(String accountNo);

    public User getUserByEmail(String email);
	

}
