package Chap08.BasicSwing;

// Step 1
import java.awt.*;  // *은 모든 클래스만 불러옴 (패키지는 X)
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Step 2
public class MyFrame extends JFrame {

  // Step 4
  public MyFrame() {
    this.setTitle("My First Frame");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // X 버튼 누르면 프로그램 종료

    Container cp = this.getContentPane();
    cp.setLayout(new FlowLayout()); // FlowLayout: 기본 크기로 집어넣되, 가운데 첫 줄부터 순서대로 배치
    cp.setBackground(Color.ORANGE);
    cp.add(new JButton("OK"));  // 크기를 지정하지 않으면 컨테이너 크기에 맞게 버튼 크기가 조정됨
    cp.add(new JButton("Cancel"));
    cp.add(new JButton("Ignore"));

    this.setSize(400, 300);
    this.setVisible(true);  // 화면에 나타남
  }

  public static void main(String[] args) {
    // Step 3
    new MyFrame();  // 생성자 실행
  }

}
