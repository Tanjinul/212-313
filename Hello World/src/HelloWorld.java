public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, Tanjinul");
    }

}

/*
public interface Flapping {
public static final int DEFAULT_WING_BEATS = 30;
public static final int DEFAULT_POPULATION = 10000;
public int wingBeats ();
public boolean flaps ();
}
*/

/*
public abstract class Animal {
 String species;
 int population;
 public Animal (String s, int p) {
 if (s == null || s=="")
 throw new InvalidAnimalException("Species must be given.");
 if (p<0)
 throw new InvalidAnimalException("Population cannot be negative");
 species = s;
 population =p;

 System.out.println("New animal, species is "+species+",
population "+population);
 }
 }
*/
/*
 public abstract class FlyingAnimal extends Animal implements Flapping {
 protected int wingBeatsPerSecond;
 public FlyingAnimal (String name, int population, int w) {
 super(name,population);
 if (w<1) throw new FlyingAnimalException("Wing beats must be greater than 0");
 else
 wingBeatsPerSecond = w;
 }
 public String toString() {
 return this.getClass().getName();
 }
 }
*/
/*
public class Bird extends FlyingAnimal {
30 private boolean flapping = true;
31 public Bird (String species) {
32 super (species, Flapping.DEFAULT_WING_BEATS,Flapping.DEFAULT_POPULATION);
33 }
34 public Bird (String species, int population, int wingBeats) {
35 super(species, population, wingBeats);
36
 System.out.println(this.toString()+" created, Species is "+
species+" wing beats = "+wingBeats);
37 }
38 public int wingBeats() {
39 return wingBeatsPerSecond;
40 }
41 public boolean flaps (){
42 return flapping;
43 }
44 }
*/