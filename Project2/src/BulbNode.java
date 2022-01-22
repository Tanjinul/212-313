
public class BulbNode 
{
    protected Bulb data;
    protected BulbNode next;
    
    public BulbNode(Bulb b) // the one argument constructor
    {
        data = b;
        next = null;
    }
    
    public BulbNode() //default agr constructor
    {
         data=null;
         next=null;
    }
}
