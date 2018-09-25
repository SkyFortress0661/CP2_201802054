package taskFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterestCalc extends JFrame {

	private JPanel contentPane;
	private JTextField money;
	private JTextField interest;
	private JTextField result;
	private JPanel panel;

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
			public void actionPerformed(ActionEvent e) {
				String won = money.getText();
				String percent = interest.getText();
				int won1 = Integer.parseInt(won);
				float percent1 = Float.parseFloat(percent);
				int result1 = (int) (won1 * percent1 / 100);
				Integer.toString(result1);
				String finalresult = "이자는 연 " + result1 + "만원입니다.";
				result.setText(finalresult);
			}
		});
	}
}
