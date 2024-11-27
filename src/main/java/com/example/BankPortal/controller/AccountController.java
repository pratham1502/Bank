package com.example.BankPortal.controller;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankPortal.service.AccountService;
import com.example.BankPortal.service.TransactionService;
import com.example.BankPortal.util.ApiMessages;
import com.example.BankPortal.util.LoggedinUser;

import lombok.val;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	private final AccountService accountService = null;
	//private final TransactionService transactionService = new TransactionService();
	
	
@GetMapping("/pin/check")
	public ResponseEntity<String> checkAccountPIN(){
		boolean isPINValid = accountService.isPinCreated(LoggedinUser.getAccountNumber());
		val response = isPINValid ? ApiMessages.PIN_CREATED
				:ApiMessages.PIN_NOT_CREATED;

		
		return  (ResponseEntity<String>) ResponseEntity.ok();
	}
	
//	@PostMapping("/pin/create")
//	public ResponseEntity<String> createPIN(){
//////		accountservice.createPin(LoggedinUser.getAccountNumber(),
////				pinRequest.password(),
////				pinRequest.pin());
//		
//		return ResponseEntity.ok();
//	}
	
//	@PostMapping("/pin/update")
//	public ResponseEntity<String> updatePIN(){
//		
//		return ResponseEntity.ok();
//	}
//	
//	@PostMapping("/deposit")
//	public ResponseEntity<String> updatePIN(){
//		
//		return ResponseEntity.ok();
//	}
//	
//	@PostMapping("/withdraw")
//	public ResponseEntity<String> cashWithdrawl(){
//		
//		return ResponseEntity.ok();
//	}
//	@PostMapping("/fund-transfer")
//	public ResponseEntity<String> fundTransfer(){
//		
//		return ResponseEntity.ok();
//	}
//
//	@GetMapping("/transaction")
//	public ResponseEntity<String> getAllTransactionsByAccountNumber(){
//		
//		return ResponseEntity.ok();
//	}
	
}
