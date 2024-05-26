package Chap11.Graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsDrawImageEx1 extends JFrame {
  public GraphicsDrawImageEx1() {
    this.setTitle("원본 크기로 원하는 위치에 이미지 그리기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setContentPane(new MyPanel());

    this.setSize(300, 400);
    this.setVisible(true);
  }

  private class MyPanel extends JPanel {
    private ImageIcon icon = new ImageIcon("images/rose.jpg");
    private Image img = icon.getImage();

    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);

      // 이미지를 패널의 (20, 20)에 원래의 크기로 그린다.
      g.drawImage(img, 20, 20, this);
    }
  }

  public static void main(String[] args) {
    new GraphicsDrawImageEx1();
  }
}
