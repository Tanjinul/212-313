import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.util.Map.Entry;

class BulbGUI extends JFrame 
{
    // text areas to import from linked list
    public JTextArea unsortedText;
    public JTextArea sortedText;
    static final long serialVersionUID = 1L;

    public BulbGUI() 
    {

        createFileMenu();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        
        unsortedText = new JTextArea();
        sortedText = new JTextArea();
        

       
        unsortedText.setEditable(false);
        sortedText.setEditable(false);
        

        // add scrollbars
        JScrollPane unsortedScroll = new JScrollPane(unsortedText);
        JScrollPane sortedScroll = new JScrollPane(sortedText);
        

        // add elements to gui
        add(unsortedScroll);
        add(sortedScroll);

        // add grid layout
        setLayout(new GridLayout(1, 2));
        setSize(600, 400);
        setLocation(100, 100);
        setTitle("LOOK AT ALL THESE WORDS");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void createFileMenu() {
        JMenuItem item;
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        FileMenuHandler fmh = new FileMenuHandler(this);
        EditMenuHandler emh = new EditMenuHandler(this);

        item = new JMenuItem("Open"); // Open...
        item.addActionListener(fmh);
        fileMenu.add(item);

        fileMenu.addSeparator(); // add a horizontal separator line

        item = new JMenuItem("Quit"); // Quit
        item.addActionListener(fmh);
        fileMenu.add(item);

        item = new JMenuItem("Search"); // Open...
        item.addActionListener(emh);
        editMenu.add(item);

        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

    }

    public void show(ArrayList<Bulb> unsortt, TreeMap<String, Bulb> sortedTM) {
        unsortedText.setText("");
        sortedText.setText("");
        
        for(int i=0; i<unsortt.size(); i++) //going through the arraylist and then adding it to the GUI
        {
            unsortedText.append(unsortt.get(i).toString());
            
        }


        Set<Entry<String, Bulb>> set = sortedTM.entrySet();
        Iterator<Entry<String, Bulb>> i = set.iterator();


        while (i.hasNext()) 
        {
            Entry<String, Bulb> me = i.next();
            sortedText.append(me.getValue().toString());
        }
        

    }
}