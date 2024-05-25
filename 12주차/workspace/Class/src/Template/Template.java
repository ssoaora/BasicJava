package Template;

import java.awt.*;
import javax.swing.*;

public class Template extends JFrame {
	
	public Template() {
		this.setTitle("예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		this.setSize(260, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Template();
	}
}