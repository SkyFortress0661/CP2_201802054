package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class CoffeeOrderFrame extends JFrame{
	
	private JCheckBox cream, syrup;
	private JRadioButton small, medium, large;
	private JLabel text;
	private String creamOption="", syrupOption="", sizeResult="";
	private JPanel topPanel, choicePanel, resultPanel;
	
	public CoffeeOrderFrame() {
		setTitle("커피 주문");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("커피를 주문 하시겠습니까?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		choicePanel = new JPanel();
		
		cream = new JCheckBox("휘핑크림");
		syrup = new JCheckBox("시럽");
		
		choicePanel.add(cream);
		choicePanel.add(syrup);
		
		cream.addItemListener(new CheckBoxListener());
		syrup.addItemListener(new CheckBoxListener());
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		small.addActionListener(new RadioListener());
		medium.addActionListener(new RadioListener());
		large.addActionListener(new RadioListener());
		choicePanel.add(small);
		choicePanel.add(medium);
		choicePanel.add(large);
		Border sizeborder = BorderFactory.createTitledBorder("크기");
		choicePanel.setBorder(sizeborder);
		add(choicePanel, BorderLayout.CENTER);
		
		resultPanel = new JPanel();
		text = new JLabel("커피가 아직 선택되지 않았습니다.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);

		setVisible(true);
	}
	private class RadioListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== small) {
				sizeResult="Small 크기가 선택되었습니다.";
				text.setText(creamOption+syrupOption+sizeResult);
			}
			if(e.getSource()== medium) {
				sizeResult="Medium 크기가 선택되었습니다.";
				text.setText(creamOption+syrupOption+sizeResult);
			}
			if(e.getSource()== large) {
				sizeResult="Large 크기가 선택되었습니다.";
				text.setText(creamOption+syrupOption+sizeResult);
			}
		}
	}
	
	private class CheckBoxListener implements ItemListener{
		
		public void itemStateChanged(ItemEvent e) {
			Object source = e.getItemSelectable();
			if(source == cream) {
				if(e.getStateChange() == ItemEvent.DESELECTED) {
					creamOption="";
					text.setText(creamOption+syrupOption+sizeResult);
				}else {
					creamOption = "휘핑+";
					text.setText(creamOption+syrupOption+sizeResult);
				}
			}
			if(source == syrup) {
				if(e.getStateChange() == ItemEvent.DESELECTED) {
					syrupOption="";
					text.setText(creamOption+syrupOption+sizeResult);
				}else {
					syrupOption = "크림+";
					text.setText(creamOption+syrupOption+sizeResult);
				}
			}
		}
	
	}
}
