import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BulbGUI extends JFrame
{
    Container containerss;
    
    public BulbGUI()
    {
        this.setTitle("Project 2"); // title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing windows
        this.setSize(450,350); // size of the window 
        
        this.setLocation(750, 400); // where the window pops up
        this.setLayout(new GridLayout(1,2)); // one row and 2 columns grid
        
        containerss = getContentPane();
 
    }
    
    public void ShowmeGUI(UnsortedBulbList unsort, SortedBulbList sort)
    {
        TextArea unsortt = new TextArea(unsort.toString());
        TextArea sortt = new TextArea(sort.toString());
        
        containerss.add(unsortt);
        containerss.add(sortt);
        
        pack();
        setVisible(true);
    }
    
}
