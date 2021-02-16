package lekcija42;
 
import java.util.Scanner;


public class Lekcija42 {
    public static void main(String[] args) {
      Vektor[] niz = new Vektor[5];
        
        double[] brojevi = new double[100];
        niz[0] = new Vektor(1, 2);
        niz[1] = new Vektor(2, 3);
        niz[2] = new Vektor(3, 4);
        niz[3] = new Vektor(4, 5);
        niz[4] = new Vektor(5, 6);
        
        // 4. Sortirati niz vektora po intenzitetu
        
        for( int i=0; i<niz.length-1;i++) {
            for(int j=0; j<niz.length-1;j++) {
                if(niz[1].intenzitet() > niz[j+1].intenzitet()) {
                    // Vektor temp = new Vektor(niz[j].getX(), niz[j].getY());
                    Vektor.zamenaClanova(niz[j], niz[j+1]);
                }
            }
        }
        for(Vektor v: niz){
            System.out.println(v + "; intenzitet je " + v.intenzitet());
        }
    }
    
}
