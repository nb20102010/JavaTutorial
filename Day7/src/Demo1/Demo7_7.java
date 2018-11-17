package Demo1;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Demo7_7 extends JFrame{
	
	JPanel jp1, jp2, jp3;
	JLabel jl1, jl2;
	JButton jb1, jb2;
	JCheckBox jcb1, jcb2, jcb3;
	JRadioButton jrb1, jrb2;
	ButtonGroup bg;

	public Demo7_7() {
		// TODO Auto-generated constructor stub
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jl1 = new JLabel("Your favourate sports");
		jl2 = new JLabel("Your gender");
		
		jb1 = new JButton("Sign up");
		jb2 = new JButton("Cancel");
		
		jcb1 = new JCheckBox("Soccer");
		jcb2 = new JCheckBox("Basketball");
		jcb3 = new JCheckBox("Tennis");
		
		jrb1 = new JRadioButton("Male");
		jrb2 = new JRadioButton("Female");
		
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		this.setLayout(new GridLayout(3, 1));
		
		jp1.add(jl1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setSize(800, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7_7 demo7_7 = new Demo7_7();
	}

}
