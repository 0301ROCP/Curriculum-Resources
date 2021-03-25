package com.app.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.app.models.Employee;
import com.app.utility.ConnectionFactory;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee sellectByUserName(String userName) {
		Employee e=null;
		try(Connection conn=ConnectionFactory.getConnection()){
				String sql="select * from Employee where UserName=?";
		        PreparedStatement prs=conn.prepareStatement(sql);
		        prs.setString(1, userName);
		        ResultSet rs=prs.executeQuery();
		        while(rs.next()) {
		        	 e=new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		        }
		        
		                		
		}
		catch(SQLException er){
			er.printStackTrace();
		}
		return e ;
		
	}
	

}
