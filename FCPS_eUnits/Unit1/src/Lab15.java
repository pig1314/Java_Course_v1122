import edu.fcps.karel2.Display;
    public class Lab15
   {
       public static void main(String[] args)
      {
         Display.setSize(15,15);
         Display.setSpeed(10);
         Dancer weismuller = new squareDancer(2, 2, Display.EAST, Display.INFINITY);
         Dancer fraser = new backAndForthDancer(2, 5, Display.EAST, Display.INFINITY);
         Dancer spitz = new largeSquareDancer(6, 6, Display.EAST, Display.INFINITY);
         Dancer watts = new poopDancer(12, 12, Display.WEST, Display.INFINITY);
        
         Thread t1 = new Thread( weismuller );
         Thread t2 = new Thread( fraser );
         Thread t3 = new Thread( spitz );
         Thread t4 = new Thread( watts );
         
         t1.start();
         t2.start();
         t3.start();
         t4.start();

      }
   }