package homework43;
import java.util.Comparator;
// Создайте компаратор,
// который позволит сортировать книги по убыванию количества страниц,
// а при совпадающем объёме - по названиям ("по возрастанию", по алфавиту).

public class BookPagesComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    int pages1 = o1.getPageNumber();
    int pages2 = o2.getPageNumber();
    if (pages1 != pages2) {
      return -(pages1- pages2);
    }
    return o1.getNameBook().toLowerCase().compareTo(o2.getNameBook().toLowerCase());
  }
}
