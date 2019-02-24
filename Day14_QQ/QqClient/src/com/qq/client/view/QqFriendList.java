package com.qq.client.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class QqFriendList extends JFrame implements ActionListener, MouseListener{

	//first card
	JPanel panel, myFriendsPanel, strangerAndBlackList;
	JButton myFriendsButton, strangerButton, blackListButton;
	JScrollPane myFriendsPane;
	
	//second card -- strangers
	JPanel panel2, strangersPanel, myFriendsAndStrangers;
	JButton myFriendsButton2, strangerButton2, blackListButton2;
	JScrollPane strangersPane;
	
	CardLayout cl;
	
	public QqFriendList() {
		
		cl = new CardLayout();
		this.setLayout(cl);
		
		//first card
		panel = new JPanel(new BorderLayout());
		
		myFriendsPanel = new JPanel(new GridLayout(50, 1, 4, 4));
		strangerAndBlackList = new JPanel(new GridLayout(2, 1));
		
		myFriendsButton = new JButton("My Friends");
		strangerButton = new JButton("Strangers");
		strangerButton.addActionListener(this);
		blackListButton = new JButton("Black List");		
		
		strangerAndBlackList.add(strangerButton);
		strangerAndBlackList.add(blackListButton);
		
		JLabel[] myFriendsLabels = new JLabel[50];
		for(int i = 0; i < myFriendsLabels.length; i++) {
			myFriendsLabels[i] = new JLabel((i+1) + "", new ImageIcon("image/head.png"), JLabel.LEFT);
			myFriendsLabels[i].addMouseListener(this);
			myFriendsPanel.add(myFriendsLabels[i]);
		}
		myFriendsPane = new JScrollPane(myFriendsPanel);
		
		panel.add(myFriendsButton, "North");
		panel.add(myFriendsPane, "Center");
		panel.add(strangerAndBlackList, "South");
		
		this.add(panel, "1");
		this.setSize(150, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//second card
		panel2 = new JPanel(new BorderLayout());
		
		strangersPanel = new JPanel(new GridLayout(20, 1, 4, 4));
		myFriendsAndStrangers = new JPanel(new GridLayout(2, 1));
		
		myFriendsButton2 = new JButton("My Friends");
		myFriendsButton2.addActionListener(this);
		strangerButton2 = new JButton("Strangers");
		blackListButton2 = new JButton("Black List");		
		
		myFriendsAndStrangers.add(myFriendsButton2);
		myFriendsAndStrangers.add(strangerButton2);
		
		JLabel[] strangersLabels = new JLabel[20];
		for(int i = 0; i < strangersLabels.length; i++) {
			strangersLabels[i] = new JLabel((i+1) + "", new ImageIcon("image/head.png"), JLabel.LEFT);
			strangersPanel.add(strangersLabels[i]);
		}
		strangersPane = new JScrollPane(strangersPanel);
		
		panel2.add(myFriendsAndStrangers, "North");
		panel2.add(strangersPane, "Center");
		panel2.add(blackListButton2, "South");
		
		this.add(panel2, "2");
	}
	
	public static void main(String[] args) {
		new QqFriendList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == strangerButton) {
			cl.show(this.getContentPane(), "2");
		}
		if(e.getSource() == myFriendsButton2) {
			cl.show(this.getContentPane(), "1");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getClickCount() == 2) {
			String friendNum = ((JLabel)e.getSource()).getText();
			System.out.println("You want to speak with " + friendNum);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel jl = (JLabel)e.getSource();
		jl.setForeground(Color.red);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel jl = (JLabel)e.getSource();
		jl.setForeground(Color.black);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
