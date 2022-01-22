
public class BulbNode 
{
    protected Bulb data;
    protected BulbNode next;
    
    public BulbNode(Bulb b)
    {
        data = b;
        next = null;
    }
    
    public BulbNode()
    {
         data=null;
         next=null;
    }
}
