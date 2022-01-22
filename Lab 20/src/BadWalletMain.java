
public class BadWalletMain {
   
   static String[] dataSource =  {"B5","Q","B18","Q","B10","P","N","BAD","D","Q","D"};
   static Wallet myWallet = new Wallet();
   
   public static void main (String[] args) 
   {
   // try / catch begins here         
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') 
         {
            try 
            {
                int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            
                myWallet.addToWallet(new Bill(billValue)); //throw Illegal Bill Exceptions 
            }
           catch(IllegalBillException e )
            {
               System.out.println(e.getMessage());
            }
            catch(NumberFormatException nfe)
            {
                System.out.println(nfe.getMessage()); // one try block can catch a lot of exceptions since we catched all the exception it will continue running the program normally. it print 5,Q,Q,10,P,N,D,Q,D it will skip the bad instances and print out legit ones
            }
         }   
         else
            if (dataItem == 'Q')
               myWallet.addToWallet(new Quarter());
            else
            if (dataItem == 'D')
               myWallet.addToWallet(new Dime());
            else
            if (dataItem == 'N')
               myWallet.addToWallet(new Nickel());
            else
            if (dataItem == 'P')
               myWallet.addToWallet(new Penny());
         }
      
	  myWallet.print();
	  System.out.println("My wallet contains: $"+myWallet.getValue());
   }
   
}
