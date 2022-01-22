public class Bulb
{
    String manufacturer; //instance variables
    String partnumber;
    int wattage;
    int lumens;
    
    public String getManufacturer() //get and set methods 
    {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) 
    {
        this.manufacturer = manufacturer;
    }
    
    public String getPartnumber() 
    {
        return partnumber;
    }
    
    public void setPartnumber(String partnumber)
    {
        this.partnumber = partnumber;
    }
    
    public int getWattage() 
    {
        return wattage;
    }
    
    public void setWattage(int wattage) 
    {
        this.wattage = wattage;
    }
    
    public int getLumens() 
    {
        return lumens;
    }
    
    public void setLumens(int lumens) 
    {
        this.lumens = lumens;
    }
    
    public String toString() //overriding to  string method from class object
    {
        return manufacturer + "," + partnumber + "," + wattage + "," + lumens + "\n";
        
    }
    
    public boolean equals(Bulb b) //overriding the equals method
    {
        return this.manufacturer==b.manufacturer && this.partnumber==b.partnumber && this.wattage == b.wattage && this.lumens == b.lumens;
    }

    public Bulb(String manufacturer, String partnumber, int wattage, int lumens) 
    {
        super();
        this.manufacturer = manufacturer;
        this.partnumber = partnumber;
        this.wattage = wattage;
        this.lumens = lumens;
    }
    
  
    
    
}