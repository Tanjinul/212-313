/*
 * Part a:

Write a class Distance with the following specifications:
    Two instance variables: feet and inches that can be stored as integers;
    a private constant called INCHES_IN_A_FOOT with a value 12;
    a no argument constructor to initialize a Distance with zero feet, zero inches. 

Part b:

Add a two argument constructor that will accept two positive integers and for feet and inches and will initialize the instance variables. The number of feet and inches may be any integer value.
access (�get�) methods for the instance variables;
mutator (�set�) methods for instance variables.

Part c:

Add a method �add� that accepts another Distance object as a parameter and adds the Distance of the other object to the current Distance.
That is, 
    w1 = new Distance(4,9);
    w2 = new Distance (3,6);
    w1.add(w2);              // w1 becomes 8 feet, 3 inches

Part d:
Add a public method �MetricDistance()� that will return the number of meters in the distance represented by the object. This method should contain a private variable representing the number of feet in a meter (1 foot = 0.3048 meters).

 */
public class Distance 
{
    private static int INCHES_IN_A_FOOT = 12;
    private static float FEET_IN_A_METER = 0.3048f;
    
    int feet;
    int inches;
    
    public Distance()
    {
        feet=0;
        inches=0;
    }
    
    public Distance(int f, int i)
    {
        if(i>11)
        {
            throw new IllegalArgumentException("Inches cannot be more than 11");
        }
        
        f=feet;
        i=inches;
    }
    
    public int getfeet()
    {
        return feet;
    }
    public int getinches()
    {
        return inches;
    }
    
    public void setfeet(int f)
    {
        this.feet=f; // can also do feet=f
    }
    public void setinches(int i)
    {
        if(i>11)
        {
            throw new IllegalArgumentException("Inches cannot be more than 11");
        }
        
        this.inches=i; // can also do inches = i
    }
    
    public void add(Distance other)
    {
        this.feet += other.feet + (this.inches + other.inches)/12;
        this.inches += (this.inches + other.inches)/12;
    }
    
    public float metricDistance()
    {
     return    (feet+inches/12) / FEET_IN_A_METER;
    }
    
    
    

}
