package com.example.BankPortal.service;

import org.springframework.stereotype.Service;

import com.example.BankPortal.entity.Account;
import com.example.BankPortal.entity.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
	
	//private final PasswordEncoder passwordEncoder;
	//private final TransactionRepository transactionRepository;
	@Override
	public Account createAccount(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isPinCreated(String accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void createdPin(String accountNumber, String password, String pin) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updatePin(String accountNumber, String oldPIN, String password, String newPIN) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cashDeposit(String accountNumber, String pin, double amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cashWithdrawal(String accountNumber, String pin, double amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fundTransfer(String sourceAccountNumber, String targetAccountNumber, String pin, double amount) {
		
	}
}
		
	
	