   //Name:    Date:
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class ProjectPanel extends JPanel
   {
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private static final ImageIcon THOMAS = new ImageIcon("tj.jpg");
      private BufferedImage myImage;
      private Graphics2D myBuffer;
      private int xPos;
      private Timer t;
      private Timer revealer; 
		//constructor   
      public ProjectPanel()
      {
         xPos = 50;
         myImage =  new BufferedImage(700, 500, BufferedImage.TYPE_INT_RGB);
         myBuffer = (Graphics2D)myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.setFont(new Font ("serif", Font.PLAIN, 20));
         myBuffer.setStroke(new BasicStroke(10.0f));
         myBuffer.fillRect(0, 0, 700, 500);
        
         t = new Timer(100, new Listener1());
         revealer = new Timer(3000, new Listener2());
         t.start();
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       private class Listener1 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0, 0, 700, 500);
            myBuffer.drawImage(THOMAS.getImage(), xPos, 40, 100, 80, null);
            myBuffer.setColor(Color.ORANGE);
            myBuffer.fillRect(xPos + 50, 120, 10, 150);
            myBuffer.drawLine(xPos + 55, 270, xPos + 165, 350);
            myBuffer.drawLine(xPos + 55, 270, xPos - 60, 350);
            myBuffer.drawLine(xPos + 55, 200, xPos + 145, 150);
            myBuffer.drawLine(xPos + 55, 200, xPos - 40, 150);
            myBuffer.setColor(Color.BLACK);
            myBuffer.fillRect(0, 350, 700, 150);
            Arrived(xPos);
            repaint();
         }
      }   
      
      private class Listener2 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            myBuffer.setColor(Color.BLACK);
            myBuffer.drawOval(250, 250, 200, 80);
            myBuffer.setColor(Color.BLUE);
            myBuffer.drawString("The space bar.", 300, 300);
            
            repaint();
         }
      }  
      
      private void Arrived(int x)
      {
         if (x == 120)
         {
            myBuffer.setStroke(new BasicStroke(5.0f));
            myBuffer.setColor(Color.BLACK);
            myBuffer.drawOval(250, 80, 450, 80);
            myBuffer.setColor(Color.BLUE);
            myBuffer.drawString("What is an astronaut’s favorite part on a computer?", 270, 120);
            
            revealer.start();
            t.stop();
         }
         else
         {
            xPos = xPos + 10;
         }
      }
   }