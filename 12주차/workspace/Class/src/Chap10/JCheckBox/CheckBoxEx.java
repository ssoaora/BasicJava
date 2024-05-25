package Chap10.JCheckBox;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {

	public CheckBoxEx() {
		this.setTitle("예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리");

		cp.add(apple);
		cp.add(pear);
		cp.add(cherry);

		this.setSize(260, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}
}