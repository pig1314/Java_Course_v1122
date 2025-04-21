	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
    public class twistyTurtle extends Turtle
   {
      private int Blength;
      private int Elength;
      private int angle = 123;
      private int incre = 10;
      
      public twistyTurtle()
      {
         super();
         Blength = 10;
         Elength = 400;
      }
      public twistyTurtle(int b, int e)
      {
         Blength = b;
         Elength = e;
      }
      public twistyTurtle(double x, double y, double h, int b, int e)
      {
         super(x, y, h);
         Blength = b;
         Elength = e;
      }
      public void drawShape()
      {
         for(int i = Blength;i < Elength; i += incre)
         {
            forward(i);
            turnRight(angle);
         }
      }
   }