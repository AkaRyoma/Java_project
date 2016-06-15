package exam_0615;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(){
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
		
		setLayout(new FlowLayout());
		JButton button = new JButton("Button");
		this.add(button);
		setVisible(true);
	}
	
}
