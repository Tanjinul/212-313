
public class SortedBulbList extends BulbList 
{
    public SortedBulbList()
    {
        super();
    }
    
    public void add(Bulb b)
    {
        BulbNode newNode = new BulbNode(b);

        BulbNode tempNode = first;
        while(tempNode.next != null)
        {
            if(b.getWattage() <= tempNode.next.data.getWattage())
            {
                newNode.next = tempNode.next;
                tempNode.next = newNode;
                length++;
                return;
            }
            tempNode = tempNode.next;
        }

        //Append 1
        super.append(newNode);

        //Append 2
        //append(b);
    } 
}  
