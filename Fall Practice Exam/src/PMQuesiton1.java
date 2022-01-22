/*
 * 1. Takes any number, but at least two, command line arguments which are words (represented as strings)
and will print to the console the number of words of that end with a digit. (Hint: loop through the args
array)
2. If there are not at least two command line arguments, throw an IllegalArgumentException with an
appropriate message.
Test String: Mary ha8 a little ca4
 */
public class PMQuesiton1 {
    
    public static void main(String args[])
    {
        int countt=0;
        if(args.length<2)
        {
            throw new IllegalArgumentException("Minimum argument must be atleast 2");
        }
        
        for(int i=0; i<args.length; i++)
        {
            if(Character.isDigit(args[i].charAt(args[i].length()-1)))
            {
                countt++;
            }
        }
        
        System.out.println("There are "+countt+" that end with a digit");
    }

}
