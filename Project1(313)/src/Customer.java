
public class Customer implements Comparable<Customer>
{
    String first, last;
    String acctNo;
    double balance;
    
    public Customer()
    {
        first = "";
        last = "";
        acctNo = "";
        balance = 0;
    }
    
    public Customer(String first, String last, String acctNo, double balance)
    {
        this.first = first;
        this.last = last;
        this.acctNo = acctNo;
        this.balance = balance;
    }
      
    public String getfirst()
    {
        return first;
    }
    
    public String getlast()
    {
        return last;
    }
    
    public String getacctNo()
    {
        return acctNo;
    }
    
    public double getbalance()
    {
        return balance;
    }
    
    public void setfirst(String first)
    {
        this.first = first;
    }
    
    public void setlast(String last)
    {
        this.last = last;
    }
    
    public void setacctNo(String acctNo)
    {
        this.acctNo = acctNo;
    }
    
    public void setbalance(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance+=amount;
    }
    
    public void withdraw(double amount)
    {
        balance-=amount;
    }
    
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
        String r = first + " " + last +" Account Number: "+ acctNo + " Balance: $"+ balance;
        return r;
    }
    
    
    
}
