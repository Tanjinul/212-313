
public class Question2 {
    
    public static void main(String args[])
    {
        int arr[][] = {{10, 45, 3, 8}, {2, 42}, {3, 21, 44}};

        System.out.println("The row with the largest sum is "+largestRow(arr));
    }
    
    private static int largestRow(int [][] myArray)
    {
        int sum=0;
        int maxsum=0;
        int index=0;
        int newindex=0;
        int row = myArray.length;
        
        for(int i=0; i<myArray.length; i++)
        {
            for(int j=0; j<myArray[i].length; j++)
            {
                sum+= myArray[i][j];
                index=i;
                
            }
            if(sum>maxsum)
            {
                maxsum=sum;
                newindex=index;
            }
            sum=0;
            index=0;
        }
        return newindex;
    }

}
