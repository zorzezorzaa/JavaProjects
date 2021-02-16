package lekcija40;

public class Lekcija40 {
    public static void main(String[] args) {
        Vektor[] niz = new Vektor[5];
        
        double[] brojevi = new double[100];
        niz[0] = new Vektor(1, 2);
        niz[1] = new Vektor(2, 3);
        niz[2] = new Vektor(3, 4);
        niz[3] = new Vektor(4, 5);
        niz[4] = new Vektor(5, 6);
        
        // 1. Zbir svih vektora
        Vektor suma = new Vektor(0, 0);
        for (Vektor v : niz) {
            suma.saberi(v);
        }
        System.out.println("1) Zbir svih vektora je: " + suma);
        
        // 2. Zbir Intenziteta svih vektora 
        double sumaIntenziteta = 0;
        for(Vektor v: niz) {
            sumaIntenziteta += v.intenzitet();
        }
        System.out.println("2) Zbir intenziteta svih vektora je: " + sumaIntenziteta);
        
        // 3. Srednja vrednost intenziteta svih vektora
        double srVrInt = sumaIntenziteta/niz.length;
        System.out.println("Srednja vrednost intenziteta svih vektora je: " + srVrInt);
        
        // 4. Najmanji intenzitet vektora
        double minI = niz[0].intenzitet();
        for(Vektor v: niz) {
            if (v.intenzitet() < minI) {
                minI = v.intenzitet();
            }
        }
        System.out.println("Najmanji intenzitet vektora je: " + minI);
        // 5. Najveci intenzitet vektora
        // 6. Dva vektora koji su najvise udaljeni jedan od drugog
        // 7. Sortirati niz vektora 
        
    }
    
}
