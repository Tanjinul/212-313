class PalindromeNumber {
    public static void isPalindrome(int x) {
        
        int newnum = 0;
        int original = x;
        
        if(x<0)
        {
            System.out.println("false");
        }
        
        while(x>0)
        {
            
            newnum = newnum*10 + x%10;
                x=x/10;
        }
        
        if(newnum == original)
        {
            System.out.println("true");
        }
        
    }
    
    /*public static boolean isPalindrome(int num){
        if(num < 0) return  false; 
        int reversed = 0, remainder, original = num;
        while(num != 0) {
             remainder = num % 10; // reversed integer is stored in variable
             reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
             num  /= 10;  //the last digit is removed from num after division by 10.
         }
         // palindrome if original and reversed are equal
         return original == reversed;
     }*/
    
    public static void main(String args[])
    {
        int y=1000000001;
        isPalindrome(y);
        

    }
}


