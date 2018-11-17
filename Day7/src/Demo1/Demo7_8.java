package Demo1;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Demo7_8 extends JFrame{
	
	JPanel jp1, jp2;
	JLabel jl1, jl2;
	JComboBox<String> jcb1;
	JList jlist;
	JScrollPane jsp;
	
	public Demo7_8() {
		// TODO Auto-generated constructor stub
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jl1 = new JLabel("City of Birth");
		jl2 = new JLabel("Travel Destination");
		
		String[] jg = {"Bejing", "Shanghai", "Tianjin", "Mars"};
		jcb1 = new JComboBox<String>(jg);
		
		String[] dd = {"Jiuzhangou", "Emeishan", "Gugong", "Changcheng"};
		jlist = new JList<>(dd);
		jlist.setVisibleRowCount(2);
		
		jsp = new JScrollPane(jlist);
		
		
		this.setLayout(new GridLayout(3, 1));
		
		jp1.add(jl1);
		jp1.add(jcb1);
		
		jp2.add(jl2);
		jp2.add(jsp);
		
		this.add(jp1);
		this.add(jp2);
		
		this.setSize(300, 300);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7_8 demo7_8 = new Demo7_8();
	}

}
