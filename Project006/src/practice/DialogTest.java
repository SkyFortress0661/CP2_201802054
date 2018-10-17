package practice;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javafx.event.ActionEvent;

public class DialogTest extends JFrame implements ActionListener {

	JPanel p;
	JButton b1, b2;
	SimpleDialog aDialog;

	public DialogTest() {
		p = new JPanel();
		b1 = new JButton("대화상자 생성");
		b2 = new JButton("종료");
		b1.addActionListener(this);
		b2.addActionListener(this);
		p.add(b1);
		p.add(b2);
		add(p, "Center");
	}
/*
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			if (aDialog == null) {
				aDialog = new SimpleDialog(this, "Simple Dialog");
			}
			aDialog.setVisible(true);
			b1.requestFocus();
		}
		if (e.getSource() == b2) {
			System.exit(0);
		}
	}
*/
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			if (aDialog == null) {
				aDialog = new SimpleDialog(this, "Simple Dialog");
			}
			aDialog.setVisible(true);
			b1.requestFocus();
		}
		if (e.getSource() == b2) {
			System.exit(0);
		}
	}

}
