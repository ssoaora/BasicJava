package Chap10.JCheckBox;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {

	private JCheckBox[] fruits = new JCheckBox[3];
	private String[] names = { "사과", "배", "체리" };

	private JLabel sumLabel;

	public CheckBoxItemEventEx() {
		this.setTitle("체크박스와 ItemEvent 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		cp.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));

		MyItemListener listener = new MyItemListener();
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);  // names[]의 문자열로 체크박스 생성
			fruits[i].setBorderPainted(true);  // 체크박스 테두리 설정
			cp.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}

		sumLabel = new JLabel("현재 0원 입니다.");
		cp.add(sumLabel);

		this.setSize(260, 200);
		this.setVisible(true);
	}

	private class MyItemListener implements ItemListener {
		private int sum = 0;

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getItem() == fruits[0]) {
					sum += 100;
				}
				else if (e.getItem() == fruits[1]) {
					sum += 500;
				}
				else {
					sum += 20000;
				}
			}
			else {
				if (e.getItem() == fruits[0]) {
					sum -= 100;
				}
				else if (e.getItem() == fruits[1]) {
					sum -= 500;
				}
				else {
					sum -= 20000;
				}
			}
			sumLabel.setText("현재 " + sum + "원 입니다.");
		}
	}

	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}