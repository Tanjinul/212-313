/*
 * @author: Tanjinul Hoque
 * @date: 25th April
 * @Projectnumber: 3
 */
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Project3 
{
    static BulbGUI mainGUI; //declaring GUI
    
    public static ArrayList<Bulb> unsortbulbs = new ArrayList<Bulb>(); //declaring array
    
    public static void main(String[] args) 
    {   
        
       mainGUI = new BulbGUI("My Project3 GUI", 500,300);
      
    }
}
