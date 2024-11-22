import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame{
	
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnStar;
	private JButton btnSlash;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnDot;
	private JButton btnAssign;
	
	private JTextField textField;
	
	Calculator(){
		setSize(400,400);
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4,4));
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("", 1, 20));
		centerPanel.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("", 1, 20));
		centerPanel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("", 1, 20));
		centerPanel.add(btn9);
		
		btnStar = new JButton("*");
		btnStar.setFont(new Font("", 1, 40));
		centerPanel.add(btnStar);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("", 1, 20));
		centerPanel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("", 1, 20));
		centerPanel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("", 1, 20));
		centerPanel.add(btn6);
		
		btnSlash = new JButton("/");
		btnSlash.setFont(new Font("", 1, 40));
		centerPanel.add(btnSlash);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("", 1, 20));
		centerPanel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("", 1, 20));
		centerPanel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("", 1, 20));
		centerPanel.add(btn3);
		
		btnPlus = new JButton("+");
		btnPlus.setFont(new Font("", 1, 40));
		centerPanel.add(btnPlus);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("", 1, 20));
		centerPanel.add(btn0);
		
		btnDot = new JButton(".");
		btnDot.setFont(new Font("", 1, 40));
		centerPanel.add(btnDot);
		
		btnAssign = new JButton("=");
		btnAssign.setFont(new Font("", 1, 40));
		centerPanel.add(btnAssign);
		
		btnMinus = new JButton("-");
		btnMinus.setFont(new Font("", 1, 40));
		centerPanel.add(btnMinus);
		
		add("Center", centerPanel);
		
		textField = new JTextField();
		textField.setFont(new Font("",1,25));
		textField.setHorizontalAlignment(JTextField.RIGHT);
		add("North", textField);
		
	}
}


class Swing3{
	public static void main(String args[]){
		
		Calculator c1 = new Calculator();
		c1.setVisible(true);
	}
}
