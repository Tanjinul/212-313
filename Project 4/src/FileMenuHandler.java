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
        int stat;
        JFileChooser fd = new JFileChooser("./");
        fd.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        stat = fd.showOpenDialog(null);
        /*if(stat == JFileChooser.APPROVE_OPTION)
        {
            readSource(fd.getSelectedFile());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Open file dialog cancelled");
        }*/
        
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
 
                Bulb newb = new Bulb(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3])); //storing data into Bulb object
                Project4.unsortbulbs.add(newb); //adding it to the arraylist
                Project4.sort.put(newb.getPartnumber(), newb);
              
            
            line = fileinput.readLine(); //reading next line
            
        }
        //checking to see if everything print properly
        
        //Project4.sort.forEach((k,v) -> System.out.println("key= " + k + " Value= "+v ));
        
        //System.out.println("\n");
        //System.out.println("\n");

        /*for(int i=0; i<Project4.unsortbulbs.size(); i++)
        {
            System.out.println(Project4.unsortbulbs.get(i).toString());
        }*/
        
        Project4.mainGUI.show(Project4.unsortbulbs,Project4.sort); 
    }
}



