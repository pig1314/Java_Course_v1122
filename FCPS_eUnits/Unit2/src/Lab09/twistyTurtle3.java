	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
    public class twistyTurtle3 extends Turtle
   {
      private int Blength;
      private int Elength;
      private int angle = 45;
      private int incre = 5;
      
      public twistyTurtle3()
      {
         super();
         Blength = 25;
         Elength = 150;
      }
      public twistyTurtle3(int b, int e)
      {
         Blength = b;
         Elength = e;
      }
      public twistyTurtle3(double x, double y, double h, int b, int e)
      {
         super(x, y, h);
         Blength = b;
         Elength = e;
      }
      public void drawShape()
      {
         int count = 0;
         for(int i = Blength;i < Elength; i += incre)
         {
            for(int j = 0; j < 4; j++)
            {
               forward(i);
               turnRight(90);
            }
            turnRight(angle);
         }
      }
   }