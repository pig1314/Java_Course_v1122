import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class squareDancer extends Dancer
   {
      public squareDancer(int x, int y, int dir, int beep)
      {
         super(x, y, dir, beep);
      }
       public squareDancer()
      {
         super(1, 1, Display.EAST, 0);
      }
      public void danceStep()
      {
         for(int i = 0;i < 4; i++)
         {
         move();
         turnLeft();
         }
      }
   }