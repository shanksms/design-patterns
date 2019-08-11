package decorator;

public class Mocha extends CondimentDecorator {
  private Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
    this.description = "mocha";
  }

  @Override
  double cost() {
    return 0.01 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", mocha";
  }
}
