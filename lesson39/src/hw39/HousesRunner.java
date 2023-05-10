package hw39;
import hw39.House;
import hw39.Privatehouse;
import hw39.Apartmenthouse;
import java.util.ArrayList;
import java.util.List;
// В основном файле программы создайте список домов,
// в который поместите два частных дома и один многоквартирный.
// Выведите информацию о домах в списке с использованием цикла for-each.

public class HousesRunner {

  public static void main(String[] args) {
   House house1 = new Privatehouse("Home sweet Home Str. 78");
   House house2 = new Privatehouse("Lovely Street 12");
   House apartment = new Apartmenthouse("Heidelberg Str. 23", 7);

    List<House> houseList = new ArrayList<>();
    houseList.add(house1);
    houseList.add(house2);
    houseList.add(apartment);
    for (House house : houseList) {
      System.out.println(house);
    }
    System.out.println();
  }
}
