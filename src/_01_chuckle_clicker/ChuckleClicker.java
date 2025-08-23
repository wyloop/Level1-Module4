package _01_chuckle_clicker;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ChuckleClicker {
    public static void main(String[] args) {
        makeButtons();
    }

    static void makeButtons() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);

        JButton buttonOne = new JButton("button 1");
        frame.add(buttonOne);
        JButton buttonTwo = new JButton("button 2");
        frame.add(buttonTwo);
        
        frame.setVisible(true);
    }
}