import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class backAndForthDancer extends Dancer
   {
      public backAndForthDancer(int x, int y, int dir, int beep)
      {
         super(x, y, dir, beep);
      }
       public backAndForthDancer()
      {
         super(1, 1, Display.EAST, 0);
      }
      public void danceStep()
      {
         move();
         move();
         move();
         turnAround();
         move();
         move();
         move();
         turnAround();
      }
   }