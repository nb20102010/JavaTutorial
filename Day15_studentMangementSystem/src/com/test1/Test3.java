package com.test1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Test3 extends JFrame implements ActionListener{
	
	JPanel jp1, jp2;
	JLabel jl1;
	JButton jb1, jb2, jb3, jb4;
	JTable jt;
	JScrollPane jsp;
	JTextField jtf;
	StuModel stuModel;
	
	
	public Test3() {
		
		//north
		jp1 = new JPanel();
		jtf = new JTextField(10);
		jb1 = new JButton("Search");
		jb1.setActionCommand("Search");
		jb1.addActionListener(this);
		jl1 = new JLabel("Type in name");
		
		jp1.add(jl1);
		jp1.add(jtf);
		jp1.add(jb1);
		
		//south
		jb2 = new JButton("Add");
		jb2.setActionCommand("Add");
		jb2.addActionListener(this);
		jb3 = new JButton("Edit");
		jb3.setActionCommand("Edit");
		jb3.addActionListener(this);
		jb4 = new JButton("Remove");
		jb4.setActionCommand("Remove");
		jb4.addActionListener(this);
		
		jp2 = new JPanel();
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		
		//center
		stuModel = new StuModel("select * from stu");
		
		jt = new JTable(stuModel);
		jsp = new JScrollPane(jt);
		
		this.add(jsp);		
		this.add(jp1, "North");
		this.add(jp2, "South");
		
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Test3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Search")) {
			String name = this.jtf.getText().trim();
			String sql = "select * from stu where stu_name like '%" + name + "%'";
			this.stuModel = new StuModel(sql);
			jt.setModel(this.stuModel);
		}
		if(e.getActionCommand().equals("Add")) {
			StuAddDialog sad = new StuAddDialog(this, "Add a student", true);
		}
		if(e.getActionCommand().equals("Remove")) {
			int row = this.jt.getSelectedRow();
			if(row > 0) {
				String id = (String) this.stuModel.getValueAt(row, 0);
				String sql = "delete from stu where stu_id='" + id + "'";
				this.stuModel = new StuModel(sql);
				this.jt.setModel(this.stuModel);
			}
		}
		if(e.getActionCommand().equals("Edit")) {
			int row = this.jt.getSelectedRow();
			if(row > 0) {
				String id = (String) this.stuModel.getValueAt(row, 0);
				String name = (String) this.stuModel.getValueAt(row, 1);
				String gender = (String) this.stuModel.getValueAt(row, 2);
				String age = String.valueOf(this.stuModel.getValueAt(row, 3));
				String home = (String) this.stuModel.getValueAt(row, 4);
				String dept = (String) this.stuModel.getValueAt(row, 5);
				StuEditDialog sad = new StuEditDialog(this, "Add a student", true, id, name, gender, age, home, dept);
			}
		}
	}
	
}
