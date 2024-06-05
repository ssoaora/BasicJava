// 혼자 하는 369 게임 만들기

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example07 extends JFrame {
  public Example07() {
    this.setTitle("369 게임 혼자 하기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setContentPane(new GamePanel());

    this.setSize(310, 250);
    this.setLocation(500, 500);
    this.setVisible(true);
  }

  private class GamePanel extends JPanel {

    TimerThread th;
    JLabel card = new JLabel();
    JButton startBtn = new JButton("start");

    int n = 1;  // 시작 숫자
    boolean singleClicked = false;
    boolean doubleClicked = false;

    public GamePanel() {
      this.setLayout(null);

      card.setOpaque(true);
      card.setBackground(Color.ORANGE);
      card.setFont(new Font("Arial", Font.ITALIC, 30));
      card.setHorizontalAlignment(JLabel.CENTER);
      card.setText(Integer.toString(n));
      card.setSize(100, 50);
      card.setLocation(100, 50);
      card.addMouseListener(new MouseListener());
      this.add(card);

      startBtn.setLocation(100, 150);
      startBtn.setSize(100, 30);
      startBtn.addActionListener(new ButtonListener());
      this.add(startBtn);
    }

    synchronized void setSingleClicked(boolean b) {
      singleClicked = b;
    }

    synchronized void setDoubleClicked(boolean b) {
      doubleClicked = b;
    }

    class TimerThread extends Thread {

      @Override
      public void run() {
        while (true) {
          try {
            sleep(700);
            int d1 = n % 10;  // 1의 자리수
            int d2 = n / 10;  // 10의 자리수

            // 두 자리수 모두 3, 6, 9인 경우 판별
            if ((d1 == 3 || d1 == 6 || d1 == 9) && (d2 == 3 || d2 == 6 || d2 == 9)) {
              if (doubleClicked == true) {
                setDoubleClicked(false);
              }
              else {
                card.setText("Fail^^");
                break;
              }
            }
            else if (d1 == 3 || d1 == 6 || d1 == 9 || d2 == 3 || d2 == 6 || d2 == 9) {
              if (singleClicked == true) {
                setSingleClicked(false);
              }
              else {
                card.setText("Fail^");
                break;
              }
            }
            else {
              if (singleClicked == true || doubleClicked == true) {
                card.setText("Fail^");
                break;
              }
            }

            n++;
            if (n == 100) {
              card.setText("Win!!");
              break;
            }
            else {
              card.setText(Integer.toString(n));
            }
          }
          catch (InterruptedException e) {
            return;
          }
        }
        startBtn.setEnabled(true);
      }
    }

    class ButtonListener implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
        n = 1;
        card.setText(Integer.toString(n));
        singleClicked = false;
        doubleClicked = false;

        th = new TimerThread();
        th.start();

        JButton button = (JButton) e.getSource();
        button.setEnabled(false);
      }
    }

    class MouseListener extends MouseAdapter {

      @Override
      public void mousePressed(MouseEvent e) {
        // 더블클릭의 경우
        if (e.getClickCount() == 2) {
          setDoubleClicked(true);
          setSingleClicked(false);
        }
        // 싱글클릭의 경우
        else {
          setSingleClicked(true);
        }

        JLabel card = (JLabel) e.getSource();
        card.setBackground(Color.GREEN);
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        JLabel card = (JLabel) e.getSource();
        card.setBackground(Color.ORANGE);
      }
    }
  }

  public static void main(String[] args) {
    new Example07();
  }
}
