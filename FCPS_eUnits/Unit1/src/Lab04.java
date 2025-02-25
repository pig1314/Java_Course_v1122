import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab04 {

	/**
	  * @param args
	  */
     
   public static void takeTheField(Athlete arg)
   {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/arena.map");
      
      Athlete one = new Athlete();
      Athlete two = new Athlete();
      Athlete thr = new Athlete();
      Athlete fou = new Athlete();
      Athlete fiv = new Athlete();
      Athlete six = new Athlete();
      Athlete coach = new Athlete(2, 7, Display.EAST, 1);
      
      //first 
      takeTheField(one);
      one.move();
      one.turnLeft();
      one.move();
      one.turnAround();
      
      //second
      takeTheField(two);
      two.move(); 
      two.move();
      two.turnRight();
      
      //third
      takeTheField(thr);
      thr.move(); 
      thr.move();
      thr.move();
      thr.turnRight();
      
      //fourth
      takeTheField(fou);
      fou.move(); 
      fou.move();
      fou.move();
      fou.move();
      fou.turnRight();
      
      //fifth
      takeTheField(fiv);
      fiv.move();
      fiv.move();
      fiv.move();
      fiv.turnLeft();
      fiv.move();
      fiv.move();
      fiv.turnAround();
      
      //sixth
      takeTheField(six);
      six.move();
      six.move();
      six.move();
      six.move();
      six.move();
      six.turnLeft();
      six.move();
      six.turnAround(); 
		}

}