package com.app.repository;

import java.awt.List;
import java.util.ArrayList;

import com.app.models.BankAccount;

public interface  BankAccountDao {
	
	BankAccount sellectById(int id);
	BankAccount sellectByCustomerId(int customerId);
    ArrayList<BankAccount> sellectAllAccounts();
	
	boolean  updateByBalance(BankAccount b,int balance);
	boolean  updateByBalance(int id,double balance);
	
	boolean insertBankAccount(boolean a,boolean b,double amount,int id);
	boolean insertBankAccount(BankAccount b);
	boolean deleteBankAccountById( int id);
}
