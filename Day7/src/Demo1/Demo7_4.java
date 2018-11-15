package Demo1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo7_4 extends JFrame{

	JButton[] jbs;
	int size =  9;
	public Demo7_4() {
		// TODO Auto-generated constructor stub
		jbs = new JButton[size];
		
		for(int i = 0; i < size; i++) {
			jbs[i] = new JButton(String.valueOf(i+1)); 
		}
		
		this.setLayout(new GridLayout(3, 3, 10, 10));
		
		for(int i = 0; i < size; i++) {
			this.add(jbs[i]);
		}
		
		this.setTitle("Grid Layout Example");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Demo7_4 demo7_4 = new Demo7_4();
	}

}
