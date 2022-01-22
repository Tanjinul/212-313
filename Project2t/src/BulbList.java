
public abstract class BulbList 
{
    protected BulbNode first = new BulbNode(null);
    
    protected BulbNode last = first;
    
    protected int length = 0;
    
    public void append(Bulb b) //append meaning adding stuff to the linked list
    {
        BulbNode newNode=new BulbNode(b);//create a new node
        
        last.next=newNode;
        
        last=newNode;
        
        length++;
    }// method append(String)
    
    public String toString() 
    {
        BulbNode p = first.next;
        String returnString = "";
        while (p != null) {
            returnString += p.data + " ";
            p = p.next;
        }
        return returnString;
    }
    
    public boolean equals(Object other) { 
        if (other == null || getClass() != other.getClass() || length != ((BulbList) other).length)
            return false;

        BulbNode nodeThis = first;
        BulbNode nodeOther = ((BulbList) other).first;
        while (nodeThis != null) {
            // Since the two linked lists are the same length,
            // they should reach null on the same iteration.
            if (nodeThis.data != nodeOther.data)
                return false;

            nodeThis = nodeThis.next;
            nodeOther = nodeOther.next;
        } // while

        return true;
    } // method equals
   

}
