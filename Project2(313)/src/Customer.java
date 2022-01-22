
public class Customer implements Comparable<Customer>
{
    String first, last;
    String acctNo;
    double balance;
    
    //customer
    public Customer()
    {
        first = "";
        last = "";
        acctNo = "";
        balance = 0;
    }
    
    public Customer(String first, String last, String acctNo)
    {
        this.first = first;
        this.last = last;
        this.acctNo = acctNo;
    }
      
    //getting first name
    public String getfirst()
    {
        return first;
    }
    
    //getting last name
    public String getlast()
    {
        return last;
    }
    
    //getting account number
    public String getacctNo()
    {
        return acctNo;
    }
    
    //geting balance
    public double getbalance()
    {
        return balance;
    }
    
    //setting first name
    public void setfirst(String first)
    {
        this.first = first;
    }
    
    //setting last name
    public void setlast(String last)
    {
        this.last = last;
    }
    
    //setting account number
    public void setacctNo(String acctNo)
    {
        this.acctNo = acctNo;
    }
    
    //settign balance
    public void setbalance(double balance)
    {
        this.balance = balance;
    }

    //depositing money
    public void deposit(double amount)
    {
        balance+=amount;
    }
    
    //withdrawing money, did not throw an illegal argument exception since I want them to put it in repeatedly
    public void withdraw(double amount)
    {
        balance-=amount;
    }
    
    //seeing it account numbers are equal, could have used this but I ended up modifying the compateTo
    public boolean equals(String acctNo)
    {
        return this.acctNo==acctNo;
    }
    
    
    //compareTo
    public int compareTo(Customer o) 
    {
        int comp = this.last.compareTo(o.last);
        
        //(condition) ? (what happens if true) : (what happens if false) trying out something new.
        return comp == 0 ? this.first.compareTo(o.first) : comp;
    }
    
    
    public String toString()
    {
        String r = first + " " + last +System.lineSeparator()+"Account Number: "+ acctNo +System.lineSeparator() +"Balance: $"+ balance+System.lineSeparator();
        return r;
    }
    
    
    
}
