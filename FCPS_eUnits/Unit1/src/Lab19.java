import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab19
{
   public static void main(String arg[])
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("../maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);

      Dorothy dora = new Dorothy();
      
      dora.followPath();
      while(dora.findPath())
      {
         dora.followPath();
      }
   }
}