package homework43;

import java.util.Comparator;

public class AuthorBookComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    String author1 = o1.getAuthor().toLowerCase();
    String author2 = o2.getAuthor().toLowerCase();
    return author1.compareTo(author2);
  }
}
