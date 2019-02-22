package com.test1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyServer3 extends JFrame implements ActionListener{
	
	JTextArea jta = null;
	JTextField jtf = null;
	JButton jb = null;
	JScrollPane jsp = null;
	JPanel jp1 = null;
	
	PrintWriter pw = null;
	
	public static void main(String[] args) {
		new MyServer3();
	}
	
	public MyServer3() {
		
		this.jta = new JTextArea();
		this.jtf = new JTextField(10);
		this.jb = new JButton("Send");
		jb.addActionListener(this);
		jp1 = new JPanel();
		jp1.add(jtf);
		jp1.add(jb);
		jsp = new JScrollPane(jta);
		this.add(jsp, "Center");
		this.add(jp1, "South");
		
		this.setTitle("QQ dialogue(Server)");
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ServerSocket ss;
		try {
			ss = new ServerSocket(9998);
			Socket s = ss.accept();
			
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			pw = new PrintWriter(s.getOutputStream(), true);
			
			while(true) {
				//read the message from client
				String info = br.readLine();
				jta.append("Client says:\n" + info + "\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jb) {
			String info = jtf.getText();
			
			jta.append("Server says:\n" + info + "\n");
			
			pw.println(info);
			jtf.setText("");
		}
	}
}
