package com.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer2 {
	
	public static void main(String[] args) {
		new MyServer2();
	}
	
	public MyServer2() {
		
		try {
			ServerSocket ss = new ServerSocket(9999);
			Socket s = ss.accept();
			
			//reader for receiving message
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			//writer for sending messge
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			InputStreamReader isr2 = new InputStreamReader(System.in);
			BufferedReader br2 = new BufferedReader(isr2);
			
			while(true) {
				String infoFromClient = br.readLine();
				System.out.println("Client sent: " + infoFromClient);
				
				if(infoFromClient.equals("bye")){
					System.out.println("dialogue ends");
					s.close();
					break;
				}
				
				System.out.println("Enter the messge you want to send:");
				String response = br2.readLine();
				
				pw.println(response);
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
