package com.example.BankPortal.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.BankPortal.dto.LoginRequest;
import com.example.BankPortal.dto.OtpRequest;
import com.example.BankPortal.dto.OtpVerificationRequest;
import com.example.BankPortal.entity.User;
import com.example.BankPortal.exception.InvalidTokenException;
import com.example.BankPortal.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RequestMapping("/api/users")
@RestController
@RequiredArgsConstructor
public class UserController {
	private final UserService userService = null;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user){
		return userService.registerUser(user);
	}
	
	/**
	 * @param loginRequest
	 * @return
	 */
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest,HttpServletRequest request)
	 throws InvalidTokenException {
		
		return userService.login(loginRequest, request);
	}
	
	@PostMapping("/generate-otp")
	public ResponseEntity<String> generate(@RequestBody OtpRequest otpRequest){
		
		return userService.generateOTP(otpRequest);
	}
	
	@PostMapping("/verify-otp")
	public ResponseEntity<String> verifyOtpAndLogin(@RequestBody OtpVerificationRequest otpVerificationRequest) throws InvalidTokenException{
		
		return userService.verifyOTPANDLogin(otpVerificationRequest);
	}
	
	@PostMapping("/update")
	public ResponseEntity<String> updateUser(@RequestBody User user){
		
		return userService.updateUser(user);
	}
	
	@PostMapping("/logout")
	public ModelAndView logout(@RequestHeader("Authorization") String token) throws InvalidTokenException{
		return userService.logout(token);
	}
	
	

}
