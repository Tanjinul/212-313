
public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("noon"));
		System.out.println(isPalindrome("Madam I'm Adam"));
		System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
		System.out.println(isPalindrome("A Toyota"));
		System.out.println(isPalindrome("Not a palindrome"));
		System.out.println(isPalindrome("asdfghfdsa"));
	}
	
	public static boolean isPalindrome(String in) {
		if(in==null) {
			return false;
		}
		return isPalindromeHelper(in.toUpperCase());
	}
	//recursive method
	private static boolean isPalindromeHelper(String in) {
		//base case: emtpy string, "a"
		if(in.length()<=1)
		{
			return true;
		}
		if(!Character.isLetter(in.charAt(0)))
		{//if the first char is not letter, skip it.
			return	isPalindromeHelper(in.substring(1))	;
		}
		else if (!Character.isLetter(in.charAt(in.length()-1)))
		{// if the last char is not letter, skip it
		
		    return	isPalindromeHelper(in.substring(0,in.length()-1));
		}
		//if both of the first char and last char are letters, start comparing them
		else {
			if (in.charAt(0)==in.charAt(in.length()-1))
			{
			    return	isPalindromeHelper(in.substring(1,in.length()-1));
			}
			else
			{
				return false;
			}	
		}
	}
}


/*
 * Given an input string and a testing string, check if the testing string is in the input string or not, if it is in the input string, then return the position where it occurred, otherwise return -1.
*/
