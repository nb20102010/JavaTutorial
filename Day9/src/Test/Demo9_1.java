package Test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Demo9_1 extends JFrame{

	MyPanel mp;
	
	public Demo9_1() {
		// TODO Auto-generated constructor stub
		mp = new MyPanel();
		this.add(mp);
		
		this.setSize(1000, 1000);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args){
		Demo9_1 demo9_1 = new Demo9_1();
	}

}


class MyPanel extends JPanel{
	
	@Override
	public void paint(Graphics g){
		
		//required to call super class
		//super.paint(g);
		g.setColor(Color.red);
		g.setFont(new Font("", Font.BOLD, 100));
		g.drawString("×æ¹úÍòËê", 100, 100);
	}
}