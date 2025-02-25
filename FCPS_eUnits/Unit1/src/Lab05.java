import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab05 {

	/**
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/shuttle.map");
      Display.setSpeed(100);
      Racer no1 = new Racer(1);
      Racer no2 = new Racer(4);
      Racer no3 = new Racer(7);
      
      no1.shuttle(2, 7);
      no1.shuttle(4, 5);
      no1.shuttle(6, 3);
      no1.move();
      
      no2.shuttle(2, 7);
      no2.shuttle(4, 5);
      no2.shuttle(6, 3);
      no2.move();
      
      no3.shuttle(2, 7);
      no3.shuttle(4, 5);
      no3.shuttle(6, 3);
      no3.move();
      }

}
