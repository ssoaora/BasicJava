package Chapter04;

import java.util.Scanner;

class Book {

  String title;
  String author;

  void show() {
    System.out.println(title + " " + author);
  }

  public Book() {
    this("", "");
    System.out.println("생성자 호출됨");
  }

  public Book(String title) {
    this(title, "unknown");
  }

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }
}

public class BookArray {

  public static void main(String[] args) {
    Book[] books = new Book[2];

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < books.length; i++) {
      System.out.print("Title >> ");
      String title = sc.nextLine();  // nextLine() 으로 한 줄(빈칸 포함)을 하나의 문자열로 읽음

      System.out.print("Author >> ");
      String author = sc.nextLine();

      books[i] = new Book(title, author);
    }

    for (int i = 0; i < books.length; i++) {
      System.out.printf("(%s, %s)\t", books[i].title, books[i].author);
    }


    Book littlePrince = new Book("Little_Prince", "Saint-Exupéry");
    Book chunHyang = new Book("춘향전");
    Book emptyBook = new Book();

    chunHyang.show();
  }

}
