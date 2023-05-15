package homework42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Book> bookList = new ArrayList<>();
    bookList.add(new Book("Paulo Coelho", "Der Alchimist", 176));
    bookList.add(new Book("Antoine de Saint-Exupery", "Der kleine Prinz", 96));
    bookList.add(new Book("Taylor Jenkins Reid", "Maybe in Another Life", 352));
    bookList.add(new Book("Jeff Kinney", "Von Idioten umzinelt", 224));
    bookList.add(new Book("Dan Brown", "Wild Symphony", 52));
    bookList.add(new Book("Paulo Coelho", "Der Zahir", 352));
    bookList.add(new Book("Paulo Coelho", "Der Zahir", 350));

    for (Book book : bookList) {
      System.out.println(book);
    }

    System.out.println();
    Collections.sort(bookList);
    System.out.println(">>>>Result  Collections.sort(bookList)<<<<<<<");
    for (Book book : bookList) {
      System.out.println(book);
    }
  }
}
