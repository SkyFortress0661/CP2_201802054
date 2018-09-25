package taskFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Label;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DropMode;
import javax.swing.BoxLayout;

public class MileToKilo extends JFrame {

	private JPanel panel;
	private JTextField textField;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MileToKilo frame = new MileToKilo();
					JFrame jf = new JFrame();
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

	public MileToKilo() {
		setTitle("마일을 킬로미터로 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 205);
		panel = new JPanel();
		panel.setLayout(null);
		JLabel label = new JLabel("거리를 마일 단위로 입력하시오.");
		label.setBounds(65, 20, 200, 20);
		panel.add(label);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);

		textField = new JTextField(20);
		textField.setBounds(250, 20, 100, 20);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(textField);
		textField.setColumns(10);

		JPanel panel_1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel_1.setBounds(65, 60, 285, 36);
		panel.add(panel_1);
		setBounds(100, 100, 435, 205);
		JButton btnNewButton = new JButton("변환");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sou = textField.getText();
				float mile = Float.parseFloat(sou);
				float kiloM = (float) (mile * 1.6);
				Float.toString(mile);
				Float.toString(kiloM);
				String result = mile + " 마일은 " + kiloM + " 킬로미터입니다.";
				textFieldResult.setText(result);
			}
		});
		btnNewButton.setBounds(170, 65, 90, 25);
		panel_1.add(btnNewButton);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(65, 106, 285, 20);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		textFieldResult = new JTextField();

		panel_2.add(textFieldResult, BorderLayout.CENTER);
		textFieldResult.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResult.setColumns(10);
	}
}
