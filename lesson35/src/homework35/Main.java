package homework35;

public class Main {

  public static void main(String[] args) {
   Food food = new Food("Multivitamin Spring Salad");
   food.infoFood();

   Drink drink = new Drink("Mineral Water");
    System.out.println(drink.getName());
   drink.openSoda(true);
  }
}