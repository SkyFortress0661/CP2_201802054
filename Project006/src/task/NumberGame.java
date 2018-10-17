package task;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

public class NumberGame extends JFrame implements ActionListener {

	private JPanel head, body, tail;
	private JLabel info, count;
	private JButton retry, exit;
	private JTextField result;
	private JFormattedTextField field;
	private static int countNum, fieldNum, num;
	private static String f;

	NumberGame() {
		setTitle("숫자 게임");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Random random = new Random();
		num = random.nextInt(1010) % 101;

		head = new head1();
		add(head, BorderLayout.NORTH);

		body = new JPanel();
		result = new JTextField();
		result.setColumns(10);
		result.setEditable(false);
		count = new JLabel("시도 횟수 : " + countNum);
		body.add(result);
		body.add(count);
		add(body, BorderLayout.CENTER);

		tail = new JPanel();
		retry = new JButton("다시 시도");
		exit = new JButton("종료");
		tail.add(retry);
		tail.add(exit);
		retry.addActionListener(this);
		exit.addActionListener(this);
		add(tail, BorderLayout.SOUTH);
		setVisible(true);
	}

	public class head1 extends JPanel implements PropertyChangeListener {
		
		head1() {
			info = new JLabel("숫자를 추측하시오:");
			field = new JFormattedTextField(new NumberFormatter());
			field.setValue(new Integer(100));
			field.setColumns(10);
			field.addPropertyChangeListener("value", this);
			add(info);
			add(field);
		}

		@Override
		public void propertyChange(PropertyChangeEvent e) {
			Object source = e.getSource();
			if (source == field) {
				fieldNum = ((Number)field.getValue()).intValue();
				if (fieldNum > 100 || fieldNum < 0) {
					result.setBackground(new Color(0xEEEEEE));
					result.setText("범위를 벗어남");
				} else if (fieldNum == num) {
					result.setText("정답입니다.");
					result.setBackground(Color.GREEN);
				} else if (fieldNum > num) {
					result.setText("너무 높습니다.");
					result.setBackground(Color.RED);
				} else if (fieldNum < num) {
					result.setText("너무 낮습니다.");
					result.setBackground(Color.BLUE);
				}

				String pattern = "^[0-9]*\\.[0-9]*$";
				f = field.getValue().toString();
				boolean i = Pattern.matches(pattern, f);
				try {
					if (i == true) {
						Exception ex = new Exception();
						throw ex;
					}
				} catch (Exception ex) {
					result.setBackground(new Color(0xEEEEEE));
					result.setText("정수를 입력하시오.");
				} finally {
					countNum++;
					count.setText("시도 횟수 : " + countNum);
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == retry) {
			Random random = new Random();
			field.setValue(new Integer(100));
			countNum = 0;
			result.setBackground(new Color(0xEEEEEE));
			result.setText("");
			count.setText("시도 횟수 : " + countNum);
			num = random.nextInt(1010) % 101;
		} else if (e.getSource() == exit) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new NumberGame();
	}
}
