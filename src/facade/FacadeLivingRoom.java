package facade;

public class FacadeLivingRoom {
  private final Light light;
  private final Curtain curtain;
  private final OldSpeaker speaker;
  private final Monitor monitor;

  public FacadeLivingRoom(){
    this.light = new Light();
    this.curtain = new Curtain();
    this.speaker = new OldSpeaker();
    this.monitor = new Monitor();
  }

  public void sleep() {
    curtain.close();
    speaker.off();
    monitor.off();
    light.off();
  }

  public void work() {
    curtain.open();
    speaker.off();
    monitor.on();
    light.on();
  }

  public void movie() {
    curtain.close();
    speaker.on();
    monitor.on();
    light.off();
  }
}