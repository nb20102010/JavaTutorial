package Demo8;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSplitPane;

public class Demo8_1 extends JFrame{

	JSplitPane jsp;
	JList<String> jList;
	JLabel jl1;
	
	public Demo8_1() {
		// TODO Auto-generated constructor stub
		String[] words = {"boy", "girl", "bird"};
		jList = new JList<>(words);
		
		jl1 = new JLabel(new ImageIcon("images/zhong.jpg"));
		
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		jsp.add(jList);
		jsp.add(jl1);
		jsp.setOneTouchExpandable(true);
		
		this.add(jsp);
		this.setSize(400, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		Demo8_1 demo8_1 = new Demo8_1();
	}

}
