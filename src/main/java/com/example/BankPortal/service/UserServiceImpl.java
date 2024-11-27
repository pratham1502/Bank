package com.example.BankPortal.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.BankPortal.dto.LoginRequest;
import com.example.BankPortal.dto.OtpRequest;
import com.example.BankPortal.dto.OtpVerificationRequest;
import com.example.BankPortal.entity.User;
import com.example.BankPortal.exception.InvalidTokenException;
import com.example.BankPortal.repository.UserRepository;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository = null;

	@Override
	public ResponseEntity<String> registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> login(LoginRequest loginRequest, HttpServletRequest request)
			throws InvalidTokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> generateOTP(OtpRequest otpRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> verifyOTPANDLogin(OtpVerificationRequest otpVerificationRequest)
			throws InvalidTokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView logout(String token) throws InvalidTokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean resetPassword(User user, String Password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByIdentifier(String identifier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByAccountNumber(String accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
	
	

}
