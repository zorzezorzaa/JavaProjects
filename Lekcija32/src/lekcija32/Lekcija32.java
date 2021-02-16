 package lekcija32;

import java.util.Arrays;
import java.util.Scanner;

public class Lekcija32 {
    public static void main(String[] args) {
        // Traziti od korisnika da unese tri realne vrednosti i
        // prikazati korisniku srednju vrednost.
        
        // Ovo je sa koriscenjem nizova;
        
        // TIP[] IME_PROMENJIVE = NEW TIP[BROJ_ELEMENATA];
        double[] niz = new double[3];

        // Nizovi imaju indekse pod kojima se cuvaju vrednosti.
        // Indeksi su: 0,1,2,... N-1, gde je N broj elemenata.
        
        // Za niz od 3 elementa: 0,1,2;
        
        // Broj elemenata niza saznajemo sa: niz.length;
        // Za pristup elementa niza na odredjenom indeksu, koristimo:
        // niz[INDEKS] = 13;
        // System.out.println(niz[INDEKS]);
        Scanner s = new Scanner(System.in);
        
        for(int indeks = 0; indeks<niz.length; indeks++) {
            System.out.print("Unesite vrednost " + (indeks+1) + ". el: ");
            double broj = s.nextDouble();
            s.nextLine();
            
            niz[indeks] = broj;
        }   
        // System.out.println(Arrays.toString(niz));
    
        // Obrada
        double suma = 0;
        for (double broj: niz) {
            suma += broj;
        }
        
        double srVr = suma/niz.length;
        
        // Izlaz
        System.out.print("Sr. vr. elementa " + Arrays.toString(niz));
        System.out.println(" je: " + srVr);
        
    }
    
}
