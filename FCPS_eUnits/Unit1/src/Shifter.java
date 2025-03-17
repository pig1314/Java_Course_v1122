import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      }
   	
      public void workCorner()
      {
         pickBeeper();
      }
      public void moveOneBlock()
      {
         move();
      }
      public void turnToTheRight()
      {
         turnLeft();
         turnLeft();
         turnLeft();
      }
      public void turnToTheNorth()
      {
         while(!facingNorth())
         {
            turnLeft();
         }
      }
      public void run()
      {
         while(nextToABeeper())
         {
            workCorner();
            myBeepers++;
         }
         moveOneBlock();
         for(int i = 0; i < 6; i++)
         {
            while(nextToABeeper())
               {
                  workCorner();
               }
            for(int j = myBeepers; j != 0; j--)
            {
               putBeeper();
            }
            myBeepers = getBeepers();
            moveOneBlock();
         }
      }
   }