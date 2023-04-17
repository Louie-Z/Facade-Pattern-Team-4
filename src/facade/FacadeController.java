package facade;

public class FacadeController {
  private Light light;
  private Curtain curtain;
  private Speaker speaker;
  private Monitor monitor;

  public FacadeController(){
    this.light = new Light();
    this.curtain = new Curtain();
    this.speaker = new Speaker();
    this.monitor = new Monitor();
  }

  public void sleep() {
    String result = "";
    result += curtain.close();
    result += speaker.off();
    result += monitor.off();
    result += light.off();
    System.out.println(result);
  }

  public void work() {
    String result = "";
    result += curtain.open();
    result += speaker.off();
    result += monitor.on();
    result += light.on();
    System.out.println(result);
  }

  public void movie() {
    String result = "";
    result += curtain.close();
    result += speaker.on();
    result += monitor.on();
    result += light.off();
    System.out.println(result);
  }


}
