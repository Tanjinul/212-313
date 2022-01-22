
public class PolyMain 
{
    public static void main(String[] args)
    {
        double A[] = {0,9,2};
        double B[] = {-7,2,5};
        
        
        
        PolynomialTest poly = new PolynomialTest(A);
        PolynomialTest poly2 = new PolynomialTest(B);
        
        PolynomialTest polyadd = poly.sum(poly2);
        PolynomialTest polysub = poly.diff(poly2);
       PolynomialTest polymult = poly.times(poly2);
        
        
//        poly.add(poly2);
//        System.out.print(poly.toString());
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
//        System.out.print (polyadd.toString());
//        System.out.println();
//        System.out.print(polysub.toString());
//        System.out.println();
//        System.out.print(A.length);
        System.out.print(polymult.toString());

        
       
    }

}
