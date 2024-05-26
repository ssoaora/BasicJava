package Chap11.Graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsDrawShapeEx extends JFrame {

	JPanel[] panels = new JPanel[5];
	int currentPanelIndex = 0;

	public GraphicsDrawShapeEx() {
		this.setTitle("도형 그리기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panels[0] = new CirclePanel();
		panels[1] = new RectPanel();
		panels[2] = new RoundRectPanel();
		panels[3] = new ArcPanel();
		panels[4] = new PolygonPanel();

		setContentPane(panels[0]);

		this.setSize(260, 200);
		this.setVisible(true);

		this.addKeyListener(new MyKeyListener());

		this.setFocusable(true);
		this.requestFocusInWindow();
	}

	private class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyChar()) {
				case '\n':
					currentPanelIndex = (currentPanelIndex + 1) % panels.length; // 다음 패널로 전환
					setContentPane(panels[currentPanelIndex]); // 새 패널 설정
					getContentPane().addKeyListener(this); // 새 패널에 키 리스너 추가
					revalidate(); // 프레임 갱신
					break;

				case 'q':
					System.exit(0);
			}
		}
	}

	private class CirclePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.RED);
			g.drawOval(20, 20, 80, 80);
		}
	}

	private class RectPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.RED);
			g.drawRect(20, 20, 80, 80);
		}
	}

	private class RoundRectPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.RED);
			g.drawRoundRect(20, 20, 120, 80, 40, 60);
		}
	}

	private class ArcPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.RED);
			g.drawArc(20, 100, 80, 80, 90, 270);
		}
	}

	private class PolygonPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.RED);
			int[] x = {80, 40, 80, 120};
			int[] y = {40, 120, 200, 120};
			g.drawPolygon(x, y, 4);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawShapeEx();
	}
}