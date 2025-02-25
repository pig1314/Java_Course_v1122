import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab05 {
	/**
	  * @param args
	  */
   public static void runTheRace(Racer arg)
   {
      arg.move();
      arg.jumpRight();
      arg.shuttle(2,7);
      arg.shuttle(2,5);
      arg.shuttle(2,3);
      arg.turnAround();
      arg.sprint(6);
      arg.jumpLeft();
      arg.move();
      arg.put(15);
      arg.turnAround();
      arg.move();
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/shuttle.map");
      Display.setSpeed(100);
      Racer no1 = new Racer(1);
      Racer no2 = new Racer(4);
      Racer no3 = new Racer(7);
      
      runTheRace(no1);
      runTheRace(no2);
      runTheRace(no3);
      }

}
