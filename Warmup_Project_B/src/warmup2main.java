
public class warmup2main 
{
    public static void main(String[] args)
    {
        Polynomial p = new Polynomial();
        p.insertsorted(new Terms(4,2));
        p.insertsorted(new Terms(2,0));
        p.insertsorted(new Terms(3,1));
//        p.insertsorted(new Terms(7,7));
        
        Polynomial q = new Polynomial();
        q.insertsorted(new Terms(4,2));
        q.insertsorted(new Terms(-2,1));
        q.insertsorted(new Terms(8,0));
//        q.insertsorted(new Terms(3,3));
//        q.insertsorted(new Terms(5,5));

//        System.out.println(p.toString());
//        System.out.println(q.toString());
        
        
        Polynomial c = new Polynomial();
        c = Polynomial.sum(p, q);
        
        Polynomial d = new Polynomial();
        d = Polynomial.sub(p, q);
        
        Polynomial e = new Polynomial();
        e = Polynomial.product(p, q);

//        p.add(q);
//        p.subtract(q);
//        p.multiply(q);
//        p.scale(2);
//        p.evaluate(2);
        
        System.out.print(c.toString());
        System.out.println();
        System.out.print(d.toString());
        System.out.println();
        System.out.print(e.toString());
    }





}
