/*
 * @author: Tanjinul Hoque
 * @date: 1st May
 * @Projectnumber: 4
 */
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Project4 
{
    static BulbGUI mainGUI; //declaring GUI
    
    public static ArrayList<Bulb> unsortbulbs = new ArrayList<Bulb>(); //declaring array
    public static TreeMap<String,Bulb> sort = new TreeMap<String,Bulb>(); //declaring treemap
    
    public static void main(String[] args) 
    {   
        
       mainGUI = new BulbGUI(); //calling GUI
      
    }
}
