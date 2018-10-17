package practice;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleDialog extends JDialog implements ActionListener {

	JPanel p1, p2;
	JLabel label;
	JButton okButton, cancelButton;

	SimpleDialog(Frame parent, String str) {
		super(parent, str, true);
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		add(p1);
		
		p2 = new JPanel();
		label = new JLabel("간단한 대화 상자입니다.");
		p2.add(label);
		
		okButton = new JButton("OK");
		cancelButton = new JButton("Cancel");
		okButton.addActionListener(this);
		cancelButton.addActionListener(this);
		p2.add(okButton);
		p2.add(cancelButton);
		add(p2, BorderLayout.CENTER);
		
		setSize(300,100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==okButton) {
			label.setText("OK");
		}else if(e.getSource()==cancelButton) {
			this.setVisible(false);
		}
	}
}
