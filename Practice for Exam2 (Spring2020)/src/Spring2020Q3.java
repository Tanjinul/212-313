
public class Spring2020Q3 {
    
    public class StringNode {
        String data;
        StringNode next;
            public StringNode() 
            {
                data=null;
                next=null;
            }
            public StringNode(String value)
            {
                data=value;
                next=null;
            }
        }
    
        public class StringList 
        {
            StringNode first;
            StringNode last;
            int length;
        }
        
        /*public StringList() //this is supposed to have head node
        {
            StringNode first = new StringNode(null);
            last = first;
            length = 0;
        }*/
        
        /*public int countStrings (int count)
        {
            StringNode p = first.next;
            int countt = 0;
            
            while(p!=null)
            {
                if(p.data.length()== count)
                {
                    countt++;
                }
                
                p = p.next;
            }
            
            return countt;
        }*/
}
