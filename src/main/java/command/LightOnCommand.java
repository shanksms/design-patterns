package command;

//This is equivalent to a class implementing Runnable
public class LightOnCommand implements Command {
  //Runnable object will pass the call to an object which is composed just like following
  private Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}
