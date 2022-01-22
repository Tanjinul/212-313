import java.util.StringTokenizer;

public class TwoDimArray {

	public static int[][] myArray;//global variable
	
	public static void main(String[] args) {
		myArray = fillArray(args[0]);//twodimension.txt
		printnorm(myArray);
		System.out.println();
		printArrayEven(myArray);
		
	}
	private static void printnorm(int[][] theArray)
	{
	    for(int i=0; i<theArray.length; i++)
	    {
	        for(int j=0; j<theArray[i].length; j++)
	        {
	            if(theArray[i][j]<10)
	            {
	                System.out.print(theArray[i][j]+"  ");
	            }
	            else
	            {
	                System.out.print(theArray[i][j]+" ");
	            }
	        }
	        System.out.println();
	    }
	}
	
	
	private static void printArrayEven(int[][] theArray){
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++) {
			
			    if (theArray[i][j]%2==0) {
		            if (theArray[i][j]<10)
		            System.out.print(theArray[i][j]+"  ");
		            else
		                System.out.print(theArray[i][j]+" ");
		        }
		        else 
		            System.out.print("*  ");
			
			}
			System.out.println();
		}
		
	}
	
	public static int[][] fillArray(String myFile){
		//read from the file
		TextFileInput tfi=new TextFileInput(myFile);
		String line = tfi.readLine(); //reads first line --> row
		StringTokenizer myTokens = new StringTokenizer(line,",");
		int row=Integer.parseInt(myTokens.nextToken());//"4"
		int col=Integer.parseInt(myTokens.nextToken());//"6"
		
		int[][] arr=new int[row][col]; //create 2D array
		
		for(int i=0;i<row;i++) {
		    line=tfi.readLine();
		    myTokens = new StringTokenizer(line,",");
		    
			for(int j=0;j<col;j++) {
				arr[i][j] = Integer.parseInt(myTokens.nextToken());
			}
		}
		
		return arr;
		
	
	}
}

