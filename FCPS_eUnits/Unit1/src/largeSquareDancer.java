import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class largeSquareDancer extends Dancer
   {
      public largeSquareDancer(int x, int y, int dir, int beep)
      {
         super(x, y, dir, beep);
      }
       public largeSquareDancer()
      {
         super(1, 1, Display.EAST, 0);
      }
      public void danceStep()
      {
         for(int i = 0;i < 4;i++)
         {
            move();
            move();
            move();
            move();
            turnLeft();
         }
      }
   }