
import java.io.*;
import java.util.Date;

public class SaveDate {

  public static void main(String argv[]) throws Exception 
  {
    FileOutputStream fos = new FileOutputStream("date.out"); // when creating create file output first and object output second
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    Date date = new Date(); //generate current date and time
    oos.writeObject(date);
    oos.flush(); //flush the cache
    oos.close(); //gotta close or else you might crash the memory (close object output first and file last)
    fos.close();
  }
}