package Chap10.JRadioButton;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {

	public RadioButtonEx() {
		this.setTitle("예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		ButtonGroup group = new ButtonGroup();

		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리");

		group.add(apple);
		group.add(pear);
		group.add(cherry);

		cp.add(apple);
		cp.add(pear);
		cp.add(cherry);

		this.setSize(260, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}
}