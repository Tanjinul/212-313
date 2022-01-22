import javax.swing.*;

public class Lab6Program1 {
    
  static int counter=0;//used to count the number of lines
  
    public static void main(String[] args) {//args: a list of external arguments, eg. input.txt output.txt 
    //"java" wordArray[0]
        int[] wordArray=inputFromFile(args[0]) ;//args[0] represent the file "lab5input.txt" you can also enter args[0] and do run as to run the code 
        
        JOptionPane.showMessageDialog(null,"sum is: " +sum(wordArray,counter)+"\n the average is: "+average(wordArray,counter));
        
            } //main

    
    public static int[] inputFromFile(String fileName) {
        //create an object of TextFileInput by calling the constructor
        TextFileInput tfi= new TextFileInput(fileName);
        String line=tfi.readLine();//return the first line
        int[] array=new int[20];//declare large enough size for the integer array
        int i=0;
        while(line!=null) { //keep reading from the file until the end
            array[i++]=Integer.parseInt(line);//convert integer value to string value
            line=tfi.readLine();//READ the next line
            counter++;
        }
        return array;
        
    }
    public static int sum (int[] myArray, int myArraySize) //myArraySize is counter, actual number of values
    {
        int sum=0;
        for(int i=0; i<myArraySize;i++)
        {
            sum+=myArray[i];
        }
        return sum;
    }
    //myArraySize refers to the actual number of elements
    public static int average (int[] myArray, int myArraySize)
    {
        return sum(myArray,myArraySize)/myArraySize;
    }
} // class Lab6Program1
