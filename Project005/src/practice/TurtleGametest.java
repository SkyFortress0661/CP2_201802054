package practice;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TurtleGametest extends JFrame {

	public TurtleGametest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		add(new MyPanel());
		this.setVisible(true);
	}

	private class MyPanel extends JPanel {
		BufferedImage img = null;
		int img_x = 100, img_y = 100;
		public MyPanel() {
			try {
				img = ImageIO.read(new File("./src/images/turtle2.png"));
			} catch (IOException p) {
				System.out.println("no image");
				System.exit(1);
			}
			addKeyListener(new KeyListener() {
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					if(e.getKeyCode()==KeyEvent.VK_UP) img_y -=10;
					else if(e.getKeyCode()==KeyEvent.VK_DOWN) img_y +=10;
					else if(e.getKeyCode()==KeyEvent.VK_LEFT) img_x -=10;
					else if(e.getKeyCode()==KeyEvent.VK_RIGHT) img_x +=10;
					repaint();
				}
			});
			this.requestFocus();
			setFocusable(true);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, img_x, img_y, null);
		}
	}

}
