package facade;

public class Main {
  public static void main(String[] args) {
    FacadeController living_room = new FacadeController();

    System.out.println("Sleep mode:\n");
    living_room.sleep();

    System.out.println("Work mode:\n");
    living_room.work();

    System.out.println("Movie mode:\n");
    living_room.movie();
  }
}
