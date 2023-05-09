package homework38;
//Создайте класс Book (книга),
// в конструктор которого передавайте автора и название книги.
//
//Переопределите сравнение книг:
// книги должны считаться одинаковыми, если совпадают и название, и автор.
public class Book {

    private String nameBook;
    private String nameAuthor;

    public Book(String nameBook, String nameAuthor) {
      this.nameBook = nameBook;
      this.nameAuthor = nameAuthor;
    }

    public String getNameBook() {
      return nameBook;
    }

  public String getNameAuthor() {
    return nameAuthor;
  }

    @Override
    public String toString() {
      return String.format("с названием: \"%s\" и автором: %s", nameBook, nameAuthor);
    }

    @Override
    public boolean equals(Object obj) {
     // if (this == obj) {
    //    return true;
     // }
      if (!(obj instanceof Book objBook)) {
        return false;
      }
      return nameBook.equals(objBook.getNameBook()) && nameAuthor.equals(objBook.getNameAuthor());
    }

    @Override
    public int hashCode() {
      return nameBook.hashCode() + nameAuthor.hashCode();
    }
  }