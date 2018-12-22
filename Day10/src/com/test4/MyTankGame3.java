package com.test4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTankGame3 extends JFrame{
	
	MyPanel mp;
	
	public MyTankGame3() {
		// TODO Auto-generated constructor stub
		mp = new MyPanel();
		(new Thread(mp)).start();
		mp.setBackground(Color.BLACK);
		this.add(mp);
		this.addKeyListener(mp);
		
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTankGame3();
	}

}

class MyPanel extends JPanel implements KeyListener, Runnable{
	
	Hero hero;
	List<Enemy> enemyList;
	
	public MyPanel() {
		// TODO Auto-generated constructor stub
		this.hero = new Hero(Color.YELLOW, 200, 200, 0, 1);
		this.enemyList = new ArrayList<>();
		this.enemyList.add(new Enemy(Color.CYAN, 100, 50, 2, 1));
		this.enemyList.add(new Enemy(Color.CYAN, 200, 50, 2, 1));
		this.enemyList.add(new Enemy(Color.CYAN, 300, 50, 2, 1));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == 32){
			this.hero.shotEnemy();
		}
		
		// TODO Auto-generated method stub
		switch(e.getKeyChar()){
		case 'w':
			this.hero.direct = 0;
			this.hero.moveUp();
			break;
		case 'a':
			this.hero.direct = 1;
			this.hero.moveLeft();
			break;
		case 's':
			this.hero.direct = 2;
			this.hero.moveDown();
			break;
		case 'd':
			this.hero.direct = 3;
			this.hero.moveRight();
			break;
		}
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
		if(this.hero.bullet != null && this.hero.bullet.isLive){
			g.setColor(this.hero.bullet.color);
			g.drawOval(this.hero.bullet.x, this.hero.bullet.y, 1, 1);
		}		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.repaint();
		}
	}
	
	
}

class Tank{
	
	Color color;
	int x;
	int y;
	int direct;
	int speed;
	
	public Tank(Color color, int x, int y, int direct, int speed) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.direct = direct;
		this.speed = speed;
	}
	
	void moveUp(){
		this.y -= speed;
	}
	
	void moveDown(){
		this.y += speed;
	}
	
	void moveLeft(){
		this.x -= speed;
	}
	
	void moveRight(){
		this.x += speed;
	}
	
}
	
class Hero extends Tank{
	
	Bullet bullet;

	public Hero(Color color, int x, int y, int direct, int speed) {
		super(color, x, y, direct, speed);
		// TODO Auto-generated constructor stub		
	}
	
	public void shotEnemy(){
		switch (this.direct) {
		case 0:
			this.bullet = new Bullet(this.x+15, this.y, this.direct, 5, this.color, true);
			break;
		case 1:
			this.bullet = new Bullet(this.x, this.y+15, this.direct, 5, this.color, true);
			break;
		case 2:
			this.bullet = new Bullet(this.x+15, this.y+30, this.direct, 5, this.color, true);
			break;
		case 3:
			this.bullet = new Bullet(this.x+30, this.y+15, this.direct, 5, this.color, true);
			break;
		}
		Thread t = new Thread(this.bullet);
		t.start();
	}
	
}

class Enemy extends Tank{

	public Enemy(Color color, int x, int y, int direct, int speed) {
		super(color, x, y, direct, speed);
		// TODO Auto-generated constructor stub
	}
	
}

class Bullet implements Runnable{
	
	int x;
	int y;
	int direct;
	int speed;
	Color color;
	boolean isLive;
	
	public Bullet(int x, int y, int direct, int speed, Color color, boolean isLive) {
		this.x = x;
		this.y = y;
		this.direct = direct;
		this.speed = speed;
		this.color = color;
		this.isLive = true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("here");
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.direct);
			switch(this.direct){
			case 0 : this.moveUp(); break;
			case 1 : this.moveLeft(); break;
			case 2 : this.moveDown(); break;
			case 3 : this.moveRight(); break;
			}
			
			if(x < 0 || x > 400 || y < 0 ||y > 400){
				this.isLive = false;
				break;
			}
		}
	}
	
	void moveUp(){
		this.y -= speed;
	}
	
	void moveDown(){
		this.y += speed;
	}
	
	void moveLeft(){
		this.x -= speed;
	}
	
	void moveRight(){
		this.x += speed;
	}
}