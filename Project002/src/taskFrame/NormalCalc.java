package taskFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class NormalCalc extends JFrame {
	public int su;
	public int mark;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NormalCalc frame = new NormalCalc();
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
	public NormalCalc() {
		su = 0;
		mark = 0;
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 310);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(55, 10, 230, 30);
		contentPane.add(textField);
		textField.setText("");
		textField.setColumns(10);

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.setBounds(55, 55, 50, 30);
		contentPane.add(panel);

		JButton btnNewButton = new JButton("C");
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_1.setBounds(55, 215, 230, 30);
		contentPane.add(panel_1);

		JButton button_12 = new JButton("0");
		panel_1.add(button_12);

		JButton button_13 = new JButton("00");
		panel_1.add(button_13);

		JButton button_14 = new JButton("=");
		panel_1.add(button_14);

		JButton button_15 = new JButton("+");
		panel_1.add(button_15);

		JPanel panel_2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_2.setBounds(55, 175, 230, 30);
		contentPane.add(panel_2);

		JButton button_2 = new JButton("1");
		panel_2.add(button_2);

		JButton button_3 = new JButton("2");
		panel_2.add(button_3);

		JButton button_11 = new JButton("3");
		panel_2.add(button_11);

		JButton button_9 = new JButton("-");
		panel_2.add(button_9);

		JPanel panel_3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_3.setBounds(55, 135, 230, 30);
		contentPane.add(panel_3);
		
				JButton button_1 = new JButton("4");
				panel_3.add(button_1);
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String sat = textField.getText();
						sat += "4";
						textField.setText(sat);
					}
				});

		JButton button_4 = new JButton("5");
		panel_3.add(button_4);

		JButton button_10 = new JButton("6");
		panel_3.add(button_10);

		JButton button_8 = new JButton("*");
		panel_3.add(button_8);

		JPanel panel_4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_4.setBounds(55, 95, 230, 30);
		contentPane.add(panel_4);

		JButton button = new JButton("7");
		panel_4.add(button);

		JButton button_5 = new JButton("8");
		panel_4.add(button_5);

		JButton button_6 = new JButton("9");
		panel_4.add(button_6);

		JButton button_7 = new JButton("/");
		panel_4.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				int su1 = Integer.parseInt(sat);
				su = su1;
				mark = 4;
				textField.setText("");
			}
		});
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				sat += "9";
				textField.setText(sat);
			}
		});
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				sat += "8";
				textField.setText(sat);
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				sat += "7";
				textField.setText(sat);
			}
		});
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				int su1 = Integer.parseInt(sat);
				su = su1;
				mark = 3;
				textField.setText("");
			}
		});
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				sat += "6";
				textField.setText(sat);
			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				sat += "5";
				textField.setText(sat);
			}
		});
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				int su1 = Integer.parseInt(sat);
				su = su1;
				mark = 2;
				textField.setText("");
			}
		});
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				sat += "3";
				textField.setText(sat);
			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				sat += "2";
				textField.setText(sat);
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				sat += "1";
				textField.setText(sat);
			}
		});
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				int su1 = Integer.parseInt(sat);
				su = su1;
				mark = 1;
				textField.setText("");
			}
		});
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				int su1 = Integer.parseInt(sat);
				int result = 0;
				if (mark == 1) {
					result = su + su1;
				} else if (mark == 2) {
					result = su - su1;
				} else if (mark == 3) {
					result = su * su1;
				} else if (mark == 4) {
					result = su / su1;
				} else {
					textField.setText("");
				}
				Integer.toString(result);
				textField.setText("");
				String finalresult = result + "";
				textField.setText(finalresult);
			}
		});
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				sat += "00";
				textField.setText(sat);
			}
		});
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sat = textField.getText();
				sat += "0";
				textField.setText(sat);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				su = 0;
				mark = 0;
			}
		});
	}
}
