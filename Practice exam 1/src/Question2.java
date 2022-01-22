/*
 * write the missing method below that will return the sum of the given row in the array
 */
public class Question2 {
    
    public static void main(String args[])
    {
        int arr[][] = {{10,45},{2,42,67,5},{3,21}};
        
        System.out.println(getSumofRow(arr,1));
    }
    
    private static int getSumofRow(int [][] myArray, int row)
    {
        int sum = 0;
        for(int i=0; i<myArray[row].length; i++) //this is to go thorugh and see how many elements are there in that row of the 2d array
        {
            sum += myArray[row][i]; //adding numbers
        }
        
        return sum;
    }

}
