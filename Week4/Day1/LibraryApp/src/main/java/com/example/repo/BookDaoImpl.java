package com.example.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.models.Book;
import com.example.utility.ConnectionFactory;

public class BookDaoImpl implements BookDao {
	
	

	public BookDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean insertBook(Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBook(Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAvailablity(Book b, boolean status) {
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			String sql = "UPDATE books SET available = ? WHERE book_id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setBoolean(1, status);
			ps.setInt(2, b.getBookId());
			
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateOverdue(Book b, boolean status) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book selectBookById(int id) {
		
		Book book = null;
		
		try(Connection conn = ConnectionFactory.getConnection()) {
			
			String sql = "SELECT * FROM books WHERE book_id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				book = new Book(
						rs.getInt("book_id"),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getBoolean(7),
						rs.getBoolean(8)
						);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return book;
	}

	@Override
	public Book selectBookByName(String name) {
		Book book = null;
		
		try(Connection conn = ConnectionFactory.getConnection()) {
			
			String sql = "SELECT * FROM books WHERE book_name = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1,name);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				book = new Book(
						rs.getInt("book_id"),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getBoolean(7),
						rs.getBoolean(8)
						);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return book;
	}

	@Override
	public List<Book> selectAllBooks() {

		List<Book> bookList = new ArrayList<>();
		
		String sql = "SELECT * FROM books";
		
		try(Connection conn = ConnectionFactory.getConnection()) {
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				bookList.add( new Book(
						rs.getInt("book_id"),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getBoolean(7),
						rs.getBoolean(8)
						));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return bookList;
	}

}
