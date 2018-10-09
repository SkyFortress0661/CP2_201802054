package task;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class NormalCalc extends JFrame {
	static int su;
	static int mark;
	static int equalCount;
	static int calCount;
	private JPanel contentPane;
	private JTextField textField;

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

	public NormalCalc() {
		su = 0;
		mark = 0;
		equalCount = 0;
		calCount = 0;
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 310);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(55, 10, 230, 30);
		textField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (equalCount == 0) {
						if (textField.getText().equals("")) {
							textField.setText("0");
						}
						String sat = textField.getText();
						int su1 = Integer.parseInt(sat);
						if (calCount == 1) {
							su1 = 0;
						}
						int result = 0;
						if (mark == 1) {
							result = su + su1;
						} else if (mark == 2) {
							result = su - su1;
						} else if (mark == 3) {
							if (su1 == 0) {
								su1 = 1;
							}
							result = su * su1;
						} else if (mark == 4) {
							if (su1 == 0) {
								su1 = 1;
							}
							result = su / su1;
						} else {
							result = su;
							textField.setText("0");
						}
						Integer.toString(result);
						textField.setText("");
						String finalresult = result + "";
						textField.setText(finalresult);
						equalCount = 1;
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					if (textField.getText().equals("")) {
						textField.setText("0");
					}
					su = 0;
					mark = 0;
					textField.setText("0");
				}
			}
		});
		contentPane.add(textField);
		textField.setText("");
		textField.setColumns(10);

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.setBounds(55, 55, 50, 30);
		contentPane.add(panel);

		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")) {
					textField.setText("0");
				}
				su = 0;
				mark = 0;
				textField.setText("0");
			}
		});
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_1.setBounds(55, 215, 230, 30);
		contentPane.add(panel_1);

		JButton button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") || textField.getText().equals("0")) {
					textField.setText("0");
				} else {
					String sat = textField.getText();
					sat += "0";
					textField.setText(sat);
				}
			}
		});
		panel_1.add(button_12);

		JButton button_13 = new JButton("00");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") || textField.getText().equals("0")) {
					textField.setText("0");
				} else {
					String sat = textField.getText();
					sat += "00";
					textField.setText(sat);
				}
			}
		});
		panel_1.add(button_13);

		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (equalCount == 0) {
					if (textField.getText().equals("")) {
						textField.setText("0");
					}
					String sat = textField.getText();
					int su1 = Integer.parseInt(sat);
					if (calCount == 1) {
						su1 = 0;
					}
					int result = 0;
					if (mark == 1) {
						result = su + su1;
					} else if (mark == 2) {
						result = su - su1;
					} else if (mark == 3) {
						if (su1 == 0) {
							su1 = 1;
						}
						result = su * su1;
					} else if (mark == 4) {
						if (su1 == 0) {
							su1 = 1;
						}
						result = su / su1;
					} else {
						result = su;
						textField.setText("0");
					}
					Integer.toString(result);
					textField.setText("");
					String finalresult = result + "";
					textField.setText(finalresult);
					equalCount = 1;
				}
			}
		});
		panel_1.add(button_14);

		JButton button_15 = new JButton("+");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int su1;
				String sat = textField.getText();
				if (sat.equals("")) {
					su1 = 0;
					textField.setText("0");
				} else {
					su1 = Integer.parseInt(sat);
				}
				su = su1;
				mark = 1;
				equalCount = 0;
				calCount = 1;
			}
		});
		panel_1.add(button_15);

		JPanel panel_2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_2.setBounds(55, 175, 230, 30);
		contentPane.add(panel_2);

		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
				}
				if (calCount == 1) {
					textField.setText("");
					calCount = 0;
				}
				String sat = textField.getText();
				sat += "1";
				textField.setText(sat);
			}
		});
		panel_2.add(button_2);

		JButton button_3 = new JButton("2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
				}
				if (calCount == 1) {
					textField.setText("");
					calCount = 0;
				}
				String sat = textField.getText();
				sat += "2";
				textField.setText(sat);
			}
		});
		panel_2.add(button_3);

		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
				}
				if (calCount == 1) {
					textField.setText("");
					calCount = 0;
				}
				String sat = textField.getText();
				sat += "3";
				textField.setText(sat);
			}
		});
		panel_2.add(button_11);

		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int su1;
				String sat = textField.getText();
				if (sat.equals("")) {
					su1 = 0;
					textField.setText("0");
				} else {
					su1 = Integer.parseInt(sat);
				}
				su = su1;
				mark = 2;
				equalCount = 0;
				calCount = 1;
			}
		});
		panel_2.add(button_9);

		JPanel panel_3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_3.setBounds(55, 135, 230, 30);
		contentPane.add(panel_3);

		JButton button_1 = new JButton("4");
		panel_3.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
				}
				if (calCount == 1) {
					textField.setText("");
					calCount = 0;
				}
				String sat = textField.getText();
				sat += "4";
				textField.setText(sat);
			}
		});

		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
				}
				if (calCount == 1) {
					textField.setText("");
					calCount = 0;
				}
				String sat = textField.getText();
				sat += "5";
				textField.setText(sat);
			}
		});
		panel_3.add(button_4);

		JButton button_10 = new JButton("6");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
				}
				if (calCount == 1) {
					textField.setText("");
					calCount = 0;
				}
				String sat = textField.getText();
				sat += "6";
				textField.setText(sat);
			}
		});
		panel_3.add(button_10);

		JButton button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int su1;
				String sat = textField.getText();
				if (sat.equals("")) {
					su1 = 0;
					textField.setText("0");
				} else {
					su1 = Integer.parseInt(sat);
				}
				su = su1;
				mark = 3;
				equalCount = 0;
				calCount = 1;
			}
		});
		panel_3.add(button_8);

		JPanel panel_4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_4.setBounds(55, 95, 230, 30);
		contentPane.add(panel_4);

		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
				}
				if (calCount == 1) {
					textField.setText("");
					calCount = 0;
				}
				String sat = textField.getText();
				sat += "7";
				textField.setText(sat);
			}
		});
		panel_4.add(button);

		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
				}
				if (calCount == 1) {
					textField.setText("");
					calCount = 0;
				}
				String sat = textField.getText();
				sat += "8";
				textField.setText(sat);
			}
		});
		panel_4.add(button_5);

		JButton button_6 = new JButton("9");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
				}
				if (calCount == 1) {
					textField.setText("");
					calCount = 0;
				}
				String sat = textField.getText();
				sat += "9";
				textField.setText(sat);
			}
		});
		panel_4.add(button_6);

		JButton button_7 = new JButton("/");
		panel_4.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int su1;
				String sat = textField.getText();
				if (sat.equals("")) {
					su1 = 0;
					textField.setText("0");
				} else {
					su1 = Integer.parseInt(sat);
				}
				su = su1;
				mark = 4;
				equalCount = 0;
				calCount = 1;
			}
		});
	}
}
