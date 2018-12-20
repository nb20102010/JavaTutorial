package com.test6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTankGame2 extends JFrame{
	
	MyPanel mp;
	
	public MyTankGame2() {
		// TODO Auto-generated constructor stub
		mp = new MyPanel();
		mp.setBackground(Color.BLACK);
		this.add(mp);
		this.addKeyListener(mp);
		
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTankGame2();
	}

}

class MyPanel extends JPanel implements KeyListener{
	
	Hero hero;
	List<Enemy> enemyList;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		this.hero = new Hero(Color.YELLOW, 200, 200, 0);
		this.enemyList = new ArrayList<>();
		this.enemyList.add(new Enemy(Color.CYAN, 100, 50, 2));
		this.enemyList.add(new Enemy(Color.CYAN, 200, 50, 2));
		this.enemyList.add(new Enemy(Color.CYAN, 300, 50, 2));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()){
		case 'w':
			this.hero.direct = 0;
			this.hero.y--;
			break;
		case 'a':
			this.hero.direct = 1;
			this.hero.x--;
			break;
		case 's':
			this.hero.direct = 2;
			this.hero.y++;
			break;
		case 'd':
			this.hero.direct = 3;
			this.hero.x++;
			break;
		}
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		drawTank(g, this.hero);
		for(Enemy enemy : this.enemyList){
			drawTank(g, enemy);
		}
	}
	
	public void drawTank(Graphics g, Tank tank){
		g.setColor(tank.color);
		switch(tank.direct){
		case 0:
			g.fill3DRect(tank.x, tank.y, 5, 30, false);
			g.fill3DRect(tank.x+25, tank.y, 5, 30, false);
			g.fill3DRect(tank.x+5, tank.y+5, 20, 20, false);
			g.drawOval(tank.x+10, tank.y+10, 10, 10);
			g.drawLine(tank.x+15, tank.y, tank.x+15, tank.y+15);
			break;
		case 1:
			g.fill3DRect(tank.x, tank.y, 30, 5, false);
			g.fill3DRect(tank.x, tank.y+25, 30, 5, false);
			g.fill3DRect(tank.x+5, tank.y+5, 20, 20, false);
			g.drawOval(tank.x+10, tank.y+10, 10, 10);
			g.drawLine(tank.x, tank.y+15, tank.x+15, tank.y+15);
			break;
		case 2:
			g.fill3DRect(tank.x, tank.y, 5, 30, false);
			g.fill3DRect(tank.x+25, tank.y, 5, 30, false);
			g.fill3DRect(tank.x+5, tank.y+5, 20, 20, false);
			g.drawOval(tank.x+10, tank.y+10, 10, 10);
			g.drawLine(tank.x+15, tank.y+30, tank.x+15, tank.y+15);
			break;
		case 3:
			g.fill3DRect(tank.x, tank.y, 30, 5, false);
			g.fill3DRect(tank.x, tank.y+25, 30, 5, false);
			g.fill3DRect(tank.x+5, tank.y+5, 20, 20, false);
			g.drawOval(tank.x+10, tank.y+10, 10, 10);
			g.drawLine(tank.x+30, tank.y+15, tank.x+15, tank.y+15);
			break;
		}
	}
	
	
}

class Tank{
	
	Color color;
	int x;
	int y;
	int direct;
	
	public Tank(Color color, int x, int y, int direct) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.direct = direct;
	}
}
	
class Hero extends Tank{

	public Hero(Color color, int x, int y, int direct) {
		super(color, x, y, direct);
		// TODO Auto-generated constructor stub
	}
	
}

class Enemy extends Tank{

	public Enemy(Color color, int x, int y, int direct) {
		super(color, x, y, direct);
		// TODO Auto-generated constructor stub
	}
	
}