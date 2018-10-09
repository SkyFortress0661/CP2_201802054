package task;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import practice.MileToKilo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class InterestCalc extends JFrame {

	static JPanel contentPane;
	static JTextField money;
	static JTextField interest;
	static JTextField result;
	static JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterestCalc frame = new InterestCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterestCalc() {
		setTitle("이자 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("원금을 입력하시오.");
		lblNewLabel.setBounds(60, 20, 110, 20);
		contentPane.add(lblNewLabel);

		money = new JTextField();
		money.setHorizontalAlignment(SwingConstants.RIGHT);
		money.setBounds(190, 20, 100, 20);
		contentPane.add(money);
		money.setColumns(10);

		interest = new JTextField();
		interest.setHorizontalAlignment(SwingConstants.RIGHT);
		interest.setBounds(190, 50, 100, 20);
		interest.addKeyListener(new KeyListener() {
			private int allMoney;
			private float bankInterest;

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (money.getText().equals("")) {
						allMoney = 0;
						InterestCalc.money.setText("0");
					} else {
						allMoney = Integer.valueOf(InterestCalc.money.getText());
					}
					if (interest.getText().equals("")) {
						bankInterest = 0;
						InterestCalc.interest.setText("1");
					} else {
						bankInterest = Integer.valueOf(InterestCalc.interest.getText());
					}

					InterestCalc.result.setText("이자는 연 " + (allMoney * bankInterest / 100) + "원입니다.");
				}
			}
		});
		contentPane.add(interest);
		interest.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("이율을 입력하시오.");
		lblNewLabel_1.setBounds(60, 50, 110, 20);
		contentPane.add(lblNewLabel_1);

		panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setBounds(60, 80, 230, 48);
		contentPane.add(panel);

		JButton btnNewButton = new JButton("계산");
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(60, 138, 230, 20);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		result = new JTextField();
		panel_1.add(result, BorderLayout.CENTER);
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			private int allMoney;
			private float bankInterest;

			public void actionPerformed(ActionEvent e) {

				if (money.getText().equals("")) {
					allMoney = 0;
					InterestCalc.money.setText("0");
				} else {
					allMoney = Integer.valueOf(InterestCalc.money.getText());
				}
				if (interest.getText().equals("")) {
					bankInterest = 0;
					InterestCalc.interest.setText("1");
				} else {
					bankInterest = Integer.valueOf(InterestCalc.interest.getText());
				}

				InterestCalc.result.setText("이자는 연 " + (allMoney * bankInterest / 100) + "원입니다.");
			}
		});
	}
}
