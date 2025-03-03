import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab03 {

	/**
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/mountain.map");
		Climber tenzing = new Climber(8);
       
      tenzing.turnRight();
      tenzing.move();
      
      tenzing.climbUpRight();
      tenzing.climbUpRight();
      tenzing.climbUpRight();
      
      tenzing.climbDownRight();
      tenzing.climbDownRight();
      tenzing.pickBeeper();
      
      tenzing.turnAround();
      tenzing.climbUpLeft();
      tenzing.climbUpLeft();
      
      tenzing.climbDownLeft();
      tenzing.climbDownLeft();
      tenzing.climbDownLeft();
	}
}
