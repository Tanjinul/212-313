
public class Spring2021Q34 {
    
    /* public interface Flapping 
     * {
         public static final int DEFAULT_WING_BEATS = 30;
         public static final int DEFAULT_POPULATION = 10000;
         public int wingBeats ();
         public boolean flaps ();
        }*/
    
    /*public abstract class Animal
     * {
         String species;
         int population;
        
         public Animal (String s, int p)
         {
             if (s == null || s=="")
                 throw new InvalidAnimalException("Species must be given.");
             if (p<0)
                 throw new InvalidAnimalException("Population cannot be negative");
             species = s;
             population =p;
        
             System.out.println("New animal, species is "+species+",population "+population);
         }
         
      }
        
        */
    
    /*
    public abstract class FlyingAnimal extends Animal implements Flapping 
    {
         protected int wingBeatsPerSecond;
         
         public FlyingAnimal (String name, int population, int w) 
         {
             super(name,population);
             if (w<1) 
                 throw new FlyingAnimalException("Wing beats < 1");
             else
             wingBeatsPerSecond = w;
         }
         
         public String toString() 
         {
             return this.getClass().getName();
         }
    }
        
        */
    
    /*
    public class Bird extends FlyingAnimal 
    {
         private boolean flapping = true;
         public Bird (String species)
         {
             super (species, Flapping.DEFAULT_WING_BEATS,Flapping.DEFAULT_POPULATION);
         }
         public Bird (String species, int population, int wingBeats, boolean f) 
         {
             super(species, population, wingBeats);
        
             System.out.println(this.toString()+" created, Species is "+species+" wing beats = "+wingBeats);
         }
         public int wingBeats() 
         {
             return wingBeatsPerSecond;
         }
         public boolean flaps ()
         {
         return flapping;
         }
     }
     */
   
    /*
    public class Bat extends FlyingAnimal 
    {
         private boolean flapping = false;
        
        public Bat (String species) 
        {
            super (species, Flapping.DEFAULT_WING_BEATS,Flapping.DEFAULT_POPULATION);
        }
        public Bat (String species, int population, int wingBeats, boolean f) 
        {
             super(species, population, wingBeats);
            
             System.out.println(this.getClass().getName()+" created, Species is "+species+" wing beats = "+wingBeats);
        }
        
             public int wingBeats() 
             {
                 return wingBeatsPerSecond;
             }
             public boolean flaps ()
             {
                 return flapping;
             }
    }                     
             */
    /*
    public class Main 
    {
        public static void main(String[] args) 
        {
            Bat igor=null;
            Bird robin;
           FlyingAnimal finch;
            Statement 1;
        }
    }
       */


}

/*
a. Statement1 is igor = new Bat("Vampire",1200,30);
New animal, Species is Vampire, population 1200
Bat created, Species is Vampire wingbeats = 30
b. Statement1 is igor = new Bat(null,1200,30,false);
Species must be given
c. Statement1 is robin = new Bird ("Robin",3000,50,true);
New animal, species is RObin, population = 3000
Bird created species is Robin wing beats = 50
d. Statement1 is robin = new Bird ("Robin");
New animal RObin, population 30
e. Statement1 is igor = new Bat ("",20,25);
Species must be given
f. Statement1 is finch = new FlyingAnimal ("Finch",5000,45);
Cannot instantiate the type FlyingAnimal
*/
