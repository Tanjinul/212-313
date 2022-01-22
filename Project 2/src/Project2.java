import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*public class Project2 {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("Project2Data.txt");
        Scanner myScanner = new Scanner(myFile);

        SortedBulbList mySortedBulbList = new SortedBulbList();
        UnsortedBulbList myUnsortedBulbList = new UnsortedBulbList();

        while(myScanner.hasNext())
        {
            String temp = myScanner.nextLine();
            String[] value = temp.split(",");

            //Constructor 1
            //Bulb newBulb = new Bulb(temp);

            //Constructor 2
            Bulb newBulb = new Bulb(value[0], value[1], Integer.parseInt(value[2]), Integer.parseInt(value[3]));

            mySortedBulbList.add(newBulb);
            myUnsortedBulbList.add(newBulb);
        }

        BulbGUI myGUI = new BulbGUI();
        myGUI.ShowGUI(myUnsortedBulbList, mySortedBulbList);
    }
}*/


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
           
           Bulb nb = new Bulb(val[0],val[1],Integer.parseInt(val[2]),Integer.parseInt(val[3]));
           
           sort.add(nb);
           
           unsort.add(nb);
                   
        }
        
        BulbGUI gui = new BulbGUI();
       gui.ShowmeGUI(unsort,sort);
        
        
       
        
        
    }
}
