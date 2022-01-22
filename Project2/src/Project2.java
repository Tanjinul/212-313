/**
 * @author Tanjinul Hoque
 * @date 04/9
 * Create a program that takes input from a file and sorts them by wattage, and also presents them in a GUI
 * 
 */
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
public class Project2 
{
    public static void main(String args[]) throws FileNotFoundException
    {
        UnsortedBulbList unsort = new UnsortedBulbList(); //storing objects
        SortedBulbList sort = new SortedBulbList();
        
       TextFileInput fileinput = new TextFileInput("Project2Data.txt"); //reading file
       String line = fileinput.readLine();
        
        while(line!=null) //reading until the end of line
        {
           String [] arr = new String[4];
           
           StringTokenizer tok = new StringTokenizer(line,","); //breaking it down by commas
           
           int countcom = tok.countTokens();
           
           for(int i=0; i<countcom; i++)
           {
               arr[i] = tok.nextToken();
           }
           
           Bulb newb = new Bulb(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3])); //storing data into Bulb object
           unsort.add(newb);
           sort.add(newb);
           line = fileinput.readLine(); //reading next line
           
        }
        
        
        BulbGUI ownGUI = new BulbGUI(unsort, sort); //gui to represent results
        //ownGUI.ShowmeGUI(unsort, sort);
        
      
    }
}
