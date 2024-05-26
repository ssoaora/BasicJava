package Chap11.Graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class GraphicsDrawLineMouseEx extends JFrame {

	public GraphicsDrawLineMouseEx() {
		this.setTitle("마우스로 여러 개의 선 그리기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new MyPanel());

		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}

	private class MyPanel extends JPanel {
		private Vector<Point> vStart = new Vector<>();
		private Vector<Point> vEnd = new Vector<>();

		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint();
					vStart.add(startP);
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint();
					vEnd.add(endP);

					repaint();
				}
			});
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);

			for (int i = 0; i < vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);

				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
}