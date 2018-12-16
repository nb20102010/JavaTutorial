package Test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test9_1 extends JFrame{
	
	MyBoard jp1;
	JPanel jp2;
	JButton jb1; 
	JButton jb2; 
	
	public Test9_1() {
		// TODO Auto-generated constructor stub
		jp1 = new MyBoard();
		jp1.setPreferredSize(new Dimension(500, 500));
		jp2 = new JPanel();
		
		jp2.setLayout(new GridLayout(1, 2));
		
		jb1 = new JButton("Easy Game");
		jb2 = new JButton("New Game");
		
		jb1.addActionListener(jp1);
		jb2.addActionListener(jp1);
		
		jp2.add(jb1);
		jp2.add(jb2);
		
		this.add(jp1, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		this.addMouseListener(jp1);
		this.setSize(520, 570);
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new Test9_1();
	}

}

class MyBoard extends JPanel implements MouseListener,ActionListener{
	
	int[][] board;
	boolean easyGame;
	int player;
	
	public MyBoard() {
		// TODO Auto-generated constructor stub
		this.board = new int[5][5];
		this.easyGame = false;
		this.player = 1;
	}
	
	public void paint(Graphics g){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if(board[i][j] == 1){
					g.setColor(Color.RED);
				} else if(board[i][j] == 2){
					g.setColor(Color.BLUE);
				} else {
					g.setColor(Color.GRAY);
				}
				g.fill3DRect(i*100, j*100, 100, 100, false);
			}
		}
		System.out.println(player);
	}
	
	public void makeMove(int i, int j){
		board[i][j] = player;
		if(!easyGame){
			if(i > 0) board[i-1][j] = player;
			if(i < 4) board[i+1][j] = player;
			if(j > 0) board[i][j-1] = player;
			if(j < 4) board[i][j+1] = player;
		}
		player = player ^ 3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		if(command.equals("New Game")){
			System.out.println("Now New Game");
			this.board = new int[5][5];
		} else if(command.equals("Easy Game")){
			System.out.println("Now Easy Game");
			this.easyGame = true;
			JButton jb = (JButton)e.getSource();
			jb.setText("Hard Game");
		} else if(command.equals("Hard Game")){
			System.out.println("Now Hard Game");
			this.easyGame = false;
			JButton jb = (JButton)e.getSource();
			jb.setText("Easy Game");
		}
		this.repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX() - 8;
		int y = e.getY() - 31;
		System.out.println(x + " " + y);
		if(x < 500 && y < 500){
			this.makeMove(x/100, y/100);
			this.repaint();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
