
public class PolyMain 
{
    public static void main(String[] args)
    {
        double A[] = {1,5,7};
        double B[] = {8,12,0,2};
        
        
        
        Polynomial poly = new Polynomial(A);
        Polynomial poly2 = new Polynomial(B);
        
        Polynomial polyadd = poly.sum(poly2);
        Polynomial polysub = poly.diff(poly2);
        Polynomial polymult = poly.times(poly2);
        
        
//        poly.add(poly2);
//        System.out.print(poly.toString());
//        System.out.println();
//        poly.scale(2);
//        System.out.print(poly.toString());
//        
//        poly.subtract(poly2);
//        System.out.print(poly);
//        poly.product(poly2);
//        System.out.print(poly.toString());
//        System.out.println();
        
//        poly.evaluate(2);
        
        
        
//        int getdeg = poly.getDegree();
////        int getdeg2 = poly2.getDegree();
//        System.out.println(getdeg);
////        System.out.println(getdeg2);
////        
//        double[] scaled = poly.scale(2);
////        
//        for(int i=0; i<A.length; i++)
//        {
//            System.out.println(scaled[i]+" ");
//        }
//        
        System.out.print (polyadd.toString());
        System.out.println();
        System.out.print(polysub.toString());
        System.out.println();
        System.out.print(polymult.toString());
//      System.out.print(A.length);
        
       
    }

}
