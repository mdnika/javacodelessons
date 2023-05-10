package hw39;
// Создайте класс "Многоквартирный дом" - наследник класса "Дом".
// При создании многоквартирного дома дополнительно принимайте в конструкторе целое число - количество подъездов.
// В методе toString() выводите в удобном виде всю известную информацию о доме.
public class Apartmenthouse extends House{
  private int entrancesNumber;
public Apartmenthouse(String address,int entrancesNumber){
  super(address);
  this.entrancesNumber = entrancesNumber;
}
public int getEntrancesNumber(){
  return entrancesNumber;
}
  @Override // перезаписали Object.toString()
  public String toString() {
    return String.format("The apartments house with %s entrances, has the address: %s",
        entrancesNumber, getAddress());
  }
}
