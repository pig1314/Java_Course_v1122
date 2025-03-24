import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
    public class Democrat extends MazeEscaper
   {
       public void walkDownCurrentSegment()
      {
         while(!nextToABeeper() && !leftIsClear() && frontIsClear())
         {
            move();
         }
      }
      public void turnToTheNextSegment()
      {
         if(leftIsClear())
         {
            turnLeft();
            move();
         }
         else if(!leftIsClear() && !frontIsClear())
         {
            turnRight();
         }
      }
   }