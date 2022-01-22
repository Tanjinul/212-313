import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class Project2 
{
    public static void main(String args[]) throws FileNotFoundException
    {
        UnsortedBulbList unsort = new UnsortedBulbList();
        SortedBulbList sort = new SortedBulbList();
        
        File file = new File("Project2Data.txt");
        Scanner filescanner = new Scanner(file);
        
        while(filescanner.hasNext())
        {
           String temp = filescanner.nextLine();
           String[] val = temp.split(",");
           
           Bulb newb = new Bulb(val[0], val[1], Integer.parseInt(val[2]), Integer.parseInt(val[3]));
           
           unsort.add(newb);
           sort.add(newb);
 
        }
        
        BulbGUI ownGUI = new BulbGUI();
        ownGUI.ShowmeGUI(unsort, sort);
        
      
    }
}
