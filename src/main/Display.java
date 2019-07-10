package main;

import javax.swing.JFrame;

public class Display {

	public JFrame frame;
	
	public Display(String title, int width, int height) {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
	
}
