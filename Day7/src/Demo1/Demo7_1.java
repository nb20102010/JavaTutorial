package Demo1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo7_1 extends JFrame{
	
	JButton jb1;
	
	public Demo7_1() {
		
		//Title of the window
		this.setTitle("Hello, world!");
		
		//Size of the window
		this.setSize(300, 200);
		//Set initial location
		this.setLocation(4000, 0);
		//Show the window
		this.setVisible(true);
		
		//when closing, exit to free memory
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		jb1 = new JButton("I am Button");
		this.add(jb1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo7_1 demo7_1 = new Demo7_1();  
		
	}

}
