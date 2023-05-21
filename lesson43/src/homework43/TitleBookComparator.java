package homework43;

import java.util.Comparator;
// Используйте класс Book (книга) из предыдущего домашнего задания.
// Создайте компаратор, который позволит сортировать книги по названию,
// при одинаковых названиях - по автору (и там, и там - по алфавиту)
public class TitleBookComparator implements Comparator<Book> {

  // Метод compare() в компараторе работает по той же логике, что и compareTo в самом классе,
  // но сравнивает не this и other, а `o1` и `o2`.
  // Отличие: не "естественная" сортировка, а "искусственная", заданная именно этим компаратором.
  // Компаратор выполняет роль инструмента для сравнения - например, аптечных весов
  @Override
  public int compare(Book o1, Book o2) {
    String title1 = o1.getNameBook().toLowerCase();
    String title2 = o2.getNameBook().toLowerCase();
    String author1 = o1.getAuthor().toLowerCase();
    String author2 = o2.getAuthor().toLowerCase();
    if (title1.equals(title2)) {
      return title1.compareTo(title2);
    }
    return author1.compareTo(author2);
  }
}
