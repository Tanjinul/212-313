
public class AMQuestion2 {
    
    public static void main(String args[])
    {
        int arr[][] = {{10,45,3,8},{2,42},{3,21,44}};
        
        System.out.println("The number of times 3 appears is "+findNums(arr,3));
    }
    
    public static int findNums (int [][] myArray, int a)
    {
        int countt=0;
        
        for(int row=0; row<myArray.length; row++)
        {
            for(int col=0; col<myArray[row].length; col++)
            {
                if(myArray[row][col] == a)
                {
                    countt++;
                }
            }
        }
        return countt;
    }

}
