package Chap11.Graphics;

import java.awt.*;
import javax.swing.*;

public class GraphicsColorFontEx extends JFrame {

	public GraphicsColorFontEx() {
		this.setTitle("문자열, Color, Font 사용 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new MyPanel());

		this.setSize(300, 300);
		this.setVisible(true);
	}

	private class MyPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.BLUE);
			g.drawString("자바 정말 재밌다~~", 30, 30);

			g.setColor(new Color(255, 0, 0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How Much?", 30, 70);

			g.setColor(new Color(0x00ff00ff));
			for (int i = 1; i <= 4; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i * 10));
				g.drawString("This much!!", 30, 60 + i * 40);
			}
		}
	}

	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}
}