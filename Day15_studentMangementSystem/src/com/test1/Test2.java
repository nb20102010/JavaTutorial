package com.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Test2 extends JFrame{

	public static void main(String[] args) {
		new Test2();
	}
	
	private final String USER_NAME = "root";
	private final String USER_PASSWORD = "123456";
	private final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://localhost:3306/javatutorial?serverTimezone=UTC&useSSL=false";

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	Vector rowData;
	Vector colNames;
	
	JTable jt;
	JScrollPane jsp;
	
	public Test2() {
		
		colNames = new Vector();
		colNames.add("ID");
		colNames.add("Name");
		colNames.add("Gender");
		colNames.add("Age");
		colNames.add("Home");
		colNames.add("Department");		
		
		rowData = new Vector<>();		
		
		try {
			Class.forName(DB_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER_NAME, USER_PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from stu");
			
			while(rs.next()) {
				Vector hang = new Vector();
				hang.add(rs.getString(1));
				hang.add(rs.getString(2));
				hang.add(rs.getString(3));
				hang.add(rs.getInt(4));
				hang.add(rs.getString(5));
				hang.add(rs.getString(6));
				rowData.add(hang);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs != null) { try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		jt = new JTable(rowData, colNames);
		jsp = new JScrollPane(jt);
		this.add(jsp);
		
		this.setSize(400, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
