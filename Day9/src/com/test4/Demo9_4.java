package com.test4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo9_4 extends JFrame{
	
	MyPanel mp;
	
	public Demo9_4() {
		// TODO Auto-generated constructor stub
		this.mp = new MyPanel();
		this.mp.setSize(150, 150);
		this.add(mp);
		this.addKeyListener(mp);
		
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo9_4();
	}

}

class MyPanel extends JPanel implements KeyListener{
	
	Ball ball;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		this.ball = new Ball(Color.black, 50, 50);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.fillOval(this.ball.x, this.ball.y, 10, 10);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == 'a') this.ball.x--;
		else if(e.getKeyChar() == 'd') this.ball.x++;
		else if(e.getKeyChar() == 'w') this.ball.y--;
		else if(e.getKeyChar() == 's') this.ball.y++;
		
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

class Ball{
	
	Color color;
	int x;
	int y;
	
	Ball(Color color, int x, int y){
		this.color = color;
		this.x = x;
		this.y = y;
	}
}