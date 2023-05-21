package homework43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import klasswork43Comparator.BookTitleComparator;

public class Main {

  public static void main(String[] args) {

    List<Book> bookList = new ArrayList<>();
    bookList.add(new Book("Paulo Coelho", "Der Alchimist", 176));
    bookList.add(new Book("Antoine de Saint-Exupery", "Der kleine Prinz", 96));
    bookList.add(new Book("Taylor Jenkins Reid", "Maybe in Another Life", 352));
    bookList.add(new Book("Jeff Kinney", "Von Idioten umzingelt", 224));
    bookList.add(new Book("Dan Brown", "Wild Symphony", 52));
    bookList.add(new Book("Paulo Coelho", "Der Zahir", 352));
    bookList.add(new Book("Paulo Coelho", "Der Zahir", 350));

    for (Book book : bookList) {
      System.out.println(book);
    }

    System.out.println();
    bookList.sort(new TitleBookComparator());
  //  bookList.sort(new AuthorBookComparator());
    System.out.println(">>>>Result  Collections.sort(bookList)<<<<<<<");
    for (Book book : bookList) {
      System.out.println(book);
    }

    List<Book> books = new ArrayList<>();
    books.add(new Book("Author 1", "Title 4", 10));
    books.add(new Book("Author 3", "Title 1", 200));
    books.add(new Book("Author 2", "Title 6", 900));
    books.add(new Book("Author 1", "Title 5", 450));
    books.add(new Book("Author 4", "Title 2", 900));
    books.add(new Book("Author 6", "Title 3", 80));
    System.out.println("\nЗадача №2");
    for (Book book : books) {
      System.out.println(book);
    }
    System.out.println();
    System.out.println(">>>>Result  Collections.sort(books)<<<<<<<");
    books.sort(new BookPagesComparator());
    for (Book book : books) {
      System.out.println(book);
    }
  }
}