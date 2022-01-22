
public class Node 
{
    protected int data;
    protected Node next;
    
    public Node(int data,Node next)
    {
        this.data = data;
        this.next = next;
        
    }
    
    public Node()
    {
        this.data = 0;
        this.next = null;
    }
}
