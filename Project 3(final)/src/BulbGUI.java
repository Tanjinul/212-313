import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BulbGUI extends JFrame
{ 
    Container containerss;
    
   public BulbGUI(String title, int height, int width) 
   {
        setTitle(title);
        setSize(height,width);
        setLocation  (400,200);
        createFileMenu();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); 
   }
   
    private void createFileMenu() //file menu that shows file open and close
    {
        // TODO Auto-generated method stub
        JMenuItem   item;
        
        JMenuBar    menuBar  = new JMenuBar();
        
        JMenu       fileMenu = new JMenu("File");
        
        FileMenuHandler fmh  = new FileMenuHandler(this); //this refers to the current JFrame.
        

        item = new JMenuItem("Open");       //Open...
        item.addActionListener( fmh );
        fileMenu.add( item );

        fileMenu.addSeparator();           //add a horizontal separator line
      
        item = new JMenuItem("Quit");       //Quit
        item.addActionListener( fmh );
        fileMenu.add( item );
        

        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        
      
     } //createMenu
    
    public void show(ArrayList<Bulb> unsortt)
    { 
        TextArea unsort = new TextArea(100,100);
        unsort.setEditable(false);
        getContentPane().add(unsort);
        
        
        for(int i=0; i<unsortt.size(); i++)
        {
            unsort.append(unsortt.get(i).toString());
        }
        
        this.pack();
        this.setVisible(true);
    }
    
}

    
    
    

