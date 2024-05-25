package Chap10.JTextArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TextAreaEx extends JFrame {

	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20);

	public TextAreaEx() {
		this.setTitle("TextArea 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		cp.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		cp.add(tf);
		cp.add(new JScrollPane(ta));

		// <Enter> 키 입력시 작동하는 리스너
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n");  // TextField의 문자열을 TextArea에 추가
				t.setText("");  // TextField의 문자열을 지움
			}
		});

		this.setSize(300, 250);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TextAreaEx();
	}
}