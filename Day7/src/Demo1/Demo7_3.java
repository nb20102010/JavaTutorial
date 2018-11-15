package Demo1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 
 * Flow Layout
 *
 */
public class Demo7_3 extends JFrame{
	
	JButton jb1, jb2, jb3, jb4, jb5, jb6;

	public Demo7_3() {
		// TODO Auto-generated constructor stub
		jb1 = new JButton("Guan Yu");		
		jb2 = new JButton("Zhang Fei");
		jb3 = new JButton("Zhao Yun");
		jb4 = new JButton("Ma Chao");
		jb5 = new JButton("Huang Zhong");
		jb6 = new JButton("Wei Yan");
		
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//set layout manager
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		this.setTitle("Flow Layout display");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Demo7_3 demo7_3 = new Demo7_3();
	}

}
