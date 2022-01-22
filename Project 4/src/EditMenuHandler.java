import javax.swing.*;
import javax.swing.text.html.HTMLDocument.Iterator;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EditMenuHandler implements ActionListener {
   JFrame jframe;
   public EditMenuHandler (JFrame jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) 
   {
      String menuName = event.getActionCommand();
      if (menuName.equals("Search"))
      {
          this.partsearch();
      }
   } //actionPerformed
   
   TreeMap<String,Bulb> checkpart = Project4.sort;
   
   public void partsearch() //method for searching partnumber
  {
       String inputpart = "";
       
       
       inputpart = JOptionPane.showInputDialog(null,"Enter a partnumber to search"); //having that person 
       
       
       
       if(checkpart.containsKey(inputpart))//using contains key to match partnumber 
       {
           JOptionPane.showMessageDialog(null,"This partnumber is in the treemap!");
       }
       else
       {
           JOptionPane.showMessageDialog(null, "There are no match in the treemap!");
       }
       
  }
       
}
