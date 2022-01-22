
public class Node 
{
    protected Node left;
    protected Node right;
    protected Customer customer;
    
    public Node(Customer customer)
    {
        this.customer = customer;
        right = null;
        left = null;
    }
    
    
}
