
public class Cup 
{
    private int ounces;
    private String contents;
    
    public Cup(int o, String c)
    {
        if(o!= 8 || o!= 16 || o!=32)
        {
            throw new IllegalArgumentException("Argument is not correct o must be 8 or 16 or 32");
            
        }
        o=ounces;
        c=contents;
    }
    
    public int geto()
    {
        return ounces;
    }
    
    public String getc()
    {
        return contents;
    }
    
    public void seto(int Newo)
    {
        if(ounces!= 8 || ounces!= 16 || ounces!=32)
        {
            throw new IllegalArgumentException("Argument is not correct o must be 8 or 16 or 32");
        }
        this.ounces=Newo;
    }
    
    public void setc(String Newc)
    {
        this.contents=Newc;
    }
}
