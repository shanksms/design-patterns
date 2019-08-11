package decorator;

public abstract class Beverage {

  public String description = "unknown beverage";
  public String getDescription() {
    return this.description;
  }
  abstract double cost();


}
