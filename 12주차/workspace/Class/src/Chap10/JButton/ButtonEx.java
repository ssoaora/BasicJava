package Chap10.JButton;

import java.awt.*;
import javax.swing.*;

public class ButtonEx extends JFrame {

	public ButtonEx() {
		this.setTitle("예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		ImageIcon normalIcon = new ImageIcon("images/tree.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/earth.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/bear.jpg");

		JButton btn = new JButton("Test", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		cp.add(btn);

		this.setSize(500, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}
}