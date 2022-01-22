
public class Question1 
{
    public static void main(String args[])
    {
        
        int countlow=0;
        int countup=0;
        
        if(args.length<2)
        {
            throw new IllegalArgumentException(" Requires atleast 2 command line arguments");
        }
        
        for(int i=0; i<args.length; i++)
        {
            if(Character.isLowerCase(args[i].charAt(args[i].length())))
            {
                countlow++;
            }
            if(Character.isUpperCase(args[i].charAt(args[i].length())))
            {
                countlow++;
            }
        }
        
        if(countup>countlow)
        {
            System.out.println("There are more upper case letters");
        }
        else
        {
            System.out.println("There are more lowercase letters");
        }
    }
}
