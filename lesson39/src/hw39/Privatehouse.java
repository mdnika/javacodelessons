package hw39;
// Создайте класс "Частный дом" - наследник класса "Дом".
// В методе toString() выводите в удобном виде всю известную информацию о доме.
public class Privatehouse extends House {
  public Privatehouse(String address){
    super(address);
  }
  @Override // перезаписали Object.toString()
  public String toString() {
    return String.format("The private house, has the address: %s", getAddress());
  }
}
