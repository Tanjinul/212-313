
public abstract class Coin extends Money {
   private int value;
   
   public Coin(int v) {
      value = v;
   }
   public int getValue () { //accessor
      return value;
   }
   public String toString() //string representation
   {
       if(value<10)
       {
           return ("$ 0.0"+getValue());
       }
      return ("$ 0."+getValue());
   }
}
