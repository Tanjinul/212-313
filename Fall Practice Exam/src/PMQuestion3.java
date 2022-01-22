import javax.swing.JOptionPane;
/**
 * Write a main method that will request the user to enter Strings using a JOptionPane input dialog. The
    method should continue accepting strings until the user types “STOP”.
    Then, using a JOptionPane message dialog, tell the user how many of the strings have an odd length
 */

public class PMQuestion3 
{
    public static void main(String args[])
    {
        String input;
        int odd = 0;
        
        input = JOptionPane.showInputDialog(null,"Enter a string: ");
        
        while(!input.equals("SOTP"))
        {
            for(int i=0; i<input.length(); i++)
            {
                if(input.length()%2==1)
                {
                    odd++;
                }
            }
            input = JOptionPane.showInputDialog(null,"Enter a string: ");
        }
        
        System.out.println("The number of strings that are of odd length is: "+odd);
    }
}
