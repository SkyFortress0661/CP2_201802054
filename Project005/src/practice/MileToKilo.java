package practice;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MileToKilo extends JFrame {

	static JPanel contentPane;
	static JLabel label;
	static JTextField textfield;
	static JTextField textfield_1;
	static JButton button;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MileToKilo frame = new MileToKilo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MileToKilo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 250);
		this.setTitle("마일 변환기");
		contentPane = new JPanel();
		setContentPane(contentPane);

		textfield = new JTextField();
		textfield.setBounds(220, 30, 96, 21);
		textfield.setHorizontalAlignment(JTextField.RIGHT);
		textfield.addKeyListener(new KeyListener() {
			private int mile;
			private float kilo;

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (textfield.getText().equals("")) {
						mile = 0;
					} else {
						mile = Integer.valueOf(MileToKilo.textfield.getText());
					}
					kilo = (float) (mile * 1.6);
					
					MileToKilo.textfield_1.setText(mile+" 마일은 "+kilo+" 킬로미터 입니다.");
				}
			}
		});
		contentPane.add(textfield);
		textfield.setColumns(10);

		label = new JLabel("마일을 입력하세요.");
		label.setBounds(70, 30, 110, 20);
		contentPane.add(label);

		textfield_1 = new JTextField();
		textfield_1.setBounds(70, 130, 240, 20);
		textfield_1.setHorizontalAlignment(JTextField.CENTER);
		contentPane.add(textfield_1);
		textfield_1.setColumns(10);

		button = new JButton("변환");
		button.addActionListener(new ActionListener() {
			private int mile;
			private float kilo;

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == MileToKilo.button) {
					if (MileToKilo.textfield.getText().equals("")) {
						mile = 0;
					} else {
						mile = Integer.valueOf(MileToKilo.textfield.getText());
					}
					kilo = (float) (mile * 1.6);
				}
				MileToKilo.textfield_1.setText(mile + " 마일은 " + kilo + " 킬로미터입니다.");
			}
		});
		contentPane.setLayout(null);
		button.setBounds(160, 75, 60, 30);
		contentPane.add(button);
		setVisible(true);
	}
}
