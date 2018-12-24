package com.test1;

import java.sql.*;
 
public class Demo12_1 {
	public static void main(String[] args) {
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";//设置SQL Server数据库引擎
		String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=LiangshanHeros2";//指定数据库
		try {
			Class.forName(JDriver);//加载数据库引擎
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
 
		try {
			String user = "sa";
			String password = "emma2011";//登陆密码
			Connection con = DriverManager.getConnection(connectDB, user, password);//连接数据库
			System.out.println("连接数据库成功");
			Statement cmd = con.createStatement();//创建SQL命令对象
 
			//创建表
			String query = "select * from hero";
			ResultSet rs = cmd.executeQuery(query);
			
			while(rs.next()){
				System.out.println(rs.getString(1) + " " +  rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
			}
			// 关闭连接
			cmd.close();//关闭命令对象连接
			con.close();//关闭数据库连接
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
}
