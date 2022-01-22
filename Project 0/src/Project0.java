import javax.swing.JOptionPane;

/**
 * 
 * @author Tanjinul
 * @timestamp 21st Feb
 * @description User enters a string and the it shows the user how many 'e' and
 *              'E' they have in their sentence
 *
 */

public class Project0 {

    public static void main(String[] args) {
        String inputword;

        int countbige = 0;

        int countsmalle = 0;

        while (true) {

            inputword = JOptionPane.showInputDialog(null, "Enter a sentence");// GUI using JOptionPane.showInputDialog
                                                                              // to get user input

            if (inputword.equalsIgnoreCase("STOP")) // when the user types 'stop' and "STOP" the program stops(exits)
                                                    // and any stop works because of IgnoreCase
            {
                System.exit(0);
            }

            wordcount(inputword, countbige, countsmalle); // calling function for execution

        }
    }

    public static void wordcount(String inputword, int Countbige, int Countsmalle) {
        for (int i = 0; i <= inputword.length()-1; i++) // going from 0 to the end of the sentence
        {

            if (inputword.charAt(i) == 'E') // checking for big 'E' and then increasing count
            {
                Countbige++;
            } else if (inputword.charAt(i) == 'e') // checking for small 'e' and then increasing count
            {
                Countsmalle++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "number of lower case e's: " + Countsmalle + "\n" + "number of upper case e's: " + Countbige); // using
                                                                                                               // JOptionPane.showMessageDialog
                                                                                                               // to
                                                                                                               // show
                                                                                                               // the
                                                                                                               // result
                                                                                                               // to the
                                                                                                               // user.
    }
}
