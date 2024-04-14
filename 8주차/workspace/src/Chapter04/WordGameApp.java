package Chapter04;

import java.util.Scanner;

class Player {
  private String name;
  public static String word = "아버지";

  void getUserName() {
    Scanner sc = new Scanner(System.in);
    System.out.print("참가자의 이름을 입력하세요 >> ");
    name = sc.next();
  }

  String getWordFromUser() {
    Scanner sc = new Scanner(System.in);
    System.out.printf("%s >> ", name);
    return sc.next();
  }

  void checkSuccess(Player player) {
    int lastIndex = word.length() - 1;
    char lastChar = word.charAt(lastIndex);

    String userWord = player.getWordFromUser();
    char firstChar = userWord.charAt(0);

    if (lastChar == firstChar) {
      word = userWord;
      WordGameApp.counter++;
    }
    else {
      System.out.printf("%s이(가) 졌습니다.\n", player.name);
      WordGameApp.counter = -1;  // 게임 종료
    }
  }
}

public class WordGameApp {

  static int counter = 0;

  static void run() {
    Scanner sc = new Scanner(System.in);
    System.out.print("게임에 참가하는 인원은 몇 명 입니까 >> ");
    int playerNum = sc.nextInt();

    Player[] players = new Player[playerNum];
    for (int i = 0; i < players.length; i++) {
      players[i] = new Player();
      players[i].getUserName();

      /*
      for (int j = 0; j <= i; j++) {
        if (players[i] == players[j]) {
          System.out.println("이름이 중복됩니다.");
          players[i].getUserName();
        }
      }
      */
    }

    while (counter != -1) {
      System.out.printf("시작하는 단어는 %s입니다.\n", Player.word);

      for (int i = 0; i < players.length; i++) {
        players[i].checkSuccess(players[i]);
        if (counter == -1)
          break;
      }
    }
  }

  public static void main(String[] args) {
    WordGameApp.run();
  }

}
