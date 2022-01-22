/*
Write a method called findNums that takes a two-dimension array of integers as a parameter and returns the
number of times a two-digit number appears in the array. For example, if the array (as created by the program
below) is
 */
public class PMQuestion2 
{
    public static void main(String args[])
    {
        int arr[][] = {{10,45,3,8},{2,42},{3,21,44}};
        
        System.out.println("The number of two digit numbers is "+findNum(arr));
    }
    
    public static int findNum(int [][] myArray)
    {
        int over = 0;
        
        for(int i=0; i<myArray.length; i++)
        {
            for(int j=0; j<myArray[i].length; j++)
            {
                if(myArray[i][j] >9)
                {
                    over++;
                }
            }
        }
        return over;
    }
}
