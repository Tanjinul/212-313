/*
 * Question 3.
      Write a Java program that will read a String using a JOptionPane, count the number of characters that are 
      digits, and display that number in another JOptionPane.  This may make use of the method in the Character 
      wrapper class called isDigit().
       */
import javax.swing.JOptionPane;

public class Question3 {
    
    public static void main(String[] args)
    {
        String inputword;
        int counter=0;
        inputword = JOptionPane.showInputDialog(null, "Enter a sentence"); //joptioinpane to get input
        
        for(int i=0; i<inputword.length(); i++) //iterating through string make sure oyu use <= when using length() - 1 
        {
            if(Character.isDigit(inputword.charAt(i))) //method at character wrapperclass called isDigit() is dogot returns trie or false if a char is digit, thus everytime it is true the counter goes up
            {
                counter++;
            }
        }
        
        JOptionPane.showMessageDialog(null,"The number of digits in this sentence is: " +counter);
    }

}
