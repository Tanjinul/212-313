import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//changed recursive methods to be static
public class myBST 
{
    Node root;
    
    //checking if the binary tree is empty or not
    public Boolean isempty()
    {
        return root == null;
    }
    
    //inserting recursively into the BST
    private static Node insertRec(Node n, Customer c)
    {
        if(n==null)
        {
            return new Node(c);
        }

        
        if(n.data.compareTo(c)>0)
        {
            n.left = insertRec(n.left,c);
        }
        else if(n.data.compareTo(c)<0)
        {
            n.right = insertRec(n.right,c);
        }
        else if(n.data.compareTo(c)==0)
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
    
    private static void inOrder(Node root)
    {
        if(root!= null)
        {
            inOrder(root.left);
            System.out.println(root.data.toString());
            inOrder(root.right);
            
        }
    }
    
    //writing stuff into the new file in preorder 
    public void Showlogspreorder(PrintWriter writer) throws IOException
    {
        preOrder(root,writer);
    }
    
    private static void preOrder(Node root,PrintWriter writer) throws IOException
    {
        if(root!= null)
        {
            writer.println(root.data.toString());
            preOrder(root.left,writer);
            preOrder(root.right,writer);
            
        }
    }
    
    
    public static Customer Findmin(Node curr)
    {
        if(curr.left==null)
        {
            return curr.data;
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
            return curr.data;
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
    private static Customer SearchRec(Node current, String fname, String lname)
    {
        if(current == null)
        {
            return null;
        }
        if(current.data.last.equals(lname) && current.data.first.equals(fname))
        {
            return current.data;
        }
        if(current.data.last.compareTo(lname)>0)
        {
            return SearchRec(current.left,fname,lname);
        }
        else
        {
            return SearchRec(current.right,fname,lname);
        }
        
    }
    
    public Customer Search(String fname, String lname)
    {
        return SearchRec(root,fname, lname);
    }

    
    //Deleting a customer from the logs
    public void delete(Customer c)
    {
        root = deleterec(root,c);
    }
    
    private static Node deleterec(Node current, Customer c)
    {
        //if the tree is empty return
        if(current==null)
        {
            return current;
        }
        
        //going left on the tree
        if(current.data.compareTo(c)>0)
        {
            current.left = deleterec(current.left,c);
        }
        //going right
        else if(current.data.compareTo(c)<0)
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
            current.data = Findmin(current.right);
            //deleting the node that we swapped with
            current.right = deleterec(current.right,current.data);
        }
        
        return current;
    }
    
    //part of searching account number
    private static Boolean searchaccnumrec(Node current, String s)
    {
        if(current==null)
        {
            return false;
        }
        
        //if we find it then return true
        if(current.data.acctNo.compareTo(s)==0)
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
