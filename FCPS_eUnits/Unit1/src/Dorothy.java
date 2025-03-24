import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Dorothy extends Athlete
{
   
   public Dorothy()
   {
      super(2, 2, Display.EAST, 0);
   }
   
   public boolean findPath()
   {  
      if(nextToABeeper())
      {
         turnLeft();
         move();
         if(nextToABeeper())
         {
            return true;
         }
         else
         {
            turnAround();
            move();
            move();
            if(nextToABeeper())
            {
               return true;
            }
            else
            {
               turnAround();
               move();
               turnLeft();
               return false;
            }
         }
      }
      else
      {
         turnAround();
         move();
         if (leftIsClear())
         {
         turnLeft();
         move();
         }
         else
         {
            turnRight();
            move();
         }
         if(nextToABeeper())
         {
            return true;
         }
         else
         {
            turnAround();
            move();
            move();
            if(nextToABeeper())
            {
               return true;
            }
            else
            {
               turnAround();
               move();
               turnLeft();
               return false;
            }
         }
      }
   }
   
   public void followPath(){
      while(nextToABeeper() && frontIsClear())
      {
         move();
      }
   }
}