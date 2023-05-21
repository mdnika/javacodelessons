package homework43;

import java.util.Objects;

// Используйте класс Book (книга) из предыдущего домашнего задания.
// Создайте компаратор, который позволит сортировать книги по названию,
// при одинаковых названиях - по автору (и там, и там - по алфавиту)
public class Book {

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

  public String getNameBook() {
    return nameBook;
  }

  public int getPageNumber() {
    return pageNumber;
  }

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
