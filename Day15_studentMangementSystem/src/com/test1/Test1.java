package com.test1;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Test1 extends JFrame{
	
	Vector rowData, colNames;
	JTable jt = null;
	JScrollPane jsp = null;
	
	public Test1() {
		
		colNames = new Vector();
		colNames.add("id");
		colNames.add("name");
		colNames.add("gender");
		colNames.add("age");
		colNames.add("home");
		colNames.add("department");
		
		rowData = new Vector();
		
		Vector hang = new Vector();
		hang.add("sp001");
		hang.add("Sun Wukong");
		hang.add("male");
		hang.add("500");
		hang.add("Huaguoshan");
		hang.add("Shanlin");
		
		rowData.add(hang);
		
		jt = new JTable(rowData, colNames);
		
		jsp = new JScrollPane(jt);
		
		this.add(jsp);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test1();
	}
	
}
