package com.example.BankPortal.util;

import java.net.Inet4Address;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.BankPortal.repository.UserRepository;

public class ValidationUtil {
	
	public static final Logger log=LoggerFactory.getILoggerFactory(ValidationUtil.class);
	//public static final PhoneNumberUtil phonenumber= PhoneNumber.getInstance();
	
	private final UserRepository userRepository;
	
	public static boolean isValidEmail(String identifier) {
		
		try {
			new InternetAddress(identifier).validate();
			return true;
		}catch(AddressException e){
			log.warn("Invalid email address: {}",identifier);
			
		}
	}
	
	

}
