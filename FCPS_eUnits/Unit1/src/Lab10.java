import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;


public class Lab10 {
	/**
	  * @param args
	  */
     
   public static void followWallsRight(Athlete arg){
      while(!arg.nextToABeeper())
      {
         if(arg.rightIsClear())
         {
            arg.turnRight();
            arg.move();
         }
         else if(arg.frontIsClear())
         {
            arg.move();
         }
         else
         {
            arg.turnLeft();
         }
      }
   }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String filename = JOptionPane.showInputDialog("What robot world?");
   
      Display.openWorld("../maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      followWallsRight(new Athlete(1,1,Display.NORTH,Display.INFINITY));
      }
}
