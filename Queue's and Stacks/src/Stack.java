public class Stack 
{
    private Node top;
     
    public boolean isEmpty() //checking if the stack is empty
    {
        if(top == null)
        {
            return true;
        }
        else return false;
    }
    //there is no head node for this
    public void push(int x) // when we are pushing a new number, it is sort of like a prepend, and there is no head node. top becomes the new inserted number node and the previous number becomes top.next
    {
        top = new Node(x,top);
    }
    
    public int peek() // returns the top value of the stack
    {
        if(top == null)
        {
            throw new IllegalArgumentException ("aint no thing to display");
        }
        
        return top.data;
    }
    
    public int pop()
    {
        if(isEmpty())
        {
            throw new IllegalArgumentException ("nothing to pop");
        }
        int oldtop = top.data;
        top = top.next;
        return oldtop;
    }
    
    public boolean search(int x)
    {
        Node curr = top;
        
        while(curr!=null)
        {
            if(x==curr.data)
            {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}
