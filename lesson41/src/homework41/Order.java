package homework41;

import java.util.List;
import java.util.Scanner;

// Дополните класс homework41.Order из классной работы.
// Добавьте статический метод:
// public static int getTotalSum(List<homework41.Order> orders)
// Метод будет статическим (не имеет отношения к конкретному заказу),
// но частью класса homework41.Order (имеет непосредственное отношение к заказам как к общей идее).
public class Order {

  // заказ в интернет-магазине
  private final String id; // идентификатор заказа - строка с номером, датой и т.д.
  private final String content; // содержание заказа - как высказал клиент, в виде текста
  private final String client; // имя клиента
  private final String phone; // номер телефона клиента - лучше объединять такое в один класс `Client`
  private int price; // стоимость заказа

  public Order(String id, String content, String client, String phone, int price) {
    this.id = id;
    this.content = content;
    this.client = client;
    this.phone = phone;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "\n === Заказ ===\n" +
        "ID:             " + id + "\n" +
        "Содержимое:     " + content + "\n" +
        "Клиент:         " + client + "\n" +
        "Номер телефона: " + phone + "\n" +
        "Стоимость:      " + price + "\n";
  }

  // удваивание стоимости этого заказа - не статический метод
  public void doublePrice() {
    price *= 2;
  }

  // утраивание стоимости какого-то заказа - статический метод, а заказ передаётся в аргументе
  public static void triplePrice(Order order) {
    order.setPrice(order.getPrice() * 3);
  }

  // статический метод чтения заказа с клавиатуры - никакого заказа ещё нет, он не может быть
  // не статическим
  public static Order readOrder() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите ID заказа: ");
    String id = scanner.nextLine();
    System.out.print("Введите текст заказа: ");
    String content = scanner.nextLine();
    System.out.print("Введите имя заказчика: ");
    String client = scanner.nextLine();
    System.out.print("Введите номер телефона: ");
    String phone = scanner.nextLine();
    System.out.print("Введите стоимость: ");
    int price = scanner.nextInt();
    scanner.nextLine();

    // только в этот момент появится конкретный заказ
    return new Order(id, content, client, phone, price);
  }

  public static int getTotalSum(List<Order> orders) {
    int sum = 0;
    for (Order order : orders) {
      sum += order.getPrice();
    }
    return sum;
  }
}
