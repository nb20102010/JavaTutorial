package Demo8;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javafx.scene.image.Image;

public class Demo8_2 extends JFrame{
	
	JTextArea jta;
	JPanel jp1;
	JComboBox<String> jcb;
	JTextField jtf;
	JButton jb;
	JScrollPane jsp;
	
	public Demo8_2() {
		// TODO Auto-generated constructor stub
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		
		jp1 = new JPanel();
		String[] chatter = {"AA", "BB"};
		jcb = new JComboBox<>(chatter);
		jtf = new JTextField(10);
		jb = new JButton("Send");
		
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		
		this.add(jsp);
		this.add(jp1, BorderLayout.SOUTH);
		this.setIconImage((new ImageIcon("images/zhong.jpg")).getImage());
		this.setTitle("Tencent QQ");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_2 demo8_2 = new Demo8_2();
	}

}
