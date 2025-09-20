package _06_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
	public void run() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel numbers = new JPanel();
		JPanel operators = new JPanel();
		
		JTextField firstNumber = new JTextField(8);
		JTextField secondNumber = new JTextField(8);
		
		JButton add = new JButton();
		JButton subtract = new JButton();
		JButton multiply = new JButton();
		JButton divide = new JButton();
		
		JLabel result = new JLabel();
		
		numbers.add(firstNumber);
		numbers.add(secondNumber);
		
		panel.add(numbers);
		
		add.setText("add");
		subtract.setText("subtract");
		multiply.setText("multiply");
		divide.setText("divide");
		
		operators.add(add);
		operators.add(subtract);
		operators.add(multiply);
		operators.add(divide);
		
		panel.add(operators);
		
		panel.add(result);
		
		frame.add(panel);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
	
	public void add(double numberOne, double numberTwo) {
		System.out.println(numberOne + numberTwo);
	}
	
	public void subtract(double numberOne, double numberTwo) {
		System.out.println(numberOne - numberTwo);
	}
	
	public void multiply(double numberOne, double numberTwo) {
		System.out.println(numberOne * numberTwo);
	}
	
	public void divide(double numberOne, double numberTwo) {
		System.out.println(numberOne / numberTwo);
	}

	
}
