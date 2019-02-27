package com.qq.server.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyServerFrame extends JFrame{
	
	JPanel serverPanel;
	JButton turnOnServerButton;
	JButton shutDownServerButton;
	
	public MyServerFrame() {
		
		serverPanel = new JPanel();
		turnOnServerButton = new JButton("Turn on");
		shutDownServerButton = new JButton("Shut Down");
		
		serverPanel.add(turnOnServerButton);
		serverPanel.add(shutDownServerButton);
		
		this.add(serverPanel);
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyServerFrame();
	}

}
