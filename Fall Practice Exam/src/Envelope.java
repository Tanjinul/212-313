
public class Envelope {
    
    private int height;
    private int width;
    
    public Envelope(int h, int w)
    {
        if(h<0 || w<0)
        {
            throw new IllegalArgumentException("height nor width can be less than 0");
        }
        
        h=height;
        w=width;
    }
    
    public int geth()
    {
        return height;
    }
    
    public int getw()
    {
        return width;
    }
    
    public void seth(int Newh)
    {
        if(height<0)
        {
            throw new IllegalArgumentException("Enter height more than 0");
            
        }
        
        height = Newh;
    }
    
    public void setw(int Neww)
    {
        if(width<0)
        {
            throw new IllegalArgumentException("Width cannot be less than 0");
        }
        
        width = Neww;
    }
    
    

}
