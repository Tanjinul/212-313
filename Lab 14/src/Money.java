
public class Money implements Comparable<Money> {
	
	private int dollars, cents; //$6.50
	
	/**
	 * Constructor makes a call to {@link #Money(int, int)} 
	 * with (0,0) as parameters
	 */
	public Money() {
		this(0,0); //default value
	}
	
	public Money(int dollars, int cents) {
		// TODO Fill this in
		// Hint: Use integer division by 100 to get dollars from cents
		// and use modulus to get cent values between 0 and 100 (mod by 100)
	    
	    this.dollars = dollars+cents/100; //this refers to the current object, the dollar will be set to the parameter
	    this.cents = cents%100; // number of cents left and put it in cents
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// LAB 14
		Money m1 = new Money(), m2= new Money(6,5);
		System.out.println(m1.getCents());
		System.out.println(m2.getDollars());
		System.out.println(m2); //it will call m2.toString() method
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.equals(m2));
		
		// LAB 15
		m1 = new Money(4,87);
		m2 = new Money(5,243); // if the numbner of cents is > 100 add it to dollars this beocming 7 dollars and 43 cents
		
		m1.add(m2); //when adding you gotta add the cents first and when it exceeds 10 you gotta take the remaining to dollars (87+43)/100 and to get cents we mod 100
		
		System.out.println(m1.toString()); //m1 will hold the sum
		
	}

	public void add(Money other) {
		// TODO Fill this in
		// Hint: Add the cents first, check if you surpass 100 (check hint from 2-arg constructor),
		// then add dollars
	    
	    this.dollars += other.dollars + (this.cents+other.cents)/100; //(87+43)/100
	    this.cents=(this.cents+other.cents)%100;
	    
	}

	@Override
	public int compareTo(Money other) //compare m1 & m2
	{
		// TODO Fill this in
		/*
		 * Steps:
		 * 1) Test the dollars in both first
		 * 2) If dollar values are equal, test
		 * cents in both
		 * 3) If both dollars and cents are equal return 0
		 * 
		 * Hint: compareTo can be viewed as a subtraction operation
		 */
	    if(this.getDollars()>other.getDollars()) //m1>m2
	    {
	        return 1;
	    }
	    else if(this.getDollars()<other.getDollars()) // m1<m2
	    {
	        return -1;
	    }
	    else
	    {
	        if(this.getCents()>other.getCents()) // if the dollars are equal then check cents part
	        {
	            return 1;
	        }
	        else if(this.getCents()<other.getCents())
	        {
	            return -1;
	        }
	        else
	        {
	            return 0;
	        }
	    }
	}
	
	@Override
	public boolean equals(Object other) {
		// TODO Fill this in
		/*
		 * Steps:
		 * 1) Test if other is null
		 * 2) Test if other is of type Money
		 * 3) If the above tests pass, then cast other into
		 * type Money
		 * 4) Compare dollar and cents in both. 
		 * If equal return true, otherwise return false
		 */
		if (this == other) return true; //adress is the same and checking if same object, eg. m1.equals(m1)
		if(other!=null && this.getClass().equals(other.getClass()))
		{
			// Start from step 3
		    if(this.getDollars() == ((Money)other).getDollars() && this.getCents() == ((Money)other).getCents())
		    {
		        return true;
		    }
		    else
		    {
		        return false;
		    }
		}
		else
		{
		    return false;
		}
	}
	
	@Override
	public String toString() 
	{
		String c;
		
		if(cents<10) 
		{
			c = "0" + cents;
		} else 
		{
			c = "" + cents;
		}
		return "$ " + dollars + "." + c;
	}
	
	public int getCents() {
		return cents;
	}
	
	public int getDollars() {
		return dollars;
	}

}
