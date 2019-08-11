package State;

public class GumballMachine {
  private State hasQuarterState;
  private State noQuarterState;
  private State soldOutState;
  private State soldState;

  public int getCount() {
    return count;
  }

  private State state;

  private int count = 0;

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getSoldState() {
    return soldState;
  }

  public GumballMachine(int count) {
    hasQuarterState = new HasQuarter(this);
    noQuarterState = new NoQuarterState(this);
    soldOutState = new SoldOutState(this);
    soldState = new SoldState(this);
    this.count = count;
    if (this.count > 0)
      this.state = this.noQuarterState;
  }

  public void insertQuarter() {
    state.insertQuarter();
  }
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  void setState(State state) {
    this.state = state;
  }
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }

}
