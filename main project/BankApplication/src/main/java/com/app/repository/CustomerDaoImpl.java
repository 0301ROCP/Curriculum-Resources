package com.app.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.models.BankAccount;
import com.app.models.Customer;
import com.app.models.Employee;
import com.app.utility.ConnectionFactory;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public ArrayList<Customer> sellectAllCusstomers() {
		  ArrayList<Customer> customerList = new ArrayList<>();
			
			String sql = "SELECT * FROM Customer";
			
			try(Connection conn = ConnectionFactory.getConnection()) {
				
				
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					customerList.add( new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			
			
			return customerList;
		}

	@Override
	public Customer sellectByUserName(String userName) {
		Customer c=null;
		try(Connection conn=ConnectionFactory.getConnection()){
				String sql="select * from Customer where UserName=?";
		        PreparedStatement prs=conn.prepareStatement(sql);
		        prs.setString(1, userName);
		        ResultSet rs=prs.executeQuery();
		        while(rs.next()) {
		        	 c=new Customer (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		        }
		        
		                		
		}
		catch(SQLException er){
			er.printStackTrace();
		}
		return c ;
	}

	@Override
	public boolean insertCustomer(Customer c) {
try(Connection conn = ConnectionFactory.getConnection()){
			
			String sql = "insert into Customer (firstName,lastName,userName,passw0rd) values(?,?,?,?)";
					
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1,c.getFirstName());
			ps.setString(2,c.getLastName());
			ps.setString(3,c.getUserName());
			ps.setString(4,c.getPassW0rd());
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
      	
}





