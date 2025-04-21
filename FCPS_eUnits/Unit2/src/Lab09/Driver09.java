	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver09
   {
      public static void main(String[] args)
      {
      
      	JFrame frame = new JFrame("Flower Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.WHITE);
         
         twistyTurtle lisa = new twistyTurtle(150, 150, 0, 10, 200);
         lisa.drawShape();
         
         twistyTurtle2 lili = new twistyTurtle2(200, 200, 180, 0, 100);
         lili.setColor(Color.YELLOW);
         lili.drawShape();
         
         twistyTurtle3 lima = new twistyTurtle3();
         lima.setColor(Color.GREEN);
         lima.drawShape();
      }
   }