package decorator;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    this.description = "Houseblend";
  }

  @Override
  double cost() {
    return 0.2;
  }
}
