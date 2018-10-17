package task;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

import practice.SimpleDialog;

public class PizzaOrder extends JFrame implements ActionListener {

	private JRadioButton combo, potato, bulgogi;
	private JCheckBox piment, cheeze, pepperoni, bacon;
	private JRadioButton small, medium, large;
	private JLabel text;
	private JButton order, cancel;
	OrderButton ob;
	private JPanel WelcomePanel, SizePanel, ToppingPanel, TypePanel, ButtonPanel;
	private String sizeStr = "", typeStr = "", pimentStr = "", cheezeStr = "", pepperoniStr = "", baconStr = "";
	private static String result = "";

	public PizzaOrder(int a) {
	}
	public PizzaOrder() {
		setTitle("피자 주문");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		WelcomePanel = new WelcomePanel1();
		add(WelcomePanel, BorderLayout.NORTH);

		ToppingPanel = new ToppingPanel1();
		piment.addItemListener(new CheckBoxListener());
		cheeze.addItemListener(new CheckBoxListener());
		pepperoni.addItemListener(new CheckBoxListener());
		bacon.addItemListener(new CheckBoxListener());
		add(ToppingPanel, BorderLayout.CENTER);

		SizePanel = new SizePanel1();
		small.addActionListener(new RadioListener());
		medium.addActionListener(new RadioListener());
		large.addActionListener(new RadioListener());
		add(SizePanel, BorderLayout.EAST);

		TypePanel = new TypePanel1();
		combo.addActionListener(new RadioListener());
		potato.addActionListener(new RadioListener());
		bulgogi.addActionListener(new RadioListener());
		add(TypePanel, BorderLayout.WEST);

		ButtonPanel = new ButtonPanel1();
		order.addActionListener(this);
		cancel.addActionListener(this);
		add(ButtonPanel, BorderLayout.SOUTH);

		setVisible(true);
	}

	public class WelcomePanel1 extends JPanel {

		WelcomePanel1() {
			text = new JLabel("자바 피자에 오신 것을 환영합니다.");
			add(text);
		}
	}

	public class ToppingPanel1 extends JPanel {
		ToppingPanel1() {
			piment = new JCheckBox("피망");
			cheeze = new JCheckBox("치즈");
			pepperoni = new JCheckBox("페퍼로니");
			bacon = new JCheckBox("베이컨");
			add(piment);
			add(cheeze);
			add(pepperoni);
			add(bacon);
			Border toppingBorder = BorderFactory.createTitledBorder("추가 토핑");
			setLayout(new GridLayout(2, 2));
			setBorder(toppingBorder);
		}
	}

	public class SizePanel1 extends JPanel {
		SizePanel1() {
			small = new JRadioButton("Small");
			medium = new JRadioButton("Medium");
			large = new JRadioButton("Large");
			ButtonGroup size = new ButtonGroup();
			size.add(small);
			size.add(medium);
			size.add(large);
			add(small);
			add(medium);
			add(large);
			Border sizeBorder = BorderFactory.createTitledBorder("크기");
			setLayout(new GridLayout(3, 1));
			setBorder(sizeBorder);
		}
	}

	public class TypePanel1 extends JPanel {
		TypePanel1() {
			combo = new JRadioButton("콤보");
			potato = new JRadioButton("포테이토");
			bulgogi = new JRadioButton("불고기");
			ButtonGroup size = new ButtonGroup();
			size.add(combo);
			size.add(potato);
			size.add(bulgogi);
			add(combo);
			add(potato);
			add(bulgogi);
			Border typeBorder = BorderFactory.createTitledBorder("종류");
			setLayout(new GridLayout(3, 1));
			setBorder(typeBorder);
		}
	}

	public class ButtonPanel1 extends JPanel {
		ButtonPanel1() {
			order = new JButton("주문");
			cancel = new JButton("취소");
			add(order);
			add(cancel);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == order) {
			if (ob == null) {
				ob = new OrderButton(this, "주문완료");
			}
			ob.setVisible(true);
			order.requestFocus();
		}
		if (e.getSource() == cancel) {
			System.exit(0);
		}
	}

	private class RadioListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == combo) {
				typeStr = "종류는 콤보 피자, ";
			}
			if (e.getSource() == potato) {
				typeStr = "종류는 포테이토 피자, ";
			}
			if (e.getSource() == bulgogi) {
				typeStr = "종류는 불고기 피자, ";
			}
			if (e.getSource() == small) {
				sizeStr = "크기는 Small";
			}
			if (e.getSource() == medium) {
				sizeStr = "크기는 Medium";
			}
			if (e.getSource() == large) {
				sizeStr = "크기는 Large";
			}
			result = typeStr + "토핑은 " + pimentStr + cheezeStr + pepperoniStr + baconStr + sizeStr + "을 주문했습니다.";
		}
	}

	private class CheckBoxListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Object source = e.getItemSelectable();
			if (source == piment) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					pimentStr = "";
				} else {
					pimentStr = "피망, ";
				}
			}
			if (source == cheeze) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					cheezeStr = "";
				} else {
					cheezeStr = "치즈, ";
				}
			}
			if (source == pepperoni) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					pepperoniStr = "";
				} else {
					pepperoniStr = "페퍼로니, ";
				}
			}
			if (source == bacon) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					baconStr = "";
				} else {
					baconStr = "베이컨, ";
				}
			}
			result = typeStr + "토핑은 " + pimentStr + cheezeStr + pepperoniStr + baconStr + sizeStr + "을 주문했습니다.";
		}
	}
	public String getResult() {
		return result;
	}
	
	public static void main(String[] args) {
		new PizzaOrder();

	}
}
