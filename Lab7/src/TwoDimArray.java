
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
	/*private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}*/
	/*private static void display (int num){
		
		if (num%2==0) {
			if (num<10)
			System.out.print(num+"  ");
			else
				System.out.print(num+" ");
		}
		else 
			System.out.print("*  ");
			
		
	}*/
	
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
		int row=Integer.parseInt(tfi.readLine());//first line,"4"-> 4
		int col=Integer.parseInt(tfi.readLine());//second line
		int[][] arr=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=Integer.parseInt(tfi.readLine());//read the number and save it into the array
			}
		}
		
		return arr;
		
	
	}
}

