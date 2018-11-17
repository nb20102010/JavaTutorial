package Demo8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
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

import com.sun.org.apache.bcel.internal.generic.IMPDEP2;

public class Demo8_3 extends JFrame {
	
	JLabel jl1;
	
	JButton jb1, jb2, jb3;
	JPanel jp1;
	
	JTabbedPane jtp;
	JPanel jp2, jp3, jp4;
	
	JLabel jl2, jl3, jl4, jl5;
	JTextField jtf;
	JPasswordField jpf;
	
	JButton jb4;
	JCheckBox jcb1, jcb2;
	
	public Demo8_3() {
		// TODO Auto-generated constructor stub
		jl2 = new JLabel("QQ Number", JLabel.CENTER);
		jl3 = new JLabel("Password", JLabel.CENTER);
		jl4 = new JLabel("Forget Password", JLabel.CENTER);
		jl4.setFont(new Font("Arial", Font.PLAIN, 16));
		jl4.setForeground(Color.BLUE);
		jl5 = new JLabel("<html><a href='www.qq.com'>Request password protection</a></html>");
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		jtf = new JTextField();
		jpf = new JPasswordField();
		jb4 = new JButton("Button 4");
		
		jcb1 = new JCheckBox("Hidden");
		jcb2 = new JCheckBox("Remember password");
		
		jl1 = new JLabel("Label 1");
		
		jp1 = new JPanel();
		jb1 = new JButton("Sign in");
		jb2 = new JButton("Cancel");
		jb3 = new JButton("Guide");
		
		jtp = new JTabbedPane();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp3.setBackground(Color.RED);
		jp4 = new JPanel();
		jp4.setBackground(Color.GREEN);
		
		jtp.add("QQ number", jp2);
		jtp.add("Tel No.", jp3);
		jtp.add("Email", jp4);
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jp2.setLayout(new GridLayout(3, 3));
		jp2.add(jl2);
		jp2.add(jtf);
		jp2.add(jb4);
		jp2.add(jl3);
		jp2.add(jpf);
		jp2.add(jl4);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jl5);
		
		this.add(jp1, BorderLayout.SOUTH);
		this.add(jl1, BorderLayout.NORTH);
		this.add(jtp, BorderLayout.CENTER);
		
		this.setSize(350, 240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo8_3();
	}

}
