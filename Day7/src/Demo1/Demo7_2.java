package Demo1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo7_2 extends JFrame{

	JButton jb1, jb2, jb3, jb4, jb5;
	
	public Demo7_2() {
		// TODO Auto-generated constructor stub
		jb1 = new JButton("Center");
		jb2 = new JButton("North");
		jb3 = new JButton("East");
		jb4 = new JButton("South");
		jb5 = new JButton("West");
		
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.NORTH);
		this.add(jb3, BorderLayout.EAST);
		this.add(jb4, BorderLayout.SOUTH);
		this.add(jb5, BorderLayout.WEST);
		
		this.setTitle("Border Layout display");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Demo7_2 demo7_2 = new Demo7_2();
	}

}
