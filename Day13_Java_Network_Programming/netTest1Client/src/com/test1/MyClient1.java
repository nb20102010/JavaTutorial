package com.test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient1 {
	
	public MyClient1() {
		
		try {
			
			Socket s = new Socket("127.0.0.1", 9999);
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			pw.println("Hello, this is client");
			
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			String response = br.readLine();
			System.out.println("I am client, I got " + response + " from server");
			s.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new MyClient1();
	}
}
