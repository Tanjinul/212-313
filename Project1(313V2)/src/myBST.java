import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class myBST 
{
    Node root;
    
    //checking if the binary tree is empty or not
    public Boolean isempty()
    {
        return root == null;
    }
    
    //inserting recursively into the BST
    private Node insertRec(Node n, Customer c)
    {
        if(n==null)
        {
            return new Node(c);
        }

        
        if(n.customer.compareTo(c)>0)
        {
            n.left = insertRec(n.left,c);
        }
        else if(n.customer.compareTo(c)<0)
        {
            n.right = insertRec(n.right,c);
        }
        else if(n.customer.compareTo(c)==0)
        {
            n.right = insertRec(n.right,c);
        }
        else
        {
            return n;
        }      
        return n;
    }
    
    //public method for insert
    public void insertBST(Customer c)
    {
        root = insertRec(root, c);
    }
    
    //printing the tree inorder and pre order and showing everybody that has an account with me
    public void Showlogsinorder()
    {
        inOrder(root);
    }
    
    private void inOrder(Node root)
    {
        if(root!= null)
        {
            inOrder(root.left);
            System.out.println(root.customer.toString());
            inOrder(root.right);
            
        }
    }
    
    //writing stuff into the new file in preorder 
    public void Showlogspreorder(PrintWriter writer) throws IOException
    {
        preOrder(root,writer);
    }
    
    public void preOrder(Node root,PrintWriter writer) throws IOException
    {
        if(root!= null)
        {
            writer.println(root.customer.toString());
            preOrder(root.left,writer);
            preOrder(root.right,writer);
            
        }
    }
    
    
    public static Customer Findmin(Node curr)
    {
        if(curr.left==null)
        {
            return curr.customer;
        }
        return Findmin(curr.left);
    }
    
    //member method for Findmin
    public Customer Findmin()
    {
        if(root==null)
        {
            throw new IllegalArgumentException ("Nothing in the tree bruh");
        }
        return Findmin(root);
    }
    

    public static Customer Findmax(Node curr)
    {
        if(curr.right==null)
        {
            return curr.customer;
        }
        return Findmax(curr.right);
    }
    
    //member method for Findmax
    public Customer Findmax()
    {
        if(root==null)
        {
            throw new IllegalArgumentException ("Nothing in the tree bruh");
        }
        return Findmax(root);
    }
    
    
    //Search function to see if a customer is inside the logs because this is being used to validate them
    private Customer SearchRec(Node current, Customer c)
    {
        Node n = null;
                
        if(current!=null)
        {
            if(current.customer.compareTo(c)>0 && current.left!= null)
            {
                return SearchRec(current.left,c);
            }
            if(current.customer.compareTo(c)<0 && current.right!=null)
            {
                return SearchRec(current.right,c);
            }
            if(current.customer.compareTo(c)==0)
            {
                n=current;
            }
        }
        
        if(n==null)
        {
            return null;
        }
        else
        {
            return n.customer;
        }
        
    }
    
    public Customer Search(Customer c)
    {
        return SearchRec(root,c);
    }

    
    //Deleting a customer from the logs
    public void delete(Customer c)
    {
        root = deleterec(root,c);
    }
    
    private Node deleterec(Node current, Customer c)
    {
        //if the tree is empty return
        if(current==null)
        {
            return current;
        }
        
        //going left on the tree
        if(current.customer.compareTo(c)>0)
        {
            current.left = deleterec(current.left,c);
        }
        //going right
        else if(current.customer.compareTo(c)<0)
        {
            current.right = deleterec(current.right,c);
        }
        //this case takes care of when the root is being deleted
        else
        {
            //has 0 or 1 child
            if(current.left == null)
            {
                return current.right;
            }
            else if(current.right==null)
            {
                return current.left;
            }
            
            
            //swapping the minimum from the right subtree
            current.customer = Findmin(current.right);
            //deleting the node that we swapped with
            current.right = deleterec(current.right,current.customer);
        }
        
        return current;
    }
    
    //part of searching account number
    private Boolean searchaccnumrec(Node current, String s)
    {
        if(current==null)
        {
            return false;
        }
        
        //if we find it then return true
        if(current.customer.acctNo.compareTo(s)==0)
        {
           return true; 
        }
        
        //if we find it in the left subtree of the tree then return
        if(searchaccnumrec(current.left,s))
        {
            return true;
        }
        
        //else go look at the right tree
        return searchaccnumrec(current.right,s); 
    }
    
    //searching account number since two people cannot be having the same account number, it's unique
    public Boolean searchaccnum(String s)
    {
        return searchaccnumrec(root,s);
    }
    
    

}
