package Chap11.JPanel;

import java.awt.*;
import javax.swing.*;

public class PaintJPanelEx extends JFrame {

  public PaintJPanelEx() {
    this.setTitle("JPanel의 paintComponent() 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setContentPane(new MyPanel());

    this.setSize(250, 200);
    this.setVisible(true);
  }

  class MyPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);

      g.setColor(Color.BLUE);
      g.drawRect(10, 10, 50, 50);
      g.drawRect(50, 50, 50, 50);

      g.setColor(Color.MAGENTA);
      g.drawRect(90, 90, 50, 50);
    }
  }

  public static void main(String[] args) {
    new PaintJPanelEx();
  }
}
