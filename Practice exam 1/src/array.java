
public class array
{   public static void main(String args[])
    {
        int [][] array = {{1,2,3,4},{5,6},{1}};
    
        System.out.println(findsum(array,1));
    }
    

public static int findsum(int [][] myArray, int k)
{
    int sum = 0;
    
   
       for(int i=0; i<myArray[k].length; i++) //gives sum of col
       {
           
               sum += myArray[i][k];        
           
       }
    
    return sum;
}
}