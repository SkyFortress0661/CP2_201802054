package practice;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.DateFormatter;
import javax.swing.text.NumberFormatter;


public class MyFrame extends JFrame implements PropertyChangeListener{
	
	private String amount ="";
	private Date date;
	
	private JFormattedTextField amountField;
	private JFormattedTextField dateField;
	
	public MyFrame() {
		super("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		amountField = new JFormattedTextField(new NumberFormatter());
		amountField.setValue(new Integer(1000));
		amountField.setColumns(10);
		amountField.addPropertyChangeListener("value", this);
		panel.add(new JLabel("금액 : "));
		panel.add(amountField);
		
		dateField = new JFormattedTextField(new DateFormatter());
		dateField.setValue(new Date());
		dateField.setColumns(10);
		dateField.addPropertyChangeListener("value", this);
		panel.add(new JLabel("날짜 : "));
		panel.add(dateField);
		
		add(panel);
		pack();
		setVisible(true);
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent e) {
		Object source = e.getSource();
		if(source==amountField) {
			amount = amountField.getValue().toString();
			System.out.println(amountField.getValue());
		}
		if(source==dateField) {
			date = ((Date) dateField.getValue());
			System.out.println(date);
		}
	}
}
