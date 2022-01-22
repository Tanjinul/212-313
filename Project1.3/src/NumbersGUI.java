import javax.swing.*;
import java.awt.*;

public class NumbersGUI extends JFrame
{
   public NumbersGUI()
   {
       setLayout(new GridLayout(3,3));
       setSize(1000, 500);
       setLocation(200, 100);
       setTitle("Project1");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true); 
   }
   
   public static void printt(NumbersGUI Num)
   {
       Container myContentPane = Num.getContentPane();
       
       TextArea myTextArea1 = new TextArea();
       TextArea myTextArea2 = new TextArea();
       TextArea myTextArea3 = new TextArea();
       TextArea myTextArea4 = new TextArea();
       TextArea myTextArea5 = new TextArea();
       TextArea myTextArea6 = new TextArea();
       TextArea myTextArea7 = new TextArea();
       TextArea myTextArea8 = new TextArea();
       TextArea myTextArea9 = new TextArea();
       
       myContentPane.add(myTextArea1);
       myContentPane.add(myTextArea2);
       myContentPane.add(myTextArea3);
       myContentPane.add(myTextArea4);
       myContentPane.add(myTextArea5);
       myContentPane.add(myTextArea6);
       myContentPane.add(myTextArea7);
       myContentPane.add(myTextArea8);
       myContentPane.add(myTextArea9);
       
       for(int i=1; i<=100; i++)
       {
           if(i%2==0)
           {
               myTextArea1.append(i+"\n");
           }
           
           if(i%3==0)
           {
               myTextArea1.append(i+"\n"); 
           }
            
           if(i%4==0)
           {
               myTextArea1.append(i+"\n");   
           }
           
           if(i%5==0)
           {
               myTextArea1.append(i+"\n");
           }
           
           if(i%6==0)
           {
               myTextArea1.append(i+"\n");
           }
           
           if(i%7==0)
           {
               myTextArea1.append(i+"\n");
           }
           
           if(i%8==0)
           {
               myTextArea1.append(i+"\n");
           }
           
           if(i%9==0)
           {
               myTextArea1.append(i+"\n");
           }
           
           if(i%10==0)
           {
               myTextArea1.append(i+"\n");
           }
       }
       Num.setVisible(true);
   }
}
