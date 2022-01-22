import javax.swing.JOptionPane;

public class Question3 {
    
    public static void main(String[] args)
    {
        String input;
        int count = 0;
        int totalcount = 0;
        
        input = JOptionPane.showInputDialog(null,"Enter a string: ");
        
        while(!input.equals("STOP"))
        {
            for(int i=0; i<input.length(); i++)
            {
               count = input.replace(" ", "").length();
            }
            input = JOptionPane.showInputDialog(null,"Enter a string: ");
            totalcount+=count;
        }
        
        System.out.println("The total number of character is "+totalcount);
    }

}
