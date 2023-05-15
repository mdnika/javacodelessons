package homework42;

import java.util.Objects;

// Создайте класс Book (книга),
// в конструктор которого передавайте автора, название книги и количество страниц.
// Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
// а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").
public class Book implements Comparable<Book> {

  String author;
  String nameBook;
  int pageNumber;
  private Book obj;

  public Book(String author, String nameBook, int pageNumber) {
    this.author = author;
    this.nameBook = nameBook;
    this.pageNumber = pageNumber;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getNameBook() {
    return nameBook;
  }

  public void setNameBook(String nameBook) {
    this.nameBook = nameBook;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }

  @Override
  public String toString() {
    return "==== Book ====\n" +
        "Author: " + author + "\n" +
        "Book name: '" + nameBook + "'" + "\n" +
        "Number of pages: " + " (" + pageNumber + " pages)";
  }

  @Override
  public int compareTo(Book o) {
    return author.compareTo(o.author);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book other)) {
      return false;
    }
    return author.equals(other.author)
        && nameBook.equals(other.nameBook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, nameBook, pageNumber);
  }
}
