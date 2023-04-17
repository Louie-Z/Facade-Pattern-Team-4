package facade;

public class FacadeBedroom {
  private final Light light;
  private final Curtain curtain;
  private final Speaker speaker;
  private final Monitor monitor;
  private String time;

  public FacadeBedroom(Light light, Curtain curtain, Speaker speaker, Monitor monitor){
    this.light = light;
    this.curtain = curtain;
    this.speaker = speaker;
    this.monitor = monitor;
    this.time = "";
  }

  public void currentTime(String time) {
    this.time = time;
    System.out.println("\nCurrent time is: " + time);
  }

//  public void sleep() {
//    curtain.close();
//    speaker.off();
//    monitor.off();
//    light.off();
//  }

  public void work() {
    if (time.equals("day")) {
      curtain.open();
      light.off();
    } else {
      curtain.close();
      light.on();
    }
    speaker.off();
    monitor.on();
  }

//  public void movie() {
//    curtain.close();
//    speaker.on();
//    monitor.on();
//    light.off();
//  }
}