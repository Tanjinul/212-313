import javax.swing.*;

public class Lab5Program1 {
	
  static int counter=0;//used to count the number of lines
  
	public static void main(String[] args) {//args: a list of external arguments, eg. input.txt output.txt 
	//"java" wordArray[0]
		String[] wordArray=inputFromFile("lab5input.txt") ;//args[0] represent the file "lab5input.txt" you can also enter args[0] and do run as to run the code 
		String isOrIsNot, inputWord;
		
			while(true) { //infinite loop
		// This line asks the user for input by popping out a single window
		// with text input
		inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");//GUI
		if(inputWord.equalsIgnoreCase("STOP")) {
			System.exit(0);//terminate the program
		}
		// if the inputWord is contained within wordArray return true
		if (wordIsThere(inputWord, wordArray)) 
			isOrIsNot = "is"; // set to is if the word is on the list
		else
			isOrIsNot = "is not"; // set to is not if the word is not on the list
		
		// Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
			}
			} //main

	
	public static String[] inputFromFile(String fileName) {
		//create an object of TextFileInput by calling the constructor
		TextFileInput tfi= new TextFileInput(fileName);
		String line=tfi.readLine();//return the first line
		String[] array=new String[20];
		int i=0;
		while(line!=null) { //keep reading from the file until the end
			array[i++]=line;//put the first word into the first position of the array
			line=tfi.readLine();//READ the next line
		    counter++;
		}
		return array;
		
	}
	public static boolean wordIsThere(String findMe, String[] theList) {
             for(int i=0;i<counter;i++) {
            	 if(findMe.equals(theList[i]))
            		 return true;
            		 
             }
             return false;
             
	} // wordIsThere
} // class Lab5Program1
