package Chap10.JList;

import java.awt.*;
import javax.swing.*;

public class ListEx extends JFrame {

	private String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };
	private ImageIcon[] images = { new ImageIcon("images/icon1.png"), new ImageIcon("images/icon2.png"), new ImageIcon("images/icon3.png"), new ImageIcon("images/icon4.png") };

	public ListEx() {
		this.setTitle("예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		JList<String> strList = new JList<String>(fruits);
		cp.add(strList);

		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		cp.add(imageList);

		JList<String> scrollList = new JList<String>(fruits);
		cp.add(new JScrollPane(scrollList));

		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ListEx();
	}
}