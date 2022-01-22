import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FileMenuHandler implements ActionListener
{
    BulbGUI jframe;
    public FileMenuHandler (BulbGUI jf) 
    {
       jframe = jf;
    }
    public void actionPerformed(ActionEvent event) 
    {
       String menuName = event.getActionCommand();
       
       if (menuName.equals("Open"))
       {
           openFile();
       }
       else if (menuName.equals("Quit"))
       {
           System.exit(0); 
       }
           //actionPerformed
    }
    
    private void openFile()
    {
        JFileChooser fd = new JFileChooser("./");
        fd.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fd.showOpenDialog(null);
        
        String projectinput = fd.getSelectedFile().getAbsolutePath();
        TextFileInput fileinput = new TextFileInput(projectinput);
        String line = fileinput.readLine();
        
        while(line!=null)
        {
            String [] arr = new String[4];
            
            StringTokenizer tok = new StringTokenizer(line,","); //breaking it down by commas
            
            int countcom = tok.countTokens();
            
            for(int i=0; i<countcom; i++)
            {
                arr[i] = tok.nextToken();
            }
            try //tryblock
            {
                Bulb newb = new Bulb(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3])); //storing data into Bulb object
                Project3.unsortbulbs.add(newb); //adding it to the arraylist
            }
            catch(IllegalBulbException e) //catch block
            {
                System.out.println(e.getMessage()); //printing out message for the bulbs dont meet wattage
            }
            
            line = fileinput.readLine(); //reading next line
            
        }
        
        Project3.mainGUI.show(Project3.unsortbulbs); 
    }
}



