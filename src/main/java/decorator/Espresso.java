package decorator;

public class Espresso extends Beverage {

  public Espresso() {
    this.description = "Espresso";
  }

  @Override
  public double cost() {
    return 0.1;
  }
}
