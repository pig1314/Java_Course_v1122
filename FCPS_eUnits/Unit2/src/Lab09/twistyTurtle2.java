	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
    public class twistyTurtle2 extends Turtle
   {
      private int Blength;
      private int Elength;
      private int angle = 30;
      private int incre = 2;
      
      public twistyTurtle2()
      {
         super();
         Blength = 0;
         Elength = 150;
      }
      public twistyTurtle2(int b, int e)
      {
         Blength = b;
         Elength = e;
      }
      public twistyTurtle2(double x, double y, double h, int b, int e)
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