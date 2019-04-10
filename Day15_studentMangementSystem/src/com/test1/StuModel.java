package com.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class StuModel extends AbstractTableModel{
	
	Vector rowData;
	Vector colNames;
	
	final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306/javatutorial?serverTimezone=UTC&useSSL=false";
	final String USER_NAME = "root";
	final String USER_PASSWORD = "123456";
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	
	
	public StuModel(String sql) {
		// TODO Auto-generated constructor stub
		colNames = new Vector();
		colNames.add("ID");
		colNames.add("Name");
		colNames.add("Gender");
		colNames.add("Age");
		colNames.add("Home");
		colNames.add("Department");
		
		rowData = new Vector();
		
		try {
			
			Class.forName(DB_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER_NAME, USER_PASSWORD);
			stmt = conn.createStatement();
			if(sql.toLowerCase().startsWith("insert") || sql.toLowerCase().startsWith("delete") || sql.toLowerCase().startsWith("update")) {
				stmt.executeUpdate(sql);
				rs = stmt.executeQuery("select * from stu");
			} 
			else rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Vector line = new Vector();
				line.add(rs.getString(1));
				line.add(rs.getString(2));
				line.add(rs.getString(3));
				line.add(rs.getInt(4));
				line.add(rs.getString(5));
				line.add(rs.getString(6));
				rowData.add(line);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.colNames.size();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.rowData.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return ((Vector)this.rowData.get(arg0)).get(arg1);
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return (String)this.colNames.get(column);
	}
	
}
