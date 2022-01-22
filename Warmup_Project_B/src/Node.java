
public class Node 
{
    protected Terms term;
    protected Node next;
    
    public Node(Terms t,Node next)
    {
        this.term = t;
        this.next = next;
        
    }
    
    public Node()
    {
        this.term = null;
        this.next = null;
    }
    

    


}
