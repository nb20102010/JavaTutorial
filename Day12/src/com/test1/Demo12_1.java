package com.test1;

import java.sql.*;
 
public class Demo12_1 {
	public static void main(String[] args) {
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";//����SQL Server���ݿ�����
		String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=LiangshanHeros2";//ָ�����ݿ�
		try {
			Class.forName(JDriver);//�������ݿ�����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
 
		try {
			String user = "sa";
			String password = "emma2011";//��½����
			Connection con = DriverManager.getConnection(connectDB, user, password);//�������ݿ�
			System.out.println("�������ݿ�ɹ�");
			Statement cmd = con.createStatement();//����SQL�������
 
			//������
			String query = "select * from hero";
			ResultSet rs = cmd.executeQuery(query);
			
			while(rs.next()){
				System.out.println(rs.getString(1) + " " +  rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
			}
			// �ر�����
			cmd.close();//�ر������������
			con.close();//�ر����ݿ�����
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
}
