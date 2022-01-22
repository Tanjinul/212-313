import java.math.BigDecimal;
import java.math.RoundingMode;

public class Wallet {
  private MoneyList walletContents = new MoneyList();
  
  public Wallet(){
	  
  }
  public void addToWallet(Money m){
	  walletContents.append(m);
  }
  public void print () 
  {
      System.out.println(walletContents.toString());//print out the string representation of the money list
  }
  public String getValue() {
	
	  float sum = new BigDecimal(walletContents.sumWallet()).setScale(2,BigDecimal.ROUND_HALF_UP).floatValue();;
	   
	   
	  
	  return sum + " ";
	  
  }
}
