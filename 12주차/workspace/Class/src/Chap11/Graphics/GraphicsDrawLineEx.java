package Chap11.Graphics;

import java.awt.*;
import javax.swing.*;

public class GraphicsDrawLineEx extends JFrame {

	public GraphicsDrawLineEx() {
		this.setTitle("drawLine 사용 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new MyPanel());

		this.setSize(260, 200);
		this.setVisible(true);
	}

	private class MyPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}
}