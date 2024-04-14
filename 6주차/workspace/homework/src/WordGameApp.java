import java.util.Scanner;

class Player {
  private String name;

  Player(String name) {
    this.name = name;
  }

  String getUserName() {
    return name;
  }

  String getWordFromUser() {
    Scanner sc = new Scanner(System.in);
    System.out.printf("%s >> ", name);
    return sc.next();
  }
}

public class WordGameApp {

  private static final String START_WORD = "아버지";

  static void run() {
    Scanner sc = new Scanner(System.in);
    System.out.print("게임에 참가하는 인원은 몇 명 입니까 >> ");
    int playerNum = sc.nextInt();

    Player[] players = new Player[playerNum];
    for (int i = 0; i < players.length; i++) {
      System.out.print("참가자의 이름을 입력하세요 >> ");
      String name = sc.next();
      players[i] = new Player(name);
    }

    System.out.println("시작하는 단어는 " + START_WORD + "입니다.");

    String word = START_WORD;
    int currentPlayerIndex = 0;

    while (true) {
      String nextWord = players[currentPlayerIndex].getWordFromUser();

      if (!checkSuccess(word, nextWord)) {
        System.out.printf("%s이(가) 졌습니다.\n", players[currentPlayerIndex].getUserName());
        break;
      }

      word = nextWord;
      currentPlayerIndex = (currentPlayerIndex + 1) % playerNum;
    }
  }

  private static boolean checkSuccess(String prevWord, String nextWord) {
    char lastChar = prevWord.charAt(prevWord.length() - 1);
    char firstChar = nextWord.charAt(0);
    return lastChar == firstChar;
  }

  public static void main(String[] args) {
    run();
  }

}
