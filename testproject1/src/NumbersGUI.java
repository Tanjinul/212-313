import javax.swing.*;
import java.awt.*;

public class NumbersGUI extends JFrame 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    
    public NumbersGUI() 
    {
        //Create and set up the window.
        JFrame frame = new JFrame();
        frame.setTitle("Project 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);//width, height);
        frame.setLocation(200,200);//x, y);
        frame.setLayout(new GridLayout(3,3));        
        
        TextArea Box1 = new TextArea();
        TextArea Box2 = new TextArea();
        TextArea Box3 = new TextArea();
        TextArea Box4 = new TextArea();
        TextArea Box5 = new TextArea();
        TextArea Box6 = new TextArea();
        TextArea Box7 = new TextArea();
        TextArea Box8 = new TextArea();
        TextArea Box9 = new TextArea();
        
        frame.add(Box1);
        frame.add(Box2);
        frame.add(Box3);
        frame.add(Box4);
        frame.add(Box5);
        frame.add(Box6);
        frame.add(Box7);
        frame.add(Box8);
        frame.add(Box9);
        
        printt(Box1,Box2,Box3,Box4,Box5,Box6,Box7,Box8,Box9);
        //Display the window.
        frame.pack();
        frame.setVisible(true);
                
    }
    
    private static void printt(TextArea B1, TextArea B2, TextArea B3, TextArea B4, TextArea B5, TextArea B6, TextArea B7, TextArea B8, TextArea B9)
    {
        for(int i=1; i<=100; i++)
        {
            if(i%2==0)
            {
                B1.append(i+"\n");
            }
            
            if(i%3==0)
            {
                B2.append(" "+i+"\n"); 
            }
             
            if(i%4==0)
            {
                B3.append(" "+i+"\n");   
            }
            
            if(i%5==0)
            {
                B4.append(" "+i+"\n");
            }
            
            if(i%6==0)
            {
                B5.append(" "+i+"\n");
            }
            
            if(i%7==0)
            {
                B6.append(" "+i+"\n");
            }
            
            if(i%8==0)
            {
                B7.append(" "+i+"\n");
            }
            
            if(i%9==0)
            {
                B8.append(" "+i+"\n");
            }

            if(i%10==0)
            {
                B9.append(" "+i+"\n");
            }
        }
    }
   
}