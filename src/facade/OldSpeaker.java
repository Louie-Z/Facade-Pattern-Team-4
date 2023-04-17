package facade;

/**
 * This class represents old speakers.
 * It implements the Speaker interface.
 */
public class OldSpeaker implements Speaker{
  public OldSpeaker(){}

  @Override
  public void on() {
    System.out.println("Old speaker is on. ");
  }

  @Override
  public void off() {
    System.out.println("Old speaker is off. ");
  }
}
