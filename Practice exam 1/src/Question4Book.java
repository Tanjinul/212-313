
public class Question4Book 
{
    private String title;
    private String author;
    private float price;
    
    public Question4Book(String t, String a, float p)
    {
        if(t==null || p<0 || a == null)
        {
            throw new IllegalArgumentException("Argument is not correct, Bad parameter to constructor");
        }
        
        t=title;
        a=author;
        p=price;
    }
    
    public String gettitle()
    {
        return title;
    }
    
    public String getauthor()
    {
        return author;
    }
    
    public float getprice()
    {
        return price;
    }
    
    public void setitle(String Newtitle)
    {
        if(title == null)
        {
            throw new IllegalArgumentException("Cannot be empty"); 
        }
        
        this.title = Newtitle;
    }
    
    public void setauthor(String Newauthor)
    {
        if(author == null)
        {
            throw new IllegalArgumentException("Cannot be empty"); 
        }
        
        this.author = Newauthor;
    }
    
    public void setprice(float Newprice)
    {
        if(price < 0.0)
        {
            throw new IllegalArgumentException("Cannot be less than 0"); 
        }
        
        this.price = Newprice;
    }
    
    
    
}
