package Chap11.Graphics;

import java.awt.*;
import javax.swing.*;

public class GraphicsDrawImageEx2 extends JFrame {
  public GraphicsDrawImageEx2() {
    this.setTitle("패널의 크기에 맞추어 이미지 그리기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setContentPane(new MyPanel());

    this.setSize(200, 300);
    this.setVisible(true);
  }

  private class MyPanel extends JPanel {
    private ImageIcon icon = new ImageIcon("images/rose.jpg");
    private Image img = icon.getImage();

    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);

      // 이미지를 패널의 (20, 20)에 원래의 크기로 그린다.
      g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
  }

  public static void main(String[] args) {
    new GraphicsDrawImageEx2();
  }
}
