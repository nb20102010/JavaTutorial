package com.test1;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StuEditDialog extends JDialog implements ActionListener{
	JLabel jl1, jl2, jl3, jl4, jl5, jl6;
	JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6;
	JButton jb1, jb2;
	JPanel jp1, jp2, jp3;
	
	public StuEditDialog(Frame owner, String title, boolean modal, String editedID, String editedName, String editedGender, String editedAge, String editedHome, String editedDept) {
		// TODO Auto-generated constructor stub
		super(owner, title, modal);
		jl1 = new JLabel("ID: ");
		jl1.setHorizontalAlignment(SwingConstants.RIGHT);
		jl2 = new JLabel("Name: ");
		jl2.setHorizontalAlignment(SwingConstants.RIGHT);
		jl3 = new JLabel("Gender: ");
		jl3.setHorizontalAlignment(SwingConstants.RIGHT);
		jl4 = new JLabel("Age: ");
		jl4.setHorizontalAlignment(SwingConstants.RIGHT);
		jl5 = new JLabel("Home: ");
		jl5.setHorizontalAlignment(SwingConstants.RIGHT);
		jl6 = new JLabel("Dept: ");
		jl6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		jtf1 = new JTextField(editedID, 10);
		jtf2 = new JTextField(editedName, 10);
		jtf3 = new JTextField(editedGender, 10);
		jtf4 = new JTextField(editedAge, 10);
		jtf5 = new JTextField(editedHome, 10);
		jtf6 = new JTextField(editedDept, 10);
		
		jb1 = new JButton("Edit");
		jb1.setActionCommand("SEDEdit");
		jb1.addActionListener(this);
		jb2 = new JButton("Cancel");
		jb2.setActionCommand("Cancel");
		jb2.addActionListener(this);
		
		jp1 = new JPanel();
		jp3 = new JPanel();
		jp1.setLayout(new GridLayout(6, 1));
		jp3.setLayout(new GridLayout(6, 1));
		jp3.add(jl1);
		jp1.add(jtf1);
		jp3.add(jl2);
		jp1.add(jtf2);
		jp3.add(jl3);
		jp1.add(jtf3);
		jp3.add(jl4);
		jp1.add(jtf4);
		jp3.add(jl5);
		jp1.add(jtf5);
		jp3.add(jl6);
		jp1.add(jtf6);
		
		jp2 = new JPanel();
		jp2.add(jb1);
		jp2.add(jb2);
		
		this.add(jp1);
		this.add(jp2, "South");
		this.add(jp3, "West");
		
		this.setSize(260, 210);
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Cancel")) {
			this.dispose();
		}
		if(e.getActionCommand().equals("SEDEdit")) {
			String ID = jtf1.getText();
			String newName = jtf2.getText();
			String newGender = jtf3.getText();
			int newAge = Integer.parseInt(jtf4.getText().trim());
			String newHome = jtf5.getText();
			String newDept = jtf6.getText();
			Test3 owner = (Test3)this.getOwner();
			String sql = "update stu set stu_name='" + newName + "', stu_gender='" + newGender + "', stu_age=" + newAge + ", stu_home='" + newHome + "', stu_department='" + newDept +"' where stu_id='" + ID + "';";
			System.out.println(sql);
			owner.stuModel = new StuModel(sql);
			owner.jt.setModel(owner.stuModel);
			this.dispose();
		}
	}
}
