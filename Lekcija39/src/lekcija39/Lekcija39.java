package lekcija39;


public class Lekcija39 {
    
    public static void main(String[] args) {
        Vektor v1 = new Vektor(10.5, -4.1);
        Vektor v2 = new Vektor(6.7, 1.2); 

        
       
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        
        v1.saberi(v2);
        
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        
        v1.oduzmi(v2);
        
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        v1.skaliraj(0.5);
        
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        
        System.out.println("Intenzitet v1 = " + v1.intenzitet());
        System.out.println("Intenzitet v2 = " + v2.intenzitet());
        
        
    }
    
}
