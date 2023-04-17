package facade;

/**
 * This class represents new speakers.
 * It implements the Speaker interface.
 */
public class NewSpeaker implements Speaker{
  public NewSpeaker(){}

  @Override public void on() {
    System.out.println( "New Speaker is on");
  }

  @Override public void off() {
    System.out.println("New Speaker is off");
  }
}
