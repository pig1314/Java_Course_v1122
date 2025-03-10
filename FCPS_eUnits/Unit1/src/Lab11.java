import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab11
{
   public static void main(String[] args)
   {
      Display.openDefaultWorld();
      Display.setSize(36, 32);
      Display.setSpeed(10);
   
      new One(1, 30).display();
      new Two(8, 30).display();
      new Three(15, 30).display();
      new Four(22, 30).display();
      new Five(29, 30).display();
      new Six(1, 19).display();
      new Seven(8, 19).display();
      new Eight(15, 19).display();
      new Nine(22, 19).display();
      new Zero(29, 19).display();
   }
}