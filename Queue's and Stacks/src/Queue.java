public class Queue 
{
    private int[] data;
    private int front;
    private int rear;
    private int count;
    
    public void queue(int size)
    {
        data = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }
    
    public boolean isEmpty()
    {
        return (count == 0);
    }
    
    
    public void enqueue(int x)
    {
        if(count == data.length) //if nothing has been dequed and it keeps on going then you cannot queue anymore
        {
            throw new IllegalArgumentException ("cant enque anymore");
        }
        
        // this is for the wrap around and queueing stuff
        rear = (rear +1) % data.length;
        data[rear] = x;
        count++;
    }
    
    public int dequeue()
    {
        // if there is nothing to queue then you cant queue
        if(count == 0)
        {
            throw new IllegalArgumentException ("got nothing to dequeue");
        }
        
        int val = data[front];
        
        front = (front+1) % data.length;
        count--;
        
        return val;
    }
    
    
}
