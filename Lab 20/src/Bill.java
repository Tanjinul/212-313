
public class Bill extends Money{
   private int dollars;
   
   public Bill (int d) {//d refers to the amount of the dollars
      if(d!=1 && d!=5 && d!=10 && d!=20 && d!=100) //if not any of these you throw an exception the one we made which is IllegaBIllException
      {
          throw new IllegalBillException("Invalid bill value should be either 1,5,10,20,100 and nothing else");
      }
       dollars = d;
   }
   public int getValue () {
      return dollars;
   }
   public String toString() {
	   return "$ "+dollars+".00";
   }
}
