import javax.swing.*;
import java.awt.*;

public class Pane_lab02 extends JPanel
{
   public void paintComponent(Graphics g)
   {
      int x = 140;
      int y = 70;
      int r = 10;
      
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect(140, 70, 120, 160);// 100, 140
      
      for(int i = 0;i < 10; i++)//vertical
      {
         if(i == 0 || i == 9)
         {
            for(int j = 0;j < 7; j++)//horizontal
            {
               g.fillOval(x - r, y - r, 2 * r, 2 * r);
               x = x + 2 * r;
            }
         }
         else
         {
            x = 140;
            y = 70 + 2 * i * r;
            g.fillOval(x - r, y - r, 2 * r, 2 * r);
            x = 260;
            g.fillOval(x - r, y - r, 2 * r, 2 * r);
            x = 140;
         }    
      }
      
      ImageIcon thomas = new ImageIcon("tj.jpg");
      g.drawImage(thomas.getImage(), 150, 80, 100, 140, null);
      
      g.setFont(new Font("Serif", Font.PLAIN, 30));
      g.setColor(Color.WHITE);
      g.drawString("Our Fearless Leader", 80, 300);
      
   }
}