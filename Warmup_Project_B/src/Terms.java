
public class Terms 
{
    protected double coeff;
    protected int power;
    
    
    public Terms(double coeff, int power)
    {
        this.coeff=coeff;
        this.power=power;
        
        if(power<0)
        {
            throw new IllegalArgumentException("I sense negative degree, that is not allowed!");
        }
    }
    
    
    public String toString()
    {
        String r = coeff + "x^" + power;
        return r;
    }
}
