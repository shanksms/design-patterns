package State;

public class GumballMachine {
  private State hasQuarterState;
  private State noQuarterState;
  private State soldOutState;
  private State soldState;

  private State currentState;

  private int ballCount = 0;

  public GumballMachine(int ballCount) {
    hasQuarterState = new HasQuarter(this);
    noQuarterState = new NoQuarterState(this);
    soldOutState = new SoldOutState(this);
    soldState = new SoldState(this);
    this.ballCount = ballCount;
    if (this.ballCount > 0)
      this.currentState = this.noQuarterState;
  }
}
