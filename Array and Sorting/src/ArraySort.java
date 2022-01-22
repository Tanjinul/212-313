
public class ArraySort {
    
    //static int counter =0;
    
    public static void main(String[] args)
    {
        short[] myArray = new short[10];
        int myArrayLength;
        String filename = "numbers.txt";
        
        myArrayLength = inputFromFile (filename, myArray);
        
        System.out.println("here is your original array");
        for (int i=0; i< myArrayLength; i++)
        {
            System.out.print(myArray[i]+" ");
        }
        
        System.out.println();
        
        selectionsort(myArray, myArrayLength);
        
        System.out.println("Here is your sorted array");
        for(int i=0; i< myArrayLength; i++)
        {
            System.out.print(myArray[i]+" ");
        }
        
        
    }


    private static int inputFromFile(String filename, short[] numbers)
    {
        TextFileInput tfi= new TextFileInput(filename);
        String line = tfi.readLine();
        int lengthfilled = 0;
        
        while(lengthfilled < numbers.length && line!= null)
        {
            numbers[lengthfilled++] = Short.parseShort(line);
            line = tfi.readLine();
            
        }
        
        if(line!= null)
        {
            System.out.println("File contains too many numbers.");
            System.out.println("This process can process only "+ numbers.length+" numbers.");
            System.exit(1); //force termination of program
        }
        tfi.close(); //closes the data file
        
        return lengthfilled; //returns how many cell of the array were actually filled. [from input file, length filled will be 5]
        
    }
    
    private static void selectionsort(short[] array, int length)
    {
        for (int i=0; i< length; i++)
        {
            int lowestindex = i;
            
            for(int j=i+1; j<length; j++)
            {
                if(array[j]< array[lowestindex])
                {
                    lowestindex = j;
                }
            }
            if(array[lowestindex]!=array[i])
            {
                short temp = array[lowestindex];
                array[lowestindex] = array[i];
                array[i] = temp;
            }
        }
    }

}

