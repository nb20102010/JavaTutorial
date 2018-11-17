package Demo1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo7_5 extends JFrame{
	
	JPanel jp1, jp2;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;

	public Demo7_5() {
		// TODO Auto-generated constructor stub
		
		//The default Layout of JPanel is flow layout
		jp1 = new JPanel();
		jp2 = new JPanel();
		
//		jp1.setLayout(new FlowLayout());
//		jp2.setLayout(new FlowLayout());
		
		jb1 = new JButton("Melon");
		jb2 = new JButton("Apple");
		jb3 = new JButton("Lizhi");
		jb4 = new JButton("Grape");
		jb5 = new JButton("Orange");
		jb6 = new JButton("Banana");
		
		jp1.add(jb1);
		jp1.add(jb2);
		
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		this.add(jp1, BorderLayout.NORTH);
		this.add(jb6, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7_5 demo7_5 = new Demo7_5();

	}

}
