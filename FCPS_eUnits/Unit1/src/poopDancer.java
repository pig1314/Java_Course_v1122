import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class poopDancer extends Dancer
   {
      public poopDancer(int x, int y, int dir, int beep)
      {
         super(x, y, dir, beep);
      }
       public poopDancer()
      {
         super(1, 1, Display.EAST, 0);
      }
      public void danceStep()
      {
         for(int i = 0;i < 4; i++)
         {
         move();
         putBeeper();
         move();
         turnRight();
         }
         for(int i = 0;i < 4; i++)
         {
         move();
         pickBeeper();
         move();
         turnRight();
         }

      }
   }