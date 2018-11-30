package task;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.swing.*;

public class ViewHTMLasJFrame extends JFrame {

	public ViewHTMLasJFrame() throws Exception {
		setTitle("HTML 보기");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(4, 4));

		JPanel CPanel = new JPanel();
		CPanel.setLayout(new GridLayout(2, 1));
		JEditorPane plain = new JEditorPane();
		JEditorPane html = new JEditorPane();
		plain.setContentType("text/plain");
		html.setContentType("text/html");
		plain.setEditable(false);
		html.setEditable(false);

		JPanel SPanel = new JPanel();
		JLabel label = new JLabel("URL : ");
		JTextField putURL = new JTextField();
		putURL.setColumns(30);
		JButton button = new JButton("HTML 가져오기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String line;
				String data = "";
				String url = putURL.getText();
				try {
					URL find = new URL(url);
					BufferedReader in = new BufferedReader(new InputStreamReader(find.openStream()));
					while ((line = in.readLine()) != null) {
						data += line;
						data += "\t\n";
					}
					plain.setText(data);
					html.setText(data);
					in.close();
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		CPanel.add(new JScrollPane(plain));
		CPanel.add(new JScrollPane(html));
		add(CPanel, BorderLayout.CENTER);
		SPanel.add(label);
		SPanel.add(putURL);
		SPanel.add(button);
		add(SPanel, BorderLayout.SOUTH);

		setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new ViewHTMLasJFrame();
	}
}
