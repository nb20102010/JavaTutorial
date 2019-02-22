/**
 * QQ Client Login Panel
 */

package com.qq.client.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class QqClientLogin extends JFrame{
	
	//North
	JLabel northLabel;
	
	//Center
	JTabbedPane centerPane;
	JPanel qqNumLogin, phoneNumLogin, emailLogin;
	
		//qqNumLogin
	JLabel qqNum, qqPwd, forgotPwd, applyPwdProtection;
	JTextField qqNumField;
	JPasswordField qqPwdField;
	JButton cleanQQNum;
	JCheckBox hidden, memoPwd;
	
	//South
	JPanel southPanel;
	JButton login, cancel, guide;
	
	public QqClientLogin() {
		
		//north
		northLabel = new JLabel(new ImageIcon("image/ad.png"));
		
		//south
		southPanel = new JPanel();
		login = new JButton(new ImageIcon("image/login.png"));
		cancel = new JButton("Cancel");
		guide = new  JButton("Guide");
		southPanel.add(login);
		southPanel.add(cancel);
		southPanel.add(guide);
		
		centerPane = new JTabbedPane();
		
		//center--qqNumLogin
		qqNumLogin = new JPanel(new GridLayout(3, 3));
		qqNum = new JLabel("QQ Number:", JLabel.CENTER);
		qqPwd = new JLabel("QQ Password:", JLabel.CENTER);
		forgotPwd = new JLabel("Forgot Password?", JLabel.CENTER);
		forgotPwd.setForeground(Color.blue);
		applyPwdProtection = new JLabel("Apply Password Protection", JLabel.CENTER);
		cleanQQNum = new JButton("Clean");
		qqNumField = new JTextField();
		qqPwdField = new JPasswordField();
		hidden = new JCheckBox("Hidden");
		memoPwd = new JCheckBox("Remember me");
		
		qqNumLogin.add(qqNum);
		qqNumLogin.add(qqNumField);
		qqNumLogin.add(cleanQQNum);
		qqNumLogin.add(qqPwd);
		qqNumLogin.add(qqPwdField);
		qqNumLogin.add(forgotPwd);
		qqNumLogin.add(hidden);
		qqNumLogin.add(memoPwd);
		qqNumLogin.add(applyPwdProtection);
		
		//center--phoneNumLogin
		phoneNumLogin = new JPanel();
		
		//center--emailLogin
		emailLogin = new JPanel();
		
		centerPane.add("QQ Number", qqNumLogin);
		centerPane.add("Phone Number", phoneNumLogin);
		centerPane.add("Email", emailLogin);
		
		this.add(northLabel, "North");
		this.add(southPanel, "South");
		this.add(centerPane, "Center");
		
		
		this.setSize(450, 280);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QqClientLogin();
	}

}
