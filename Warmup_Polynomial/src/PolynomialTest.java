/**
 * 
 * @author Tanjinul Hoque
 * Project: Warmup, polynomial class
 * Time finished: 7:21pm, September 27th
 *
 */

//input [1,2,3,4] means 1 + 2x + 3x^2 + 4x^3
public class PolynomialTest 
{
    
    double[] coeff;
    int deg;
    
    //delcaring a polynomial and putting it into an array
    public PolynomialTest(double[] polynomial)
    {
        int degree = polynomial.length-1;
        while(polynomial[degree]==0 && degree>0)
        {
            degree--;
        }
        deg = degree;
        if(deg<0)
        {
            throw new IllegalArgumentException("Degree is less than 0");
        }
        
        coeff = new double[polynomial.length];
        
        for(int i=0; i<polynomial.length; i++)
        {
            coeff[i] = polynomial[i];
        }
    }
    
    
    //getting the highest degree of a polynomial
    public int getDegree()
    {
        deg = coeff.length-1;
        if(deg<0)
        {
            throw new IllegalArgumentException("Degree less than 0");
        }
        else
        {
            while(coeff[deg]==0 && deg>0)
            {
                deg--;
            }
        }
        return deg;

        //starts from the end and everytime from the end the coeff is 0 there isnt a degree, thus the value of degree goes down. if the end of the array is suppose like [1,0,0,0,5] degree will be 4
        //since the highest degree is 4 which is 5x^4
        //did not end up using this since ended up using length for everything
        //the way I am doing it, degree less than 1 is not possible but incase you have an empty array
        // and you use getDegree then you will get teh message "Degree less than 0"
    }
    
    //[1,2,3,4] so the polynomials 1 + 2x + 3x^2 + 4x^3
    // so degree counter is at 1 and in the first iteration its 1*1 = 1 and degree counter is now num which is 2
    // on second iteration it is 2*2 = 4 and degreecounter is 2*2 because x*x so basically 2*2
    // and then it does the third one and then the 4th one
    public void evaluate(double num)
    {
        int answer = 0;
        int degreecounter = 1;
        
        for(int i=0; i<coeff.length; i++) //[0,1,2] -> 0 + 1x + 2x^2
        {
            answer += coeff[i]*degreecounter;
            degreecounter *= num;
        }
        
        System.out.println(answer);
    }
    
    //multiplying the polynomial with a constant
    // going through the array and then multiplying
    public void scale(double num)
    {
        double newarr[] = new double[coeff.length];
        
        for(int i=0; i<coeff.length; i++)
        {
            newarr[i] = coeff[i]*num;
        }
        
        coeff = newarr;
        //making the coeff (our polynomial) = newarr so basically changing p         
    }
    
    // p = p + q where p and q are the polynomials and p will change in the end
    // going throught the array, finding which one is longer and then making an array of that size
    // then at first adding elements from the shorter array to the new array
    // then adding the coeff's of the longer one of the 2 to the new array
    // since we want p to change at last just make p equals to the new array 
    public void add(PolynomialTest x)
    {
        int highdeg = coeff.length;
        
        if(x.coeff.length>highdeg)
        {
           highdeg = x.coeff.length; 
        }
        
        double[] resultarray = new double[highdeg];
        
        for(int i=0; i<coeff.length; i++)
        {
            resultarray[i]+=coeff[i];
        }
        
        for(int i=0; i<x.coeff.length; i++)
        {
            resultarray[i]+=x.coeff[i];
        }
        
       
        coeff = resultarray;
    }
    
    //p = p - q where p and q are polynomials and p will change by the end
    // the subtract method which follows the same thing as the add method
    // you just subtract.
    public void subtract(PolynomialTest x)
    {
        int highdeg = coeff.length;
        
        if(x.coeff.length>highdeg)
        {
           highdeg = x.coeff.length; 
        }
        
        //delcaring a new array so that we are not destroying the old one
        double[] resultarray = new double[highdeg];
        
        for(int i=0; i<coeff.length; i++)
        {
            resultarray[i]+=coeff[i];
        }
        
        for(int i=0; i<x.coeff.length; i++)
        {
            resultarray[i] = resultarray[i] - x.coeff[i];
        }
        
        coeff = resultarray;
    }
    
    // p = p * q where p and q are polynomials
    // So here declaring and getting the new array is basically taking the length of both the arrays multipying them and then -1
    // if the length which corresponds to the degree of first polynomial is 2 and the second one is also 2 means length of the
    // length of the result array will be 3*3 which is 6 
    // then you place it in the correct positions
    public void product(PolynomialTest x)
    {
        double[] resultarray = new double[coeff.length * x.coeff.length];
        
        for(int i=0; i<coeff.length; i++)
        {
            for(int j=0; j<x.coeff.length; j++)
            {
                resultarray[i+j] += coeff[i] * x.coeff[j];
            }
        }
        
        coeff = resultarray;
    }
    
    // adding two polynomial and then returning a new polynomial ->  r = p + q
    // This method is the same as the member methods except here we return as a Polynomial
    public PolynomialTest sum(PolynomialTest x)
    {
        int highdeg = coeff.length;
        
        if(x.coeff.length>highdeg)
        {
           highdeg = x.coeff.length; 
        }
        
        //declaring a new array with size matching to the larger degree
        double[] resultarray = new double[highdeg];
        
        for(int i=0; i<coeff.length; i++)
        {
            resultarray[i]+=coeff[i];
        }
        
        for(int i=0; i<x.coeff.length; i++)
        {
            resultarray[i]+=x.coeff[i];
        }
        
        //declaring a new polynomial with the resultarray
        
        PolynomialTest additionresult = new PolynomialTest(resultarray);
        return additionresult;
        
    }
    
    

    //subtracting one polynomial from another and then return a new polynomial r = p-q
    // This method is the same as the member methods except here we return as a Polynomial
    public PolynomialTest diff(PolynomialTest x)
    {
        int highdeg = coeff.length;
        
        if(x.coeff.length>highdeg)
        {
           highdeg = x.coeff.length; 
        }
        
        double[] resultarray = new double[highdeg];
        
        for(int i=0; i<coeff.length; i++)
        {
            resultarray[i]+=coeff[i];
        }
        
        for(int i=0; i<x.coeff.length; i++)
        {
            resultarray[i] = resultarray[i] - x.coeff[i];
        }
        
        PolynomialTest subtractionresult = new PolynomialTest(resultarray);
        return subtractionresult;
        
    }
    
    //multiplying two polynomials and then returning a new polynomial r = p*q
   // This method is the same as the member methods except here we return as a Polynomial
    public PolynomialTest times(PolynomialTest x)
    {
        double[] resultarray = new double[coeff.length * x.coeff.length];
        
        for(int i=0; i<coeff.length; i++)
        {
            for(int j=0; j<x.coeff.length; j++)
            {
                resultarray[i+j] += coeff[i] * x.coeff[j];
            }
        }
        
        PolynomialTest multiplicationresult = new PolynomialTest(resultarray);
        return multiplicationresult;
    }
    
    
    
    
    
    //tostring method to print the polynmial
    public String toString()
    {
        String s=" ";
        for(int i=0; i<coeff.length;i++)
        {
            if(coeff[i]==0)
            {
                s+="";
            }
            else if(i==0)
            {
                s+= coeff[0] + " ";
            }
            else if(coeff[i] < 0)
            {
                s+= " "+coeff[i]+"x^"+i; 
            }
            else if(coeff[i]>0)
            {
                s+= " +"+coeff[i]+"x^"+i;
            }
            
        }
        return s;
    }
    
    

    


    
    
    
    
    
    
    
}
