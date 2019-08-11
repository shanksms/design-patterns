package decorator;

public class Whip extends CondimentDecorator {

  private Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
    this.description = "whip";
  }

  @Override
  double cost() {
    return 0.01 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", whip";
  }
}
