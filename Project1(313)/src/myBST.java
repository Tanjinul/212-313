
public class myBST 
{
    Node root;
    
    
    public Boolean isempty()
    {
        return root == null;
    }
    
    //inserting recursively
    private Node insertRec(Node n, Customer c)
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
    
    private void inOrder(Node root)
    {
        if(root!= null)
        {
            inOrder(root.left);
            System.out.println(root.data.toString());
            inOrder(root.right);
            
        }
    }
    
    public void Showlogspreorder()
    {
        preOrder(root);
    }
    
    public void preOrder(Node root)
    {
        if(root!= null)
        {
            System.out.println(root.data.toString());
            preOrder(root.left);
            preOrder(root.right);
            
        }
    }
    
    //finding minimum
//    public void Findmin()
//    {
//        if(root==null)
//        {
//            throw new IllegalArgumentException("Nobody in the database bro");
//        }
//        
//        Node t = root;
//        
//        while(t.left != null)
//        {
//            t = t.left;
//        }
//        
//        String s = t.customer.toString();
//        
//        System.out.println(s);
//
//    }
    
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
    
    //finding maximum
//    public void Findmax()
//    {
//        if(root==null)
//        {
//            throw new IllegalArgumentException("Nobody in the database bro");
//        }
//        
//        Node t = root;
//        
//        while(t.right != null)
//        {
//            t = t.right;
//        }
//        
//        String s = t.customer.toString();
//        
//        System.out.println(s);
//
//    }
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
    
    
    //Search function to see if a customer is inside the logs
    private Customer SearchRec(Node current, Customer c)
    {
        
        if(current==null)
        {
//            return "This person dont exist in the database";
            throw new IllegalArgumentException("No such customers");
        }
        if(c==current.data)
        {
            return current.data;
        }
        
        if(current.data.compareTo(c)>0)
        {
            return SearchRec(current.left,c);
        }
        else
        {
            return SearchRec(current.right,c);
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
    

}
