package homework41;

import java.util.ArrayList;
import java.util.List;

public class Main {

  // Метод должен возвращать общую сумму заказов из списка
  // (за образец можете взять метод MyMath.sum() из классной работы).

  public static void main(String[] args) {

    Order ord01 = new Order("01", "Banana", "Vasja", "+49 123456543", 30);
    Order ord02 = new Order("02", "Banana", "Vasja", "+49 123456543", 20);
    Order ord03 = new Order("03", "Banana", "Vasja", "+49 123456543", 50);

    List<Order> orders = new ArrayList<>();
    orders.add(ord01);
    orders.add(ord02);
    orders.add(ord03);
    System.out.println(" " + orders + " \n Total price = " + Order.getTotalSum(orders));
  }
}
