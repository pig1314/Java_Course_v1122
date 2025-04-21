	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
    public class PolygonTurtle extends Turtle
   {
      private double mySize;
      private int mySides;
      private double angle;
       public PolygonTurtle()
      {
         super();
         mySize = 50.0;
         mySides = 6;
      }
       public PolygonTurtle(double n, int s)
      {
         mySize = n;
         mySides = s;
      }
      public PolygonTurtle(double x, double y, double h, double n, int s)
      {
         super(x, y, h);
         mySize = n;
         mySides = s;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setSides(int s)
      {
         mySides = s;
      }
      public void drawShape()
      {
         angle = (mySides - 2) * 180 / mySides;
         for(int i = 0;i < mySides; i++)
         {
            System.out.println(angle);
            forward(mySize);
            turnLeft(180 - angle);
         }
      }
   }