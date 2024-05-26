package Chap10.JMenu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuEx extends JFrame {

	private JLabel imgLabel = new JLabel();

	public MenuEx() {
		this.setTitle("Menu에 Action 리스너 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);

		this.setSize(640, 426);
		this.setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		JMenu screenMenu = new JMenu("Screen");

		MenuActionListener listener = new MenuActionListener();
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);

			screenMenu.add(menuItem[i]);
		}

		mb.add(screenMenu);
		setJMenuBar(mb);
	}

	class MenuActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
				case "Load":
					if (imgLabel.getIcon() != null) {
						return;
					}
					imgLabel.setIcon(new ImageIcon("images/bg.jpg"));
					break;

				case "Hide":
					imgLabel.setVisible(false);
					break;

				case "ReShow":
					imgLabel.setVisible(true);
					break;

				case "Exit":
					System.exit(0);
					break;
			}
		}
	}

	public static void main(String[] args) {
		new MenuEx();
	}
}