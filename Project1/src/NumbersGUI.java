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
        setTitle("Project 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(100,100);//width, height);
        setLocation(200,200);//x, y);
        setLayout(new GridLayout(3,3)); // getting the 3x3 grid       
        
        TextArea Box1 = new TextArea(); //declaring text areas
        TextArea Box2 = new TextArea();
        TextArea Box3 = new TextArea();
        TextArea Box4 = new TextArea();
        TextArea Box5 = new TextArea();
        TextArea Box6 = new TextArea();
        TextArea Box7 = new TextArea();
        TextArea Box8 = new TextArea();
        TextArea Box9 = new TextArea();
        
        
        add(Box1);
        add(Box2);
        add(Box3);
        add(Box4);
        add(Box5);
        add(Box6);
        add(Box7);
        add(Box8);
        add(Box9);
        
        Box1.setEditable(false);
        Box2.setEditable(false);
        Box3.setEditable(false);
        Box4.setEditable(false);
        Box5.setEditable(false);
        Box6.setEditable(false);
        Box7.setEditable(false);
        Box8.setEditable(false);
        Box9.setEditable(false);
        
        for(int i=1; i<=100; i++) //append is used to get the numbers inside the textareas
        {
            if(i%2==0)
            {
                Box1.append(i+"\n");
            }
            
            if(i%3==0)
            {
                Box2.append(" "+i+"\n"); 
            }
             
            if(i%4==0)
            {
                Box3.append(" "+i+"\n");   
            }
            
            if(i%5==0)
            {
                Box4.append(" "+i+"\n");
            }
            
            if(i%6==0)
            {
                Box5.append(" "+i+"\n");
            }
            
            if(i%7==0)
            {
                Box6.append(" "+i+"\n");
            }
            
            if(i%8==0)
            {
                Box7.append(" "+i+"\n");
            }
            
            if(i%9==0)
            {
                Box8.append(" "+i+"\n");
            }
            
            if(i%10==0)
            {
                Box9.append(" "+i+"\n");
            }
        }
                
        //Display the window.
        pack();
        setVisible(true);
        
    }
   
}