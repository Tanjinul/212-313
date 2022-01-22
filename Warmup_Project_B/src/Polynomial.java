
public class Polynomial 
{
    private  Node head;
    
    private int degree;

   
    public Polynomial()
    {
        head = new Node(); // dummy node
    }
    
    //inserting the terms of my polynomial in sorted order
    public void insertsorted(Terms t)
    {
        Node curr = head.next;
        Node prev = head;
        
        while((curr!=null) && (curr.term.power<t.power)) //5,1 [null 9,1 9,2 9,3 9,4 9,5]    
        {
            prev = curr;
            curr = curr.next;
        }
        
        prev.next = new Node(t,curr);
    }
    
    
    //Polynomial addition and returning a whole new polynomial
    public static Polynomial sum(Polynomial a, Polynomial b)
    {
        
        Polynomial x = new Polynomial();
        
        Node p1 = a.head.next;
        Node p2 = b.head.next;
        
        while (p1 != null || p2 != null) //while both the polynomials are not empty
        {
            if(p1 == null)// if the first one is empy, add second polynomial in
            {
                Terms t = new Terms(p2.term.coeff,p2.term.power);
                x.insertsorted(t);
                p2 = p2.next;
            }
            else if(p2 == null) // this is the same as if the second polynomial is empty so we add everything from the first one
                //into our new polynomial
            {
                Terms t = new Terms(p1.term.coeff,p1.term.power);
                x.insertsorted(t);
                p1 = p1.next;
            }
            else if(p1.term.power == p2.term.power) //this is when the power's of both the polynomials are the same, you add them
            {
                Terms t = new Terms(p1.term.coeff+p2.term.coeff,p1.term.power); //creating the new term
                x.insertsorted(t); // putting it inside my polynomial
                p1 = p1.next;//moving p1
                p2 = p2.next;//moving p2
            }
            else if (p1.term.power> p2.term.power) //if there is point where the powers dont match and term of p1 is higher
                //add it into our new polynomial, since there are no same powers we dont add the coefficients
            {
                Terms t = new Terms(p1.term.coeff,p1.term.power);
                x.insertsorted(t);
                  
                p1 = p1.next;
                  
            }
            else if(p2.term.power > p1.term.power) //if there is a point in the polynomial where the power of the second polynomial is bigger than the 
                //power in the first polynomial then we just insert it as it is
            {
                Terms t = new Terms(p2.term.coeff,p2.term.power);
                x.insertsorted(t);
                  
                p2 = p2.next;
            }
            
        }
        return x; //returning polynomial
    }
    
    //Polynomial subtraction
    public static Polynomial sub(Polynomial a, Polynomial b)
    {
        
        Polynomial x = new Polynomial();
        
        Node p1 = a.head.next;
        Node p2 = b.head.next;
        
        while (p1 != null || p2 != null)
        {
            if(p1 == null) // This part is the same as add since if there is a whole empty polynomial we just  insert all the stuff from polynomial 2
            {
                Terms t = new Terms(p2.term.coeff*-1,p2.term.power);
                x.insertsorted(t);
                p2 = p2.next;
            }
            else if(p2 == null) // putting everything from polynomial 1 if polynomial 2 is empty
            {
                Terms t = new Terms(p1.term.coeff,p1.term.power);
                x.insertsorted(t);
                p1 = p1.next;
            }
            else if(p1.term.power == p2.term.power) // if the terms are the same, we subtract the coefficients
            {
                Terms t = new Terms(p1.term.coeff-p2.term.coeff,p1.term.power);
                x.insertsorted(t);
                p1 = p1.next;
                p2 = p2.next;
            }
            else if (p1.term.power > p2.term.power)
            {
                Terms t = new Terms(p1.term.coeff,p1.term.power);
                x.insertsorted(t);
                  
                p1 = p1.next;
                  
            }
            else if(p1.term.power < p2.term.power) // if the power is larger than the first one then multiply by negative 1
            {
                Terms t = new Terms(p2.term.coeff*-1,p2.term.power);
                x.insertsorted(t);
                  
                p2 = p2.next;
            }
            
        }
        
        return x;
    }
    
    
    // multiplying 2 polynomials but then we get like terms, so we also have to add the like terms
    public static Polynomial product(Polynomial a, Polynomial b)
    {
       Polynomial x = new Polynomial();
        
       Node p1 = a.head.next;
       Node p2 = b.head.next;
       
       Node temp;
       
       while (p1 != null) //multiplying the terms
       {
           while (p2 != null)
           {
               Terms t = new Terms(p1.term.coeff*p2.term.coeff,p1.term.power+p2.term.power);
               x.insertsorted(t);
               
               p2 = p2.next;
           }
           
           p2 = b.head.next;
           
           p1 = p1.next;
       }
       
       //After this, the terms are multiplied but the like terms are not added. We need to add the like terms.
       //pointing to the new polynomials head and then traversing through it
       
       Node p3 = x.head.next;
       
       while (p3 != null && p3.next != null) 
       {
           temp = p3;
    
           while (temp.next != null) 
           {
    
               if (p3.term.power == temp.next.term.power) //if the power is the same then you add the coefficients 
               {
    
                   p3.term.coeff = p3.term.coeff + temp.next.term.coeff;
                   
                   temp.next = temp.next.next;
    
               }
               else
                   temp = temp.next;
           }
           p3 = p3.next;
       }
                  
       return x;
    }
    
    
    public void add(Polynomial a)
    {
        Node p1 = this.head.next;
        Node p2 = a.head.next;
        
        Polynomial x = new Polynomial();
        
        while (p1 != null || p2 != null) //while both the polynomials are not empty
        {
            if(p1 == null) // if the first one is empty, just insert the second one and break from the loop till the second one is empty
                //this condition is for when the first polynomial is completely empty so we just put all the stuff from the second polynomial
                //into the first one
            {
                Terms t = new Terms(p2.term.coeff,p2.term.power);
                x.insertsorted(t);
                p2 = p2.next;
                break; //breaking out of the loop and doing it over again
            }
            else if(p2 == null) // this is the same as if the second polynomial is empty so we add everything from the first one
                //into our new polynomial
            {
                Terms t = new Terms(p1.term.coeff,p1.term.power);
                x.insertsorted(t);
                p1 = p1.next;
                break;
            }
            else if(p1.term.power == p2.term.power) //this is when the power's of botht the polynomials are the same, you add them
            {
                Terms t = new Terms(p1.term.coeff+p2.term.coeff,p1.term.power); //creating the new term
                x.insertsorted(t); // putting it inside my polynomial
                p1 = p1.next;//moving p1
                p2 = p2.next;//moving p2
            }
            else if (p1.term.power> p2.term.power) //if there is point where the powers dont match and term of p1 is higher
                //add it into our new polynomial, since there are no same powers we dont add the coefficients
            {
                Terms t = new Terms(p1.term.coeff,p1.term.power);
                x.insertsorted(t);
                  
                p1 = p1.next;
                  
            }
            else if(p2.term.power > p1.term.power) //if there is a point in the polynomial where the power of the second polynomial is bigger than the 
                //power in the first polynomial then we just insert it as it is
            {
                Terms t = new Terms(p2.term.coeff,p2.term.power);
                x.insertsorted(t);
                  
                p2 = p2.next;
            }
            
        }
               
        //Now we gotta do the p = p+q part, just replace p with the new polynomial
        this.head.next = null; //clearing the current polynomial
              
        for(Node curr = x.head.next; curr!= null; curr = curr.next) //adding stuff into the cleared polynomial from our result polynomial
        {
            Terms t = new Terms(curr.term.coeff,curr.term.power);
            this.insertsorted(t);
        }
          
    }
    
    public void subtract(Polynomial a)
    {
        
        Polynomial x = new Polynomial();
        
        Node p1 = this.head.next;
        Node p2 = a.head.next;
        
        while (p1 != null || p2 != null)
        {
            if(p1 == null) // This part is the same as add since if there is a whole empty polynomial we just  insert all the stuff from polynomial 2
            {
                Terms t = new Terms(p2.term.coeff*-1,p2.term.power);
                x.insertsorted(t);
                p2 = p2.next;
            
            }
            else if(p2 == null) // putting everything from polynomial 1 if polynomial 2 is empty
            {
                Terms t = new Terms(p1.term.coeff,p1.term.power);
                x.insertsorted(t);
                p1 = p1.next;
               
            }
            else if(p1.term.power == p2.term.power) // if the terms are the same, we subtract the coefficients
            {
                Terms t = new Terms(p1.term.coeff-p2.term.coeff,p1.term.power);
                x.insertsorted(t);
                p1 = p1.next;
                p2 = p2.next;
            }
            else if (p1.term.power > p2.term.power)
            {
                Terms t = new Terms(p1.term.coeff,p1.term.power);
                x.insertsorted(t);
                  
                p1 = p1.next;
                  
            }
            else if(p1.term.power < p2.term.power) // if the power is larger than the first one then multiply by negative 1
            {
                Terms t = new Terms(p2.term.coeff*-1,p2.term.power);
                x.insertsorted(t);
                  
                p2 = p2.next;
            }
            
        }
        

        
        this.head.next = null;
        
        
        for(Node curr = x.head.next; curr!= null; curr = curr.next)
        {
            Terms t = new Terms(curr.term.coeff,curr.term.power);
            this.insertsorted(t);
        }
               
    }
    
    public void multiply(Polynomial a)
    {
        Polynomial x = new Polynomial();
        
        Node p1 = this.head.next;
        Node p2 = a.head.next;
        
        Node temp;
        
        while (p1 != null) //multiplying the terms
        {
            while (p2 != null)
            {
                Terms t = new Terms(p1.term.coeff*p2.term.coeff,p1.term.power+p2.term.power);
                x.insertsorted(t);
                
                p2 = p2.next;
            }
            
            p2 = a.head.next;
            
            p1 = p1.next;
        }
        
        //After this, the terms are multiplied but the like terms are not added. We need to add the like terms.
        //pointing to the new polynomials head and then traversing through it
        
        Node p3 = x.head.next;
        
        while (p3 != null && p3.next != null) 
        {
            temp = p3;
     
            while (temp.next != null) 
            {
     
                if (p3.term.power == temp.next.term.power) //if the power is the same then you add the coefficients 
                {
     
                    p3.term.coeff = p3.term.coeff + temp.next.term.coeff;
                    
                    temp.next = temp.next.next;
     
                }
                else
                    temp = temp.next;
            }
            p3 = p3.next;
        }
                   
        //p = p+q
        this.head.next = null;
        
        for(Node curr = x.head.next; curr!= null; curr = curr.next)
        {
            Terms t = new Terms(curr.term.coeff,curr.term.power);
            this.insertsorted(t);
        }   
    }
    
    public void scale(double a)
    {
        for(Node curr = this.head.next; curr!= null; curr = curr.next)
        {
            curr.term.coeff = curr.term.coeff*a;
        }
    }
    
    public void evaluate(double a)
    {
       double answer = 0;
       
       for(Node curr = this.head.next; curr!= null; curr = curr.next)
       {
           int power = curr.term.power;
           double powersum = 1;
           
           while(power!=0) //multiplying the number by itself ot first get the result of the power
           {
               powersum = powersum * a;
               power--;
           }
           
           answer = answer + curr.term.coeff*powersum;
       }
       
       
       System.out.print(answer);
    }
    
    //tostring for printing, it does get overwritten later on from my term class
    public String toString() 
    {
        Node p = head.next;
        String returnString = "";
        while (p != null) {
            returnString += p.term + " ";
            p = p.next;
        }
        return returnString;
    }
    
    

    
    

       
    
  

    
    
     
}
