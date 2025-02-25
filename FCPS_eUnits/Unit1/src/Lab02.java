import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02{  
   /**
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/maze.map");
      Athlete hasa = new Athlete();
      
      hasa.putAndMove();
      
      hasa.turnRight();
      
      hasa.putAndMove();
      
      hasa.turnRight();
      
      hasa.putAndMove();
      
      hasa.turnLeft();
      
      hasa.putAndMove();
      
      hasa.turnLeft();
      
      hasa.putAndMove();
      
      hasa.turnRight();
      
      hasa.putAndMove();
      hasa.putAndMove();
      
      hasa.turnRight();
      
      hasa.putAndMove();
      
      hasa.turnLeft();
      
      hasa.putAndMove();
      
      hasa.turnLeft();
      
      hasa.putAndMove();
      hasa.putAndMove();
      hasa.putAndMove();
      hasa.putAndMove();
      
      hasa.turnRight();
      
      hasa.putAndMove();
      hasa.putAndMove();
   }
}