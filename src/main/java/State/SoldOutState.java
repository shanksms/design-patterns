package State;

public class SoldOutState implements State{
  private GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("There are no gumballs. Can not accept a quarter");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("can not eject as you have not inserted a quarter");
  }

  @Override
  public void turnCrank() {
    System.out.println("can not turn the crank ");

  }

  @Override
  public void dispense() {
    System.out.println("can not dispense");

  }
}
