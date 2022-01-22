
public class Node 
{
    protected Node left;
    protected Node right;
    protected Customer data;
    
    public Node(Customer customer)
    {
        this.data = customer;
        right = null;
        left = null;
    }
    
    
}
