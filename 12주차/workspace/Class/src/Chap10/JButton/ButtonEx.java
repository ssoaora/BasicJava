package Chap10.JButton;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {

	public ButtonEx() {
		this.setTitle("예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		this.setSize(260, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}
}