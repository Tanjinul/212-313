
public class SortedBulbList extends BulbList 
{
    public SortedBulbList()
    {
        super();
    }
    
    public void add(Bulb b)
    {
        BulbNode p = new BulbNode(b);
        BulbNode temp1 = first;
        BulbNode temp2 = this.first.next;
        
        while(temp2!= null) //entering if temp 2 is not null
        {
            if(b.getWattage() < temp2.data.getWattage()) //if b is < temp2 then breaking out of the while loop
            {
                break;
            }
            temp1=temp1.next;
            temp2=temp1.next;
        }
        
        temp1.next= p; //assiging value to the node after first
        p.next = temp2;//pointing temp2 to node after p
        length++; //increasing length
  
    }
        
       
}  
