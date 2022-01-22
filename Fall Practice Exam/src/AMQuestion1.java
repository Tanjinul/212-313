
public class AMQuestion1 {
    
    public static void main(String args[])
    {
        int count=0;
        if(args.length<2) // if argument is less than 2 then you get an error
        {
            throw new IllegalArgumentException("Requires 2 Arguments"); // throwing illegal arguments          
        }
        for(int i=0; i<args.length; i++) // going thorugh the args, like arg[0], arg[1]
        {
           if(args[i].length() == 3) // if the arg has a length of 3 then the count goes up
           {
               count++;
           }
        }
        
        System.out.println("words that are length 3 : "+count);
    }

}
