import java.io.File;
import java.util.StringTokenizer;

public class Bulb 
{
    String manufacturer;
    String partnumber;
    int wattage;
    int lumens;
    
    public String getManufacturer() 
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
    
    public String toString()
    {
        return manufacturer + "," + partnumber + "," + wattage + "," + lumens + "\n";
        
    }
    
    public Bulb(String line)
    {
        int iterating = 0;
        String array[] = new String[4]; //declaring and allocating memory to the array
        
        StringTokenizer strToken = new StringTokenizer(line,",");
        
        while(strToken.hasMoreTokens())
        {
            array[iterating] = strToken.nextToken();
            iterating++;
        }
        
        manufacturer = array[0];
        partnumber = array[1];
        wattage = Integer.parseInt(array[2]);
        lumens = Integer.parseInt(array[3]);
    }
    
    public Bulb(String man, String parts, int watt, int Lumen)
    {
       manufacturer = man;
       partnumber = parts;
       wattage = watt;
       lumens = Lumen;
        
    }
    
    
}