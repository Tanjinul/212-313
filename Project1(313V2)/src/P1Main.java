import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class P1Main 
{
    public static void main(String[] args) throws IOException
    { 
        //loading it in  
        myBST Banklogs = new myBST();
        load(Banklogs);
        
        //scanner to read choice
        Scanner input = new Scanner(System.in);
        String answer;

        // a do while loop up until you go back to the menu and then exit which will save your stuff
        do {

            System.out.println("Please Select one of the following numbers as your actions:" + System.lineSeparator() + "1.Make a deposit to an existing account"+System.lineSeparator()+"2.Make a withdrawl from an existing account"+System.lineSeparator()+"3.Check balance of an existing account"+System.lineSeparator()+"4.Open a new customer account"+System.lineSeparator()+"5.Close a customer account"+System.lineSeparator()+"6.Save and Exit the program");
            String pick = input.nextLine();  
            //          boolean again = true;


            outer: if(pick.equals("1")) //if the customer picks 1 it means they want to deposit in their account
            {
                Scanner depoo = new Scanner(System.in);

                //getting first name
                System.out.print("Enter First Name: ");
                String fname  = depoo.nextLine();

                //getting last name
                System.out.print("Enter Last Name: ");
                String lname = depoo.nextLine();

                //getting account number
                System.out.print("Enter account number: ");
                String accnum = depoo.nextLine();

                Customer temp = new Customer(fname,lname,accnum);

                Customer changetemp = Banklogs.Search(temp);

                //if customer is not found you got two choices, either go to the menu or keep on trying
                while(changetemp==null)
                {
                    System.out.println("Nobody with this account was found, type \"return\" to select an option to go back to menu"+ System.lineSeparator()+"or type \"continue\" to try again");
                    String choicee = depoo.nextLine();

                    if(choicee.equalsIgnoreCase("return"))
                    {
                        break outer; //java's "goto" statement like a label to exit and go to the menu
                    }
                    else if(choicee.equalsIgnoreCase("continue"))
                    {
                        System.out.print("Enter First Name: ");
                        fname  = depoo.nextLine();

                        //getting lastname
                        System.out.print("Enter Last Name: ");
                        lname = depoo.nextLine();

                        //getting accountnumber
                        System.out.print("Enter account number: ");
                        accnum = depoo.nextLine();

                        temp = new Customer(fname,lname,accnum);

                        changetemp = Banklogs.Search(temp);
                    }
                }

                //depositing stuff inside the customers account
                System.out.print("Enter Amount to deposit: ");
                String depovalue = depoo.nextLine();

                changetemp.deposit(Double.parseDouble(depovalue));



            }
            else if(pick.equals("2")) // if the customer picks 2 it means they want to withdraw money from their account
            {
                Scanner withd = new Scanner(System.in);

                //getting firstname
                System.out.print("Enter First Name: ");
                String fname  = withd.nextLine();

                //getting lastname
                System.out.print("Enter Last Name: ");
                String lname = withd.nextLine();

                //getting account number
                System.out.print("Print account number: ");
                String accnum = withd.nextLine();

                Customer temp = new Customer(fname,lname,accnum);

                Customer changetemp = Banklogs.Search(temp);


                while(changetemp==null) //while account is not found, you can either go to the menu or keep on trying
                {
                    System.out.println("Nobody with this account was found, type \"return\" to select an option to go back to menu"+ System.lineSeparator()+"or type \"continue\" to try again");
                    String choicee = withd.nextLine();

                    if(choicee.equalsIgnoreCase("return"))
                    {
                        break outer;
                    }
                    else if(choicee.equalsIgnoreCase("continue"))
                    {
                        System.out.print("Enter First Name: ");
                        fname  = withd.nextLine();

                        //getting lastname
                        System.out.print("Enter Last Name: ");
                        lname = withd.nextLine();

                        //getting accountnumber
                        System.out.print("Enter account number: ");
                        accnum = withd.nextLine();

                        temp = new Customer(fname,lname,accnum);

                        changetemp = Banklogs.Search(temp);
                    }
                }

                //withdrawing stuff inside
                System.out.print("Enter Amount to withdraw: ");
                String withdrawval = withd.nextLine();

                while(Double.parseDouble(withdrawval) > changetemp.getbalance())//if the money they are trying to withdraw is more than what they have they gotta re enter
                {
                    //lucky that I dont charge overdraft fees
                    System.out.print("You currently have $"+changetemp.getbalance()+" Enter Amount that is less than the amount of money in your account: ");
                    withdrawval = withd.nextLine();
                }

                changetemp.withdraw(Double.parseDouble(withdrawval));

            }
            else if(pick.equals("3"))
            {
                Scanner bal = new Scanner(System.in);

                //getting firstname
                System.out.print("Enter First Name: ");
                String fname  = bal.nextLine();

                //getting lastname
                System.out.print("Enter Last Name: ");
                String lname = bal.nextLine();

                //getting account number
                System.out.print("Print account number: ");
                String accnum = bal.nextLine();

                Customer temp = new Customer(fname,lname,accnum);

                Customer changetemp = Banklogs.Search(temp);

                while(changetemp==null)
                {
                    System.out.println("Nobody with this account was found, type \"return\" to select an option to go back to menu"+ System.lineSeparator()+"or type \"continue\" to try again");
                    String choicee = bal.nextLine();

                    if(choicee.equalsIgnoreCase("return"))
                    {
                        break outer;
                    }
                    else if(choicee.equalsIgnoreCase("continue"))
                    {
                        System.out.print("Enter First Name: ");
                        fname  = bal.nextLine();

                        //getting lastname
                        System.out.print("Enter Last Name: ");
                        lname = bal.nextLine();

                        //getting accountnumber
                        System.out.print("Enter account number: ");
                        accnum = bal.nextLine();

                        temp = new Customer(fname,lname,accnum);

                        changetemp = Banklogs.Search(temp);
                    }
                }

                System.out.println("Your current Balance: $"+changetemp.getbalance());

            }
            else if(pick.equals("4"))
            {       
                System.out.println("Creating a new account: ");
                Scanner createacc = new Scanner(System.in);

                System.out.print("Enter First Name: ");
                String fname  = createacc.nextLine();

                //getting lastname
                System.out.print("Enter Last Name: ");
                String lname = createacc.nextLine();

                //getting account number
                System.out.print("Print account number (4 digits): ");
                String accnum = createacc.nextLine();

                while(accnum.length()!=4 || Banklogs.searchaccnum(accnum)==true) //if the account number already exists or the length of the account number is more than 4 keep on trying
                {
                    System.out.print("Your account number is either more than 4 digits or "+System.lineSeparator()+"this account number is taken, please try again:");
                    accnum = createacc.nextLine();

                }

                Customer temp = new Customer(fname,lname,accnum);

                Banklogs.insertBST(temp);

                System.out.print("Enter the ammount you want to deposit to your new account: "); //making initial deposit after openning account
                String depovalue = createacc.nextLine();

                temp.deposit(Double.parseDouble(depovalue));

                System.out.println("Done creating account");

            }
            else if(pick.equals("5"))
            {
                System.out.println("Deleting an account: ");
                Scanner deleteacc = new Scanner(System.in);

                System.out.print("Enter First Name: ");
                String fname  = deleteacc.nextLine();

                //getting lastname
                System.out.print("Enter Last Name: ");
                String lname = deleteacc.nextLine();

                //getting account number
                System.out.print("Print account number: ");
                String accnum = deleteacc.nextLine();

                Customer temp = new Customer(fname,lname,accnum);

                Customer changetemp = Banklogs.Search(temp);

                // if nobody with that account was found there is nothing to delete to either return to menu or keep on trying 
                while(changetemp==null)
                {
                    System.out.println("Nobody with this account was found, type \"return\" to select an option to go back to menu"+ System.lineSeparator()+"or type \"continue\" to try again");
                    String choicee = deleteacc.nextLine();

                    if(choicee.equalsIgnoreCase("return"))
                    {
                        break outer;
                    }
                    else if(choicee.equalsIgnoreCase("continue"))
                    {
                        System.out.print("Enter First Name: ");
                        fname  = deleteacc.nextLine();

                        //getting lastname
                        System.out.print("Enter Last Name: ");
                        lname = deleteacc.nextLine();

                        //getting accountnumber
                        System.out.print("Enter account number: ");
                        accnum = deleteacc.nextLine();

                        temp = new Customer(fname,lname,accnum);

                        changetemp = Banklogs.Search(temp);
                    }
                }

                Banklogs.delete(changetemp);
            }
            else if(pick.equals("6"))
            {
                //this is where we save everything on a new txt file and exit the program
                PrintWriter output = new PrintWriter("finaloutput.txt");

                Banklogs.Showlogspreorder(output);
                output.flush();
                output.close();
                System.exit(0);

            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Type in \"Y\" to return to the menu to Save and Exit or do more operations ");
            answer = sc.nextLine();

        }
        while(answer.equalsIgnoreCase("Y"));

        input.close();                    

    }

    //method for loading like the txtfile into the bst
    public static void load(myBST newwbst)
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

            newwbst.insertBST(custom);

        }

        sc.close();
    }
}


