package com.test3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo9_3 extends JFrame{
	
	MyPanel mp;
	JButton jb1;
	JButton jb2;

	public Demo9_3() {
		// TODO Auto-generated constructor stub
		mp = new MyPanel();
		mp.setBackground(Color.black);
		jb1 = new JButton("black");
		jb1.setActionCommand("black");
		jb1.addActionListener(mp);
		jb2 = new JButton("red");
		jb2.setActionCommand("red");
		jb2.addActionListener(mp);
		this.add(jb1, BorderLayout.NORTH);
		this.add(jb2, BorderLayout.SOUTH);
		this.add(mp);
		
		this.setSize(200, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo9_3();
	}

}


class MyPanel extends JPanel implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("black")) {
			this.setBackground(Color.black);
		}
		if(e.getActionCommand().equals("red")) {
			this.setBackground(Color.red);
		}
	}
	
}