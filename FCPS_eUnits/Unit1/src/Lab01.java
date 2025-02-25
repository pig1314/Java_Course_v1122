import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab01 {

	/**
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/school.map");
		Robot karel = new Robot();
      Robot Lisa = new Robot(4,5,3,0);
      
      karel.move();
      karel.move();
      
      karel.turnLeft();
      
      karel.move();
      
      karel.turnLeft();
      
      karel.move();
      karel.pickBeeper();
      
      karel.turnLeft();
      karel.turnLeft();
      
      karel.move();
      
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
      
      karel.move();
      
      karel.turnLeft();
      
      karel.move();
      karel.move();
      karel.move();
      
      karel.turnLeft();
      
      karel.move();
      karel.move();
      karel.move();
      
      karel.turnLeft();
      
      karel.move();
      karel.move();
      
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
      
      karel.move();
      
      karel.putBeeper();
      
      Lisa.pickBeeper();
      
      Lisa.move();
      
      Lisa.turnLeft();
      
      Lisa.move();
      Lisa.move();
      
      Lisa.turnLeft();
      
      Lisa.move();
      Lisa.move();
      
      Lisa.turnLeft();
      Lisa.turnLeft();
      Lisa.turnLeft();
      
      Lisa.move();
      Lisa.move();
      
      Lisa.turnLeft();
      
      Lisa.move();
      
      Lisa.turnLeft();
      
      Lisa.move();
      Lisa.move();
      
      Lisa.turnLeft();
      Lisa.turnLeft();
      Lisa.turnLeft();
      
      Lisa.move();
      Lisa.move();
      
      Lisa.turnLeft();
      
      Lisa.move();
      Lisa.move();
      
      Lisa.putBeeper();
      
      Lisa.turnLeft();
      Lisa.turnLeft();
      
      Lisa.move();
      }
}