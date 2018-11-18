package practice;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CountDownTest extends JFrame{
	private JPanel count_panel;
	private JPanel button_panel;
	private JLabel label01;
	private JLabel label02;
	private JButton button;
	
	class MyThread extends Thread{
		public void run() {
			for(int i = 10 ;i<=0;i--) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				label01.setText(i+"");
			}
		}
	}
	public CountDownTest() {
		setTitle("카운트다운");
		setSize(500,200);
		setLayout(new GridLayout(1,2));
		count_panel=new JPanel();
		label01 = new JLabel("Start");
		label01.setFont(new Font("Serif", Font.BOLD,100));
		count_panel.add(label01);
		add(count_panel);
		
		button_panel = new JPanel(new GridLayout(2,1));
		label02 = new JLabel("정지하려면 버튼을 누르세요.");
		button = new JButton("장비를 정지합니다.");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				label02.setText("안돼잖아> 어.. 정.. 정지가 안돼");
			}
		});
		button_panel.add(button);
		button_panel.add(label02);
		add(button_panel);
		(new MyThread()).start();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		CountDownTest cdt = new CountDownTest();
	}

}
