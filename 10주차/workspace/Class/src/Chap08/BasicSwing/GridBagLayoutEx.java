package Chap08.BasicSwing;

import java.awt.*;
import javax.swing.*;

public class GridBagLayoutEx extends JFrame {

  private Label lblReceiver = new Label("Receiver: ", Label.RIGHT);
  private Label lblContent = new Label("Content: ", Label.RIGHT);
  private Label lblFile = new Label("File: ", Label.RIGHT);
  private Button btnSearch = new Button("Search");
  private Button btnSend = new Button("Send");
  private TextField toPerson = new TextField(40);
  private TextField file = new TextField(30);
  private TextArea content = new TextArea(5, 40);

  private GridBagLayout gBag = new GridBagLayout();

  public GridBagLayoutEx() {
    this.setTitle("GridBagLayout Sample");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(gBag);

    this.insert(lblReceiver, 0, 0, 1, 1);
    this.insert(toPerson, 1, 0, 3, 1);
    this.insert(lblContent, 0, 1, 1, 1);
    this.insert(content, 1, 1, 3, 1);
    this.insert(lblFile, 0, 2, 1, 1);
    this.insert(file, 1, 2, 2, 1);
    this.insert(btnSearch, 3, 2, 1, 1);
    this.insert(btnSend, 0, 3, 4, 1);

    this.pack();
    this.setVisible(true);
    toPerson.requestFocus();
  }

  private void insert(Component cmpt, int x, int y, int w, int h) {
    GridBagConstraints gbc = new GridBagConstraints();

    gbc.fill = GridBagConstraints.BOTH;
    gbc.gridx = x;
    gbc.gridy = y;
    gbc.gridwidth = w;
    gbc.gridheight = h;
    this.gBag.setConstraints(cmpt, gbc);
    this.add(cmpt);
  }

  public static void main(String[] args) {
    new GridBagLayoutEx();
  }
}
