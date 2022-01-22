
public class Spring2020Q2 
{
    public static void main (String[] args) {
        Alpha myArray [] = new Alpha[5];
        myArray[0] = new Beta(7);
        myArray[1] = new Beta(10);
        myArray[2] = new Gamma(15);
        myArray[3] = new Gamma(16);
        myArray[4] = new Gamma(17);
        }
       }
       /*public class Alpha {
        public Alpha(int x) {
        super();
        System.out.println("I am Alpha, and x is "+x);
        }
       }
       public class Beta extends Alpha {
        public Beta (int y) {
        super(y+3);
        System.out.println("I am Beta, and y is "+y);
        }
       }
       public class Gamma extends Alpha {
        public Gamma (int y){
        super(y+5);
        y++;
        System.out.println("I am Gamma and y is "+y);
        } 
}*/

/*
Answers:
myArray[0] = I am Alpha and x is 10 | I am Beta and y is 7 // in this case "|" means the thing following will be printed in a new line 
myArray[1] = I am Alpha and x is 13 | I am Beta and y is 10
myArray[2] = I am Alpha and x is 20 | I am Gamma and y is 16
myArray[3] = I am Alpha and x is 21 | I am Gamma and y is 17
myArray[4] = I am Alpha and x is 22 | I am Gamma and y is 18

actual answer:
I am Alpha, and x is 10
I am Beta, and y is 7
I am Alpha, and x is 13
I am Beta, and y is 10
I am Alpha, and x is 20
I am Gamma and y is 16
I am Alpha, and x is 21
I am Gamma and y is 17
I am Alpha, and x is 22
I am Gamma and y is 18

whenever the super class is called inside another constructer it means that the stuff from extended class will be called and performed.
*/