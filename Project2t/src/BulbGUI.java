import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BulbGUI extends JFrame
{
    Container containerss;
    
    public BulbGUI(UnsortedBulbList unsort, SortedBulbList sort) //taking arguments
    {
        this.setTitle("Project 2"); // title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing windows
        this.setSize(450,350); // size of the window 
        
        this.setLocation(750, 400); // where the window pops up
        this.setLayout(new GridLayout(1,2)); // one row and 2 columns grid
        
        containerss = getContentPane();
        
        TextArea unsortt = new TextArea(unsort.toString());
        TextArea sortt = new TextArea(sort.toString());
        
        containerss.add(unsortt); //adding them 
        unsortt.setEditable(false); // so that the text inside is not editable
        containerss.add(sortt);
        sortt.setEditable(false);
        
        pack();
        setVisible(true);
 
    }
    
    
    
}
