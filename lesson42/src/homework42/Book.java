package homework42;

import java.util.Objects;

// Создайте класс Book (книга),
// в конструктор которого передавайте автора, название книги и количество страниц.
// Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
// а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").
public class Book implements Comparable<Book> {

  private final String author;
  private final String nameBook;
  private final int pageNumber;


  public Book(String author, String nameBook, int pageNumber) {
    this.author = author;
    this.nameBook = nameBook;
    this.pageNumber = pageNumber;
  }

  public String getAuthor() {
    return author;
  }

  // public void setAuthor(String author) {
  //   this.author = author;
  // }

  public String getNameBook() {
    return nameBook;
  }

  // public void setNameBook(String nameBook) {
  //   this.nameBook = nameBook;
  // }

  public int getPageNumber() {
    return pageNumber;
  }

//  public void setPageNumber(int pageNumber) {
//    this.pageNumber = pageNumber;
//  }

  //@Override
//  public String toString() {
//    return "Book{author='" + author + "', title='" + title + "', pages=" + pages + "}";
//  }
  @Override
  public String toString() {
    return "==== Book ====\n" +
        "Author: " + author + "\n" +
        "Book name: '" + nameBook + "'" + "\n" +
        "Number of pages: " + " (" + pageNumber + " pages)";
  }
// @Override
//  public int compareTo(Book o) {
//    String author1 = this.author.toLowerCase();
//    String author2 = o.author.toLowerCase();
//    if (!author1.equals(author2)) { // если авторы не одинаковы
//      return author1.compareTo(author2); // сравнение авторов в алфавитном порядке
//    }
//    // сюда попали, только если авторы одинаковы
//    // сравнение названий в алфавитном порядке
//    return title.toLowerCase().compareTo(o.title.toLowerCase());
//  }

  @Override
  public int compareTo(Book o) {
    if (!this.author.equals(o.author)) {
      return author.compareTo(o.author);
    }
    return nameBook.compareTo(o.nameBook);
  }

  //  @Override
//  public boolean equals(Object obj) {
//    if (!(obj instanceof Book book)) {
//      return false;
//    }
//    return author.equalsIgnoreCase(book.author) && title.equalsIgnoreCase(book.title);
//  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book other)) {
      return false;
    }
    return author.equals(other.author) && nameBook.equals(other.nameBook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, nameBook);
  }
}
