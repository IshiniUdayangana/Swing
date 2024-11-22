import javax.swing.*;
import java.awt.*;

class AddCustomerForm extends JFrame{
	
	private JButton addBtn;
	private JButton cancel_btn;
	
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldSalary;
	
	private JLabel customerId;
	private JLabel name;
	private JLabel Address;
	private JLabel salary;
	
	AddCustomerForm(){
		setSize(400,300);
		setTitle("Add customer form");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel textFieldPanel = new JPanel();
		
		textFieldId = new JTextField();
		textFieldName = new JTextField();
		textFieldAddress = new JTextField();
		textFieldSalary = new JTextField();
		
		textFieldAddress.setFont(new Font("", 1, 25));
		
		textFieldPanel.add(textFieldId);
		textFieldPanel.add(textFieldName);
		textFieldPanel.add(textFieldAddress);
		textFieldPanel.add(textFieldSalary);
		
		add("East", textFieldPanel);
	}
}

class Swing4{
	public static void main(String args[]){
		AddCustomerForm f1 = new AddCustomerForm();
		f1.setVisible(true);
	}
}
