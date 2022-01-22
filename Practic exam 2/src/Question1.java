import javax.swing.JOptionPane;

public class Question1 {
    
    public static void main(String[] args)
    {
        String inputword;
        int countt=0;
        
        inputword = JOptionPane.showInputDialog(null,"Enter a string: "); //123 Testing 12 23 234 (test from question)
        
        for(int i=0; i<inputword.length()-1; i++)
        {
            if(Character.isDigit(inputword.charAt(i)) && Character.isDigit(inputword.charAt(i+1)))
            {
                countt++;
            }
        }
        
        JOptionPane.showMessageDialog(null,"The number of double count in this sentence is: " +countt);
    }
    

}


 