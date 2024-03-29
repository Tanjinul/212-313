
public class WalletMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q","B10","P","N","N","D","Q"};
   static Wallet myWallet = new Wallet();
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            myWallet.addToWallet(new Bill(billValue));
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
	  System.out.println("recursive print in order: ");
	  myWallet.printRecursive();
	  System.out.println("reverse order: ");
	  myWallet.printRecursiveReverse();
	  System.out.println("My wallet contains: $"+myWallet.getValue());
	  System.out.println("Recursive sum: $"+myWallet.sumAll());
	  System.out.println("Recursive sum for quarters only: $"+myWallet.sumQuarters());
	 
   }
   
   }

