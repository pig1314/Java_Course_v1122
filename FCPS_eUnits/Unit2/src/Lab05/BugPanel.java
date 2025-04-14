    //Torbert, e-mail: smtorbert@fcps.edu	
	 //version 6.17.2003
	 //version 11.4.09  mlbillington@fcps.edu
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class BugPanel extends JPanel
   {
      private BufferedImage myImage;
      final int N = 400;
       public BugPanel()
      {
         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
         Bug no1 = new Bug(0, 0);
         Bug no2 = new Bug(400, 0);
         Bug no3 = new Bug(400, 400);
         Bug no4 = new Bug(0, 400);
         while(!no1.sameSpot(no2))
         {
            buffer.drawLine(no1.getX(), no1.getY(), no2.getX(), no2.getY());
            buffer.drawLine(no2.getX(), no2.getY(), no3.getX(), no3.getY());
            buffer.drawLine(no3.getX(), no3.getY(), no4.getX(), no4.getY());
            buffer.drawLine(no4.getX(), no4.getY(), no1.getX(), no1.getY());
            no1.walkTowards(no2, 0.1);
            no2.walkTowards(no3, 0.1);
            no3.walkTowards(no4, 0.1);
            no4.walkTowards(no1, 0.1);
         }
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }