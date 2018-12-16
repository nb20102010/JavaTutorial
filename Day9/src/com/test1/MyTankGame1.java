package com.test1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTankGame1  extends JFrame{

	MyPanel mp;
	
	public MyTankGame1() {
		// TODO Auto-generated constructor stub
		mp = new MyPanel();
		this.add(mp);
		
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTankGame1();
	}

}


class MyPanel extends JPanel{	
	
	Hero hero;
	
	public MyPanel(){
		this.setBackground(Color.BLACK);
		hero = new Hero(10, 10);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
		drawTank(hero.getX(), hero.getY(), g, 0, 1);
		
	}
	
	public void drawTank(int x, int y, Graphics g, int direct, int type){
		
		switch(type){
		case 0:
			g.setColor(Color.YELLOW); break;
		case 1:
			g.setColor(Color.CYAN);
		}
		
		g.fill3DRect(x, y, 5, 30, false);
		g.fill3DRect(x+25, y, 5, 30, false);
		g.fill3DRect(x+5, y+5, 20, 20, false);
		g.drawLine(x+15, y, x+15, y+15);
		g.fillOval(x+10, y+10, 10, 10);
	}
	
}

class Tank{
	
	int x;
	int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public Tank(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}

class Hero extends Tank{

	public Hero(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
}