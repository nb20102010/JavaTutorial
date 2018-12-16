package Hello;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class testButton extends JFrame implements MouseListener{

	MyButton mb1, mb2;
	
	
	public testButton() {
		// TODO Auto-generated constructor stub
		mb1 = new MyButton("A");
		mb2 = new MyButton("B");
		MyActionListener mal = new MyActionListener();
		mb1.addActionListener(mal);
		mb2.addActionListener(mal);
		
		this.add(mb1, BorderLayout.WEST);
		this.add(mb2, BorderLayout.EAST);
		
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args){new testButton();}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

class MyButton extends JButton{

	public MyButton(String s) {
		// TODO Auto-generated constructor stub
		this.setText(s);
	}

	
	
}


class MyActionListener implements ActionListener{

	   public void actionPerformed(ActionEvent e){
		   System.out.println(e.getSource());

	      String com=e.getActionCommand();//得到按钮响应

	      if(com.equals("A")){
	         System.out.println("Pressed A");
	      }
	      if(com.equals("B")){
	    	  System.out.println("Pressed B");
	      }

	   }

	}