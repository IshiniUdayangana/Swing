import javax.swing.*;
import java.awt.*;

class Swing1{
	public static void main(String args[]){
		JFrame f1 = new JFrame("Border Layout");
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);
		f1.setSize(400,400);
		
		JButton b1 = new JButton();
		b1.setText("North");
		b1.setFont(new Font("",1,20));
		f1.add("North",b1);
		
		JButton b2 = new JButton();
		b2.setText("West");
		b2.setFont(new Font("",1,20));
		f1.add("West", b2);
		
		JButton b3 = new JButton("East");
		b3.setFont(new Font("", 1, 20));
		f1.add("East",b3);
		
		JButton b4 = new JButton();
		b4.setText("Center");
		b4.setFont(new Font("",1,20));
		f1.add("Center",b4);
		
		JButton b5 = new JButton("South");
		b5.setFont(new Font("",1,20));
		f1.add("South",b5);
		
		f1.pack();

	}
}
