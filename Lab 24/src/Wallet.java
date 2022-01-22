import java.math.BigDecimal;
import java.math.RoundingMode;

public class Wallet {
  private MoneyList walletContents = new MoneyList();
  
  public Wallet(){
	  
  }
  public void addToWallet(Money m){
	  walletContents.append(m);
  }
  public void print () {
	  System.out.println(walletContents.toString());
  }
  //sum
  public String getValue() {
	  double sum=new BigDecimal(walletContents.sum()).setScale(2, RoundingMode.HALF_UP).doubleValue();
	  return ""+sum;
	  
  }
  public void printRecursive () {
	  walletContents.print(walletContents.getFirst().next);
  }
  public void printRecursiveReverse () {
	  walletContents.printReverse(walletContents.getFirst().next);
  }
  public double sumAll() {
	 return walletContents.recuriveSum(walletContents.getFirst().next);
  }
  public double sumQuarters() {
		 return walletContents.recuriveSumQuarter(walletContents.getFirst().next);
	  }
  
  
}
