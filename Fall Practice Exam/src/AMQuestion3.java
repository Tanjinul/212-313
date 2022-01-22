import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class AMQuestion3 {
    
    public static void main(String args[])
    {
        String input;
        int countt=0;
        
        input = JOptionPane.showInputDialog(null,"Enter a string: ");
        
        //myTokens = new StringTokenizer(input,","); //is used to tokenize the string to extract out token/word, the second parameter represents the delimeter
        //System.out.println("There are "+myTokens.countTokens()+" tokens in the line.");
       
        while(!input.equals("STOP"))
        {
          
          StringTokenizer tokenReadFile = new StringTokenizer(input);
          int counttokens = tokenReadFile.countTokens();
          
          String [] checkWords = new String[counttokens];
          
          for(int i=0; i<counttokens; i++)
          {
              checkWords[i] = tokenReadFile.nextToken();
              
              if(Character.isDigit(checkWords[i].charAt(0)) && Character.isDigit(checkWords[i].charAt(checkWords[i].length()-1)))
              {
               countt++;   
              }
          }
          
          input = JOptionPane.showInputDialog(null,"Enter a string: ");
        }
        
        JOptionPane.showMessageDialog(null, "Number of strings that begin and end with digit: "+countt);

    }
}

//char first = input.charAt(0);
//char last = input.charAt(input.length()-1);