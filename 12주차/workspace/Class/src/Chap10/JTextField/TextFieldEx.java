package Chap10.JTextField;

import java.awt.*;
import javax.swing.*;

public class TextFieldEx extends JFrame {

	public TextFieldEx() {
		this.setTitle("TextField 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		cp.add(new JLabel("이름   "));
		cp.add(new JTextField(20));
		cp.add(new JLabel("학과   "));
		cp.add(new JTextField("컴퓨터공학과", 20));
		cp.add(new JLabel("주소   "));
		cp.add(new JTextField("서울시 ...", 20));

		this.setSize(300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldEx();
	}
}