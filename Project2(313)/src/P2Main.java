import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Tanjinul Hoque
 * Corrections made: 1) Changed recursive methods to static since they are not member methods
 * 2) Changed the name of my data field from customer to "data"
 * 3) Withdraw checks balance in the main, it does not throw an exception from customer class but throws in main
 * 
 * AccData is a better method because it has a constant time lookup, meaning when I have the account number
 * I can just look it up in the array using the account number since the customer corresponds to the account number
 * in the array. We need the BST lookup so that if we dont have the account number, but have the name of the customer
 * we can provide an alternative to search and the BSt lookup is log n so it's slower than that of constant time
 *
 */
public class P2Main 
{
    public static void main(String[] args) throws IOException
    { 
        //loading it in  
        myBST Banklogs = new myBST();
        Customer[] AccData = new Customer[10000]; 
        load(Banklogs,AccData);

        //scanner to read choice
        Scanner input = new Scanner(System.in);


        while(true) //we exit when we click 6 so it just keeps on going till then
        {
            //the menu
            System.out.println("Please Select one of the following numbers as your actions:" + System.lineSeparator() + "1.Make a deposit to an existing account"+System.lineSeparator()+"2.Make a withdrawl from an existing account"+System.lineSeparator()+"3.Check balance of an existing account"+System.lineSeparator()+"4.Open a new customer account"+System.lineSeparator()+"5.Close a customer account"+System.lineSeparator()+"6.Save and Exit the program");
            String pick = input.nextLine();  

            switch(Integer.parseInt(pick))
            {
            case 1:
                Scanner depoinput = new Scanner(System.in);

                System.out.print("Do you want to access account by Account numer or Firstname and Lastname, type 1 for account number and 2 for First and Last name: ");
                String accessinput = depoinput.nextLine();

                if(accessinput.equals("1"))
                {
                    System.out.print("Enter account number: ");
                    String accnum = depoinput.nextLine();

                    while(AccData[Integer.parseInt(accnum)]==null)
                    {
                        System.out.print("Enter a valid account number: ");
                        accnum = depoinput.nextLine();
                    }

                    System.out.print("How much money do you want to deposit in this account: ");
                    String amount = depoinput.nextLine();
                    AccData[Integer.parseInt(accnum)].deposit(Double.parseDouble(amount));

                }
                else if(accessinput.equals("2"))
                {
                    System.out.print("Enter First Name: ");
                    String fname = depoinput.nextLine();

                    System.out.print("Enter Last Name: ");
                    String lname = depoinput.nextLine();

                    Customer Search = Banklogs.Search(fname, lname);

                    while(Search==null)
                    {
                        System.out.println("Nobody with that account number was found please try again");

                        System.out.print("Enter First Name: ");
                        fname = depoinput.nextLine();

                        System.out.print("Enter Last Name: ");
                        lname = depoinput.nextLine();

                        Search = Banklogs.Search(fname, lname);
                    }

                    System.out.println("How much money do you want to deposit in this account: ");
                    String amount = depoinput.nextLine();
                    Search.deposit(Double.parseDouble(amount));

                }

                break;

            case 2:
                Scanner withdinput = new Scanner(System.in);

                System.out.print("Do you want to access account by Account numer or Firstname and Lastname, type 1 for account number and 2 for First and Last name: ");
                String inputt = withdinput.nextLine();

                if(inputt.equals("1"))
                {
                    System.out.print("Enter account number: ");
                    String accnum = withdinput.nextLine();

                    while(AccData[Integer.parseInt(accnum)]==null)
                    {
                        System.out.print("Enter a valid account number: ");
                        accnum = withdinput.nextLine();
                    }
                    System.out.print("How much money do you want to withdraw from this account: ");
                    String amount = withdinput.nextLine();

                    while(Double.parseDouble(amount)>AccData[Integer.parseInt(accnum)].getbalance())
                    {
                        System.out.print("You have $"+AccData[Integer.parseInt(accnum)].getbalance()+" dollars, please enter an amount that is less than that:");
                        amount = withdinput.nextLine();
                        System.out.println();
                    }

                    AccData[Integer.parseInt(accnum)].withdraw(Double.parseDouble(amount));                    
                }
                else if(inputt.equals("2"))
                {
                    System.out.print("Enter First Name: ");
                    String fname = withdinput.nextLine();

                    System.out.print("Enter Last Name: ");
                    String lname = withdinput.nextLine();

                    Customer Search = Banklogs.Search(fname, lname);

                    while(Search==null)
                    {
                        System.out.println("Nobody with that account number was found please try again");

                        System.out.print("Enter First Name: ");
                        fname = withdinput.nextLine();

                        System.out.print("Enter Last Name: ");
                        lname = withdinput.nextLine();

                        Search = Banklogs.Search(fname, lname);
                    }

                    System.out.println("How much money do you want to withdraw from this account: ");
                    String amount = withdinput.nextLine();

                    while(Double.parseDouble(amount)>Search.getbalance())
                    {
                        System.out.print("You have "+Search.getbalance()+" in your account, please input a number that is lower than the amount you have in your account: ");
                        amount = withdinput.nextLine();
                        System.out.println();
                    }

                    Search.withdraw(Double.parseDouble(amount));

                }

                break;

            case 3:
                Scanner checkbal = new Scanner(System.in);

                System.out.print("Do you want to access account by Account numer or Firstname and Lastname, type 1 for account number and 2 for First and Last name: ");
                String choose = checkbal.nextLine();

                if(choose.equals("1"))
                {
                    System.out.print("Enter account number: ");
                    String accnum = checkbal.nextLine();

                    while(AccData[Integer.parseInt(accnum)]==null)
                    {
                        System.out.print("Enter a valid account number: ");
                        accnum = checkbal.nextLine();
                    }
                    System.out.println();
                    System.out.println("You currently have $"+AccData[Integer.parseInt(accnum)].getbalance());                                      
                }
                else if(choose.equals("2"))
                {
                    System.out.print("Enter First Name: ");
                    String fname = checkbal.nextLine();

                    System.out.print("Enter Last Name: ");
                    String lname = checkbal.nextLine();

                    Customer Search = Banklogs.Search(fname, lname);

                    while(Search==null)
                    {
                        System.out.println("Nobody with that account number was found please try again");

                        System.out.print("Enter First Name: ");
                        fname = checkbal.nextLine();

                        System.out.print("Enter Last Name: ");
                        lname = checkbal.nextLine();

                        Search = Banklogs.Search(fname, lname);
                    }

                    System.out.println("You currently have $"+Search.getbalance()+" in your account.");
                }

                break;

            case 4:
                Scanner newacc = new Scanner(System.in);

                System.out.println("Welcome to creating a new account!");

                System.out.print("Enter First Name: ");
                String newaccfname = newacc.nextLine();

                System.out.print("Enter Last Name: ");
                String newacclname = newacc.nextLine();

                System.out.print("Enter new account number of length 4: ");
                String newaccnum = newacc.nextLine();

                while(newaccnum.length()!=4 || Banklogs.searchaccnum(newaccnum)==true) //if the account number already exists or the length of the account number is more than 4 keep on trying
                {
                    System.out.print("Your account number is either more than 4 digits or "+System.lineSeparator()+"this account number is taken, please try again:");
                    newaccnum = newacc.nextLine();

                }

                Customer newacctemp = new Customer(newaccfname,newacclname,newaccnum);
                Banklogs.insertBST(newacctemp);
                AccData[Integer.parseInt(newaccnum)] = newacctemp;

                System.out.print("How much money do you want to deposit in your account: ");
                String amount = newacc.nextLine();

                newacctemp.setbalance(Double.parseDouble(amount));

                System.out.println("Congratulations we are done creating your account!");

                break;


            case 5:
                Scanner delacc = new Scanner(System.in);

                System.out.print("Do you want to access account by Account numer or Firstname and Lastname, type 1 for account number and 2 for First and Last name: ");
                String custompick = delacc.nextLine();

                if(custompick.equals("1"))
                {
                    System.out.print("Enter account number: ");
                    String accnum = delacc.nextLine();

                    while(AccData[Integer.parseInt(accnum)]==null)
                    {
                        System.out.print("Enter a valid account number: ");
                        accnum = delacc.nextLine();
                    }
                    System.out.println();
                    System.out.println("The account has been deleted");
                    Customer tempp = AccData[Integer.parseInt(accnum)];
                    AccData[Integer.parseInt(accnum)] = null;
                    Banklogs.delete(tempp);                   
                }
                else if(custompick.equals("2"))
                {
                    System.out.print("Enter First Name: ");
                    String fname = delacc.nextLine();

                    System.out.print("Enter Last Name: ");
                    String lname = delacc.nextLine();

                    Customer Search = Banklogs.Search(fname, lname);

                    while(Search==null)
                    {
                        System.out.println("Nobody with that account number was found please try again");

                        System.out.print("Enter First Name: ");
                        fname = delacc.nextLine();

                        System.out.print("Enter Last Name: ");
                        lname = delacc.nextLine();

                        Search = Banklogs.Search(fname, lname);
                    }

                    System.out.println("Your account has been deleted!");
                    Banklogs.delete(Search);
                    AccData[Integer.parseInt(Search.getacctNo())] = null;

                }

                break;

            case 6:
                PrintWriter output = new PrintWriter("finaloutputP2.txt");

                Banklogs.Showlogspreorder(output);
                output.flush();
                output.close();
                for(int i=0; i<AccData.length; i++)
                {
                    if(AccData[i]!=null)
                    {
                        System.out.println(AccData[i].toString());
                    }
                }
                System.exit(0);

            }
        }

    }

    //method for loading like the txtfile into the bst and the array
    public static void load(myBST newwbst, Customer database[])
    {

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

            Customer custom = new Customer(list[0],list[1],list[2]);
            custom.setbalance(Double.parseDouble(list[3]));
            
            database[Integer.parseInt(custom.getacctNo())] = custom;

            newwbst.insertBST(custom);

        }

        sc.close();
    }
}
         



