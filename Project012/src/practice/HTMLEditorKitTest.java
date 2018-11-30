package practice;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class HTMLEditorKitTest {

	public HTMLEditorKitTest() {
		JFrame frame = new JFrame();
		frame.setTitle("HTML Viewer");
		
		JEditorPane pane = new JEditorPane();
		pane.setContentType("text/html");
		pane.setEditable(false);
		String data = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<title>Page Title</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h1>201802054 김도현</h1>\r\n" + 
				"<p>나의 첫 html 페이지</p>\r\n" + 
				"</body>\r\n" + 
				"</html>";
		pane.setText(data);
		frame.add(new JScrollPane(pane));
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new HTMLEditorKitTest();
	}
}
