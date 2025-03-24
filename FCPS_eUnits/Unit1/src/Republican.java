import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
    public class Republican extends MazeEscaper
   {
       public void walkDownCurrentSegment()
      {
         while(!nextToABeeper() && !rightIsClear() && frontIsClear())
         {
            move();
         }
      }
      public void turnToTheNextSegment()
      {
         if(rightIsClear())
         {
            turnRight();
            move();
         }
         else if(!rightIsClear() && !frontIsClear())
         {
            turnLeft();
         }
      }
   }