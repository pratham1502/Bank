package com.example.BankPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class BankPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankPortalApplication.class, args);
		System.out.print("Hello");
		
	}

}
