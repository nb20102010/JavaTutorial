package Hello;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class testListener extends JFrame{
	
	MyPanel2 mp1, mp2;
	MyButton2 mb1;
	MyButton2 mb2;
	
	boolean easyGame = false;
	
	public testListener() {
		// TODO Auto-generated constructor stub
		mp1 = new MyPanel2();
		mp2 = new MyPanel2();
		
		mb1 = new MyButton2("aaa");
		mb2 = new MyButton2("bbb");
		
		this.setLayout(new BorderLayout());
		
		this.add(mp1, BorderLayout.WEST);
		this.add(mp2);
		
		mp1.setLayout(new BorderLayout());
		mp2.setLayout(new BorderLayout());
		mp1.add(mb1, BorderLayout.CENTER);
		mp2.add(mb2, BorderLayout.CENTER);
		mb1.addActionListener(mp1);
		mb2.addActionListener(mp2);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args){new testListener();}
	
}

class MyPanel2 extends JPanel implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stu
		System.out.println(e.getActionCommand());
	}
	
}

class MyButton2 extends JButton implements MouseListener{
	
	

	public MyButton2(String string) {
		// TODO Auto-generated constructor stub
		this.setActionCommand(string);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mybutton");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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