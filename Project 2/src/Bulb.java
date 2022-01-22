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
    
    public Bulb(String c)
    {
        int counter = 0;
        String[] myArray = new String[4];

        StringTokenizer strToken = new StringTokenizer(c, ",");
        while(strToken.hasMoreTokens())
        {
            myArray[counter] = strToken.nextToken();
            counter++;
        }

        manufacturer = myArray[0];
        partnumber = myArray[1];
        wattage = Integer.parseInt(myArray[2]);
        lumens = Integer.parseInt(myArray[3]);
    }
    
    public Bulb( String m, String p, int w, int l)
    {
        manufacturer = m;
        partnumber = p;
        wattage = w;
        lumens = l;
    }
    
}

