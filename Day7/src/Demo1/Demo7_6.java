package Demo1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Demo7_6 extends JFrame{
	
	JPanel jp1, jp2, jp3;
	JLabel jlb1, jlb2;
	JButton jb1, jb2;
	JTextField jtf1;
	JPasswordField jpf1;

	public Demo7_6() {
		// TODO Auto-generated constructor stub
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jlb1 = new JLabel("          User");
		jlb2 = new JLabel("Password");
		
		jb1 = new JButton("Log in");
		jb2 = new JButton("Cancel");
		
		jtf1 = new JTextField(10);
		jpf1 = new JPasswordField(10);
		
		this.setLayout(new GridLayout(3, 1));
		
		jp1.add(jlb1);
		jp1.add(jtf1);
		
		jp2.add(jlb2);
		jp2.add(jpf1);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setSize(400, 150);
		this.setLocation(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Membership Management System");
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7_6 demo7_6 = new Demo7_6();
	}

}
