package com.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient2 {
	
	public static void main(String[] args) {
		new MyClient2();
	}
	
	public MyClient2() {
		
		try {
			//Connect
			Socket s = new Socket("127.0.0.1", 9999);
			
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			InputStreamReader isr2 = new InputStreamReader(s.getInputStream());
			BufferedReader br2 = new BufferedReader(isr2);
			
			while(true) {
				System.out.println("Enter the message you want to send to the Server: ");
				String info = br.readLine();
				pw.println(info);
				if(info.equals("bye")) {
					s.close();
					break;
				}				
				
				String res = br2.readLine();
				System.out.println("Server says: " + res);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}
	
}
