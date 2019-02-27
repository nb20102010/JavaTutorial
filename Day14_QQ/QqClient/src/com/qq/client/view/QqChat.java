package com.qq.client.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class QqChat extends JFrame{

	JTextArea chatArea;
	JScrollPane chatPane;
	JTextField messageField;
	JButton sendButton;
	JPanel southPanel;
	
	public QqChat (String friend) {
		
		chatArea = new JTextArea();
		chatPane = new JScrollPane(chatArea);
		
		sendButton = new JButton("Send");
		messageField = new JTextField(15);
		southPanel = new JPanel();
		southPanel.add(messageField);
		southPanel.add(sendButton);
		
		this.add(chatPane, "Center");
		this.add(southPanel, "South");
		
		this.setTitle("You are chatting with " + friend);
		this.setIconImage(new ImageIcon("image/head.png").getImage());
		this.setSize(400, 300);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QqChat("1");
	}

}
