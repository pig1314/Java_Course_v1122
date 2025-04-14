   import javax.swing.*;
   import edu.fcps.Bucket;
   public class Driver04b
   {  
      public static void main(String args[])
      {
      JFrame frame = new JFrame("Buckets");
      frame.setSize(600, 400);
      frame.setLocation(100, 100);   
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      Bucket.setSpeed(5);
      Bucket.useTotal(true);
      Bucket five = new Bucket(5);
      Bucket four = new Bucket(4);
      Bucket three = new Bucket(3);
      //  implement the algorithm here
      three.fill();//0 0 3 = 3
      three.pourInto(five);
      three.fill();//3 0 3 = 6
      four.fill();//3 4 3 = 10
      three.pourInto(five);//5 4 1
      five.spill();//0 4 1 = 5
      four.spill();//0 0 1 = 1
      four.fill();// 0 4 1
      three.pourInto(five);//1 4 0
      three.fill();//1 4 3 = 8
      three.pourInto(five);//4 4 0
      three.fill();//4 4 3 = 11
      five.fill();//5 4 3 = 12
      three.spill();//5 4 0 = 9
      five.pourInto(three);//2 4 3
      four.spill();//2 0 3
      three.spill();//2 0 0 = 2
      five.spill();//0 0 0
      three.fill();//0 0 3
      four.fill();//0 4 3 = 7
      three.spill();//0 4 0 = 4
      }
   }
