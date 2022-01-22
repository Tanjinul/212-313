
import java.io.*;
import java.util.Date;

public class SaveMoney {

  public static void main(String argv[]) throws Exception 
  {
    FileOutputStream fos = new FileOutputStream("money.out"); // when creating create file output first and object output second
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    for(int i=0; i<=3; i++)
    {
        Quarter q = new Quarter();
        oos.writeObject(q);
        
        Penny p = new Penny();
        oos.writeObject(p);
        
        Bill b = new Bill(10);
        oos.writeObject(b);
    }
    oos.flush(); //flush the cache
    oos.close(); //gotta close or else you might crash the memory (close object output first and file last)
    fos.close();
  }
}