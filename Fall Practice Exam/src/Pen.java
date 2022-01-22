
public class Pen 
{
    private float price;
    private String colour;
    
    public Pen(float p, String c)
    {
        if(p<0)
        {
            throw new IllegalArgumentException("Price cannot be below 0");
        }
        p=price;
        c=colour;
    }
    
    public float getp()
    {
        return price;
    }
    
    public String getc()
    {
        return colour;
    }
    
    public void setp(int Newp)
    {
        if(price<0)
        {
            throw new IllegalArgumentException("Price cannot be below 0"); 
        }
        
        price = Newp;
    }
    
    public void setc(String Newc)
    {
        colour = Newc;
    }
     
}

/* this is how you call it in main
 * public class Main {
  public static void main(String[] args) {
    Pen myObj = new Pen();
    myObj.setp(1.5); // Set the value of the name variable to "John"
    System.out.println(myObj.getp());
  }
}

// Outputs "John"
 */ 
