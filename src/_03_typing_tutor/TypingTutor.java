package _03_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;

	public void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		currentLetter = generateRandomLetter();
		
		label.setText(Character.toString(currentLetter));
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setLocation(0, 0);
		
		frame.addKeyListener(this);
		
		panel.add(label);
		frame.add(panel);
		
		frame.pack();
	} 
	
	char generateRandomLetter() { 
		Random r = new Random(); 
		return (char) (r.nextInt(26) + 'a'); 
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		
		if(e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			panel.setBackground(Color.green);
		} else {
			panel.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		
		label.setText(Character.toString(currentLetter));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
