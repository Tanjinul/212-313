
public class reverse {
    
    public static void reverse(int x) {
        
        if(x<10)
        {
            System.out.print(x);
        }
        else
        {
            System.out.print(x%10);
            reverse(x/10);
        }
        
    }
    
    public static void main(String[]  args)
    {
        reverse(123);
    }

}
