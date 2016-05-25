package hw02;

import java.awt.*;

import javax.swing.*;

public class Calculator extends JFrame {

	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { 
			"Backspace", "CE", "C", "%", 
			"7", "8", "9", "/", 
			"4", "5", "6", "*",
			"1", "2", "3", "-",
			"0", ".", "+", "=",
	};

	public Calculator() {
		tField = new JTextField(35);
		tField.setAlignmentX(JTextField.RIGHT);
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 4, 3, 3));
		buttons = new JButton[20];
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 4; cols++) {
				buttons[index] = new JButton(labels[index]);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
  
	public static void main(String args[]) {
		Calculator c = new Calculator();
	}

}
