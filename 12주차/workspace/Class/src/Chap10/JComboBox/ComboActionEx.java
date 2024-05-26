package Chap10.JComboBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboActionEx extends JFrame {

	private String[] fruits = {"apple", "banana", "mango"};
	private ImageIcon[] images = {
			new ImageIcon("images/icon1.png"),
			new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png")
	};
	private JLabel imgLabel = new JLabel(images[0]);

	public ComboActionEx() {
		this.setTitle("JComboBox 활용 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		JComboBox<String> combo = new JComboBox<>(fruits);
		cp.add(combo);
		cp.add(imgLabel);

		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>) e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});

		this.setSize(300, 250);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ComboActionEx();
	}
}