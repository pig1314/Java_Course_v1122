import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;


public class Lab09 {
	/**
	  * @param args
	  */
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String filename = JOptionPane.showInputDialog("What robot world?");
   
      Display.openWorld("../maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Athlete karel = new Athlete( 1, 1, Display.EAST, 0);
      int beepers = 0;
      int steps = 1;
      while(karel.nextToABeeper())
      {
         karel.pickBeeper();
      }
      karel.move();
      steps++;
      while(steps <= 8)
      {
         beepers = karel.getBeepers();
         while(karel.nextToABeeper())
         {
            karel.pickBeeper();
         }
         for(int i = 0; i < beepers; i++)
         {
            karel.putBeeper();
         }
         beepers = 0;
         steps ++;
         karel.move();
      }
   }
}
