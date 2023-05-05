package homework35;

public class Drink extends Food {

  boolean soda;

  public Drink(String name) {
    super(name);
  }

  public void openSoda(boolean soda){
    if(!soda){
      System.out.println("skr !!! " + " Your drink" + name + " does not contains soda!");
    }
    System.out.println(" psh !!! " + " Your drink " + name + " contains soda!");
  }
}







