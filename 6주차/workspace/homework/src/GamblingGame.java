// Bonus

import java.util.Scanner;

class PlayerBonus {
  private String name;

  public PlayerBonus(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class GamblingGame {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    PlayerBonus[] players = new PlayerBonus[2];

    for (int i = 0; i < players.length; i++) {
      System.out.print("선수 이름 입력 >> ");
      players[i] = new PlayerBonus(sc.next());
    }

    int n = 0;

    while (true) {
      System.out.printf("%s씨, <Enter 외 아무키나 치세요>", players[n].getName());
      sc.next();

      int[] val = new int[3];
      for (int i = 0; i < val.length; i++) {
        val[i] = (int)(Math.random() * 3);
        System.out.print(val[i] + "\t");
      }
      System.out.println();

      if (val[0] == val[1] && val[1] == val[2]) {
        System.out.printf("%s이(가) 승리하였습니다.", players[n].getName());
        break;
      }
      n++;
      n = n % 2;
    }
  }
}
