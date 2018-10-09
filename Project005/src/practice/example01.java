package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class example01 extends JFrame {
	
	private JButton button;
	private JLabel label;

	public example01() {
		this.setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르세요.");
		
		button.addActionListener((ActionListener) new MyListener());
		
		panel.add(button);
		label = new JLabel("아직 버튼이 누르지 않았습니다.");
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				label.setText("마침내 버튼이 눌려졌습니다.");
			}
		}
	}
}
