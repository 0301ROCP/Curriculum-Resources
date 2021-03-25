package com.app.service;

import com.app.models.BankAccount;
import com.app.models.Customer;
import com.app.models.Employee;
import com.app.repository.BankAccountDao;
import com.app.repository.BankAccountDaoImpl;
import com.app.repository.CustomerDao;
import com.app.repository.CustomerDaoImpl;
import com.app.repository.EmployeeDao;
import com.app.repository.EmployeeDaoImpl;

public class Service {
    EmployeeDao eDao=new EmployeeDaoImpl();
    CustomerDao cDao=new CustomerDaoImpl(); 
    BankAccountDao bDao=new BankAccountDaoImpl();
		
		
	
	public boolean testEmployeeCredential(String userName,String passWord) {
		Employee e=eDao.sellectByUserName(userName);
		if (e==null) {
			return false;
			}
		if(e.getPassW0rd().equals(passWord)) {
			return true;
		}
		return false;	
		}

	public boolean testCustomerCredential(String userName,String passWord) {
		Customer c=cDao.sellectByUserName(userName);
		if (c==null) {
			return false;
			}
		if(c.getPassW0rd().equals(passWord)) {
			return true;
		}
		return false;	
		}
    public boolean withdra(int id,double amount) {
    	BankAccount b=bDao.sellectById(id);
    	if (b==null || b.getBalance()<= amount || amount<=0 || b.getBalance()<=0) return false;
    	else {
    		bDao.updateByBalance(id,b.getBalance()-amount);
    	    return true;
    	}
    	
    }			
    public boolean deposite(int id,double amount) {
    	BankAccount b=bDao.sellectById(id);
    	if (b==null || b.getBalance()<=0 || amount<=0) return false;
    	else {
    		bDao.updateByBalance(id,b.getBalance()+amount);
    	    return true;
    	}
    	
    }
    public boolean transfer(int ida,int idb,double amount) {
    	BankAccount a=bDao.sellectById(ida);
    	BankAccount b=bDao.sellectById(idb);
    	if (a==null || b==null|| a.getBalance()<= amount || b.getBalance()<= 0 || amount<=0 || a.getBalance()<=0) return false;
    	else {
    		bDao.updateByBalance(ida,a.getBalance()-amount);
    		bDao.updateByBalance(idb,b.getBalance()+amount);
    		return true;
    	}
    	
    	
    }

}		
	
	
	

