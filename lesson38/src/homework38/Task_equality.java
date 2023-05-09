package homework38;
import java.util.Scanner;

public class Task_equality {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите название первой книги: ");
    String firstBookName = scanner.nextLine(); // прочитать всю строку
    System.out.print("Введите название второй книги: ");
    String secondBookName = scanner.nextLine(); // прочитать всю строку
    if (firstBookName.equals(secondBookName)) {
      System.out.println("название книг совпадает");
    } else {
      System.out.println("название книг не совпадает");
    }
    System.out.print("Введите имя первого автора: ");
    String firstAuthorName = scanner.nextLine(); // прочитать всю строку
    System.out.print("Введите имя второго автора: ");
    String secondAuthorName = scanner.nextLine(); // прочитать всю строку
    if (firstAuthorName.equals(secondAuthorName)) {
      System.out.println("имена автора совпадают");
    } else {
      System.out.println("имена автора не совпадают");
    }

    Book first = new Book(firstBookName, firstAuthorName );
   Book second = new Book(secondBookName, secondAuthorName );

    System.out.println(" первая книга- " + first);
    System.out.println(" вторая книга- " + second);
    if (first.equals(second)) {
      System.out.println("название и автор совпадают - книги должны считаться одинаковыми");
    } else {
      System.out.println("название и автор не совпадают - книги должны считаться не одинаковыми");
    }

  }

}
