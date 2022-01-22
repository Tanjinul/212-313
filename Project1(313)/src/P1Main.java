import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P1Main 
{
    public static void main(String[] args)
    {
//        myBST custom = new myBST();
//        
//        Customer c1 = new Customer("T","Htei","9",0);
//        Customer c2 = new Customer("T","Htei","2",0);
//        Customer c3 = new Customer("T","Htei","4",0);
//        Customer c4 = new Customer("S", "Dtei","3",0);
//        Customer c5 = new Customer("L","Stei","5",0);
//        Customer c6 = new Customer("M","Atei","1",0);
//        Customer c7 = new Customer("N","Stei","6",0);
//        
//        custom.insertBST(c1);
//        custom.insertBST(c2);
//        custom.insertBST(c3);
//        custom.insertBST(c4);
//        custom.insertBST(c5);
//        custom.insertBST(c6);
//        custom.insertBST(c7);
//        
//        c1.setbalance(5000);
//        c1.deposit(1000);
//        c1.withdraw(500);
//        
//        custom.Showlogsinorder();
//        System.out.println();
//        System.out.println("Min followed by max: ");
//        System.out.println(custom.Findmin());
//        System.out.println(custom.Findmax());
//        System.out.println();
//        System.out.println("Search:");
//        System.out.println(custom.Search(c7));
//        System.out.println();
//        custom.delete(c7);
//        custom.Showlogspreorder();
//        System.out.println();
//        System.out.println(custom.Search(c7));
        
        myBST Banklogs = new myBST();
        load(Banklogs);
        
        
        
        
    
    
    public static void load(myBST newwbst)
    {
//        myBST customer = new myBST();
        
        File file = new File("313P1.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            String[] list = line.split(" ");
            
            Customer custom = new Customer(list[0],list[1],list[2],Double.parseDouble(list[3]));
            
            newwbst.insertBST(custom);
            
        }
        
        sc.close();
    }
}
