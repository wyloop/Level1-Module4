package _01_chuckle_clicker;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ChuckleClicker implements ActionListener{
    
	JButton jokeButton = new JButton("Joke");
	JButton punchlineButton = new JButton("Punchline");
	
	public void run() {
    	
    	makeButtons();
    }

    void makeButtons() {
    	JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(800, 600);
        frame.add(panel);

        
		jokeButton.addActionListener(this);
        panel.add(jokeButton);
        
        punchlineButton.addActionListener(this);
        panel.add(punchlineButton);
        
        frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jokeButton) {
			JOptionPane.showMessageDialog(null, "How does the ocean say hi?");
		} else {
			JOptionPane.showMessageDialog(null, "It waves!");
		}
		
		
	}

}