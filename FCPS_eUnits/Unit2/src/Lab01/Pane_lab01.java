import javax.swing.*;
import java.awt.*;

public class Pane_lab01 extends JPanel
{
   public void paintComponent(Graphics g)
   {
      int xPoints_roof[] = {75, 175, 275};
      int yPoints_roof[] = {200, 150, 200};
      
      g.setColor(Color.LIGHT_GRAY);
      g.setFont(new Font("Serif", Font.PLAIN, 20));
      g.setColor(Color.RED);
      g.drawString("Welcome Home", 40, 40);
      g.setColor(new Color(255, 157, 0));
      g.fillOval(300, 75, 50, 50);
      g.setColor(new Color(94, 64, 38));
      g.drawPolygon(xPoints_roof, yPoints_roof, 3);
      g.setColor(Color.RED);
      g.drawRect(100, 200, 150, 150);
      g.setColor(new Color(94, 64, 38));
      g.fillRect(150, 275, 50, 75);
      g.setColor(Color.BLACK);
      g.drawLine(0, 350, 400, 350);
   }
}