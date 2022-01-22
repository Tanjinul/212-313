
public class Question2 
{
    public static void main(String[] args)
    {
        int [][] a = {{1,3,3,2},{4,2,5,6},{1,2,3,4},{7,8,9,4}};
        if(diagonalEqualsRow(a,1))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
         

    }
    
    public static boolean diagonalEqualsRow( int [][] myArray, int row )
    {
        if(myArray.length != myArray[0].length) //myArray.length gives you the length of rows and myArray[0],length gives you the length of the column
        {
            throw new IllegalArgumentException("Array is not square");
        }
        if(row > myArray.length)
        {
            throw new IllegalArgumentException("Row is out of bound");
        }
        
        int rowsum=0;
        int diagsum=0;
        
        for(int i=0; i<myArray.length; i++)
        {
            rowsum += myArray[row][i]; //gives me the sum of the row
            diagsum += myArray[i][i]; //gives me the sum of diagonal
        }
        
        if(rowsum==diagsum)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
