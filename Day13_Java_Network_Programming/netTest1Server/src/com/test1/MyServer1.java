package com.test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer1 {
	
	public MyServer1() {
		
		try {
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("I'm server, listening 9999");
			
			Socket s = ss.accept();
			
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			String info = br.readLine();
			System.out.println("Server receives " + info);
			
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			pw.println("This is server. Hello");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new MyServer1();
	}
	
	
}
