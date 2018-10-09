import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	JTextField F1;
	JTextField F2;
	JButton add;
	JButton subtract;
	JButton multiply;
	JButton divide;
	JButton copyF1;
	JButton copyF2;
	JButton quit;
	JLabel output;
	String copy;
	Calculator(){
		this.setSize(400,400);
		this.setTitle("Calculator");
		F1 = new JTextField("");
		F2 = new JTextField("");
		add = new JButton("+");
		subtract = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		copyF1 = new JButton("Copy answer to F1");
		copyF2 = new JButton("Copy answer to F2");
		quit = new JButton("Quit");
		output = new JLabel("");

		add.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(F1.getText().equals("")||F2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inputs cannot be blank","Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
					String input = F1.getText();
					double value1 = Double.parseDouble(input);
					String input2 = F2.getText();
					double value2 = Double.parseDouble(input2);
					double sum = value1 + value2;
					String str = Double.toString(sum);
					output.setText(str);	
				}
			}			
		});

		subtract.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(F1.getText().equals("")||F2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inputs cannot be blank","Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
					String input = F1.getText();

					double value1 = Double.parseDouble(input);
					String input2 = F2.getText();
					double value2 = Double.parseDouble(input2);
					double s = value1 - value2;
					String str = Double.toString(s);
					output.setText(str);			
				}	
			}
		});

		multiply.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(F1.getText().equals("")||F2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inputs cannot be blank","Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
					String input = F1.getText();

					double value1 = Double.parseDouble(input);
					String input2 = F2.getText();
					double value2 = Double.parseDouble(input2);
					double product = value1 * value2;
					String str = Double.toString(product);
					output.setText(str);				
				}			
			}
		});

		divide.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(F1.getText().equals("")||F2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inputs cannot be blank","Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
					String input = F1.getText();
					double value1 = Double.parseDouble(input);
					String input2 = F2.getText();
					double value2 = Double.parseDouble(input2);
					double quotient = value1/value2;
					String str = Double.toString(quotient);;
					output.setText(str);	
				}	
			}

		});
		copyF1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(F1.getText().equals("")||F2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inputs cannot be blank","Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
					copy = output.getText();
					F1.setText(copy);
					F1 = new JTextField(copy);	
				}
			}		
		});
		copyF2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(F1.getText().equals("")||F2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inputs cannot be blank","Error",JOptionPane.ERROR_MESSAGE);
				}
				else{
					copy = output.getText();
					F2.setText(copy);
					F2 = new JTextField(copy);	
				}
			}	
		});
		quit.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);		
			}		
		});

		GridLayout layout = new GridLayout(4,4);
		this.setLayout(layout);	

		this.add(F1);
		this.add(F2);
		this.add(add);
		this.add(subtract);
		this.add(multiply);
		this.add(divide);
		this.add(copyF1);
		this.add(copyF2);
		this.add(quit);
		this.add(output);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Calculator frame = new Calculator();
	}
}
