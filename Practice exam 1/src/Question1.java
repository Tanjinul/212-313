
public class Question1
{
    /*
    Question 1.
      Write a complete main method that does the following:
      1. Takes 2 command line arguments, both integers.
      2. If there are not 2 arguments, throw an IllegalArgumentException with an appropriate message.
      3. Otherwise, output, to the console, the sum and product of those numbers, each on a different line.
      For example, 
      C:>java Question2 12 5
      12 + 5 = 17
      12 * 5 = 60
    */
    
    //to take commandline argument you basically do up until args.length < number and then count it as arg 0 and arg 1
    
    public static void main(String[] args)
    {
        if(args.length<2)
        {
            throw new IllegalArgumentException(" Requires 2 command line arguments"); //this is how you throw illegal argument exception.
        }
        
        int firstnum = Integer.parseInt(args[0]); // getting them into int format by using parse as int 
        int secondnum = Integer.parseInt(args[1]);
        
        int summ = firstnum + secondnum;
        int productt = firstnum * secondnum;
        
        System.out.println(firstnum + " + "+ secondnum+ " = " + summ);
        System.out.println(firstnum + " * " + secondnum + " = " + productt);
        //to actually run this you do run as and then input arguments 
    }
}
