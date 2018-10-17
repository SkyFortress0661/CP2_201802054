package task;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrderButton extends JDialog implements ActionListener{

	JPanel p1, p2, p3;
	JLabel label;
	JButton okButton;

	OrderButton(Frame parent, String str) {
		super(parent, str, true);
		setSize(520,100);
		PizzaOrder po = new PizzaOrder(1);
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		add(p1);

		p2 = new JPanel();
		okButton = new JButton("주문완료");
		p2.add(okButton);
		okButton.addActionListener(this);
		add(p2, BorderLayout.CENTER);
		
		p3 = new JPanel();
		label = new JLabel(po.getResult());
		p3.add(label);
		add(p3, BorderLayout.NORTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==okButton) {
			System.exit(0);
		}
	}
}
