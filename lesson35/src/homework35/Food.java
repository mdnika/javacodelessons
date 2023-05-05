package homework35;

public class Food {

  String name;

  public Food(String name){
  this.name=name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void infoFood() {
    System.out.println(name + " is the best choice to eat!!! ");
  }

}
