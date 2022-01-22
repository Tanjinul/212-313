import javax.swing.*;
import java.awt.*;


public class NumbersGUI extends JFrame {
    private Component display;

    public NumbersGUI() {
        
        setLayout(new GridLayout(3,3));
        setSize(1000, 500);
        setLocation(200, 100);
        setTitle("Project1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JScrollPane scroll = new JScrollPane(display);
    }
    
    public static void printarray(NumbersGUI myGUI) {
    Container myContentPane = myGUI.getContentPane();
    TextArea myTextArea = new TextArea();
    
    TextArea Area1 = new TextArea();
    TextArea Area2 = new TextArea();
    TextArea Area3 = new TextArea();
    TextArea Area4 = new TextArea();
    TextArea Area5 = new TextArea();
    TextArea Area6 = new TextArea();
    TextArea Area7 = new TextArea();
    TextArea Area8 = new TextArea();
    TextArea Area9 = new TextArea();
    
    myContentPane.add(Area1);
    myContentPane.add(Area2);
    myContentPane.add(Area3);
    myContentPane.add(Area4);
    myContentPane.add(Area5);
    myContentPane.add(Area6);
    myContentPane.add(Area7);
    myContentPane.add(Area8);
    myContentPane.add(Area9);
    

    for(int i=2;i<100;i++) {
        if(i%2 == 0)
        Area1.append(""+ i + "\n");
        if(i%3 == 0)
        Area2.append(""+ i+ "\n");
        if(i%4 == 0)
        Area3.append(""+ i+ "\n");
        if(i%5 == 0)
        Area4.append(""+ i+ "\n");
        if(i%6 == 0)
        Area5.append(""+ i+ "\n");
        if(i%7 == 0)
        Area6.append(""+ i+ "\n");
        if(i%8 == 0)
        Area7.append(""+ i+ "\n");
        if(i%9 == 0)
        Area8.append(""+ i+ "\n");
        if(i%10 == 0)
        Area9.append(""+ i+ "\n");
     }
    myGUI.setVisible(true);
  }
}
