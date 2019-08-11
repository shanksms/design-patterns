package command;

/**
 * This is class is similar to Thread Pool Executor.
 * Thread pool executor will read off a queue of Runnables and will call run method on them in
 * separate threads.
 */
public class SimpleRemoteControl {
  Command slot;
  public SimpleRemoteControl() {}
  public void setCommand(Command command) {
    slot = command;
  }
  public void buttonWasPressed() {
    slot.execute();
  }
}
