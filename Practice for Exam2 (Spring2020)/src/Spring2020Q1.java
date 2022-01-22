
public class Spring2020Q1 
{
    public static void main(String[] args) {

        String items[] = {"100","cat","75","six"};
        for (int i = -1; i<items.length; i++)
        try {
        System.out.println("The answer is: "+Integer.parseInt(items[i])); //the parseInt parameter must be all decimal thus when I try inputting a word like cat it throws number format exception
        }
        catch (NumberFormatException nfe) {
        System.out.println("Oops! "+items[i]);
        }
        catch (ArrayIndexOutOfBoundsException aob){
        System.out.println("Bad array.");
        }
        catch (Exception e) {
        System.out.println("Oh, no!");
        }
       finally {
        System.out.println("Let’s go.");
       }
        }

}

/* Answer:
Bad array. (gets printed frist because the forloop is beginning from -1)
Let’s go.
The answer is: 100
Let’s go.
Oops! cat
Let’s go.
The answer is: 75
Let’s go.
Oops! six
Let’s go.
*/
