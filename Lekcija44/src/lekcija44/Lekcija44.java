package lekcija44;

public class Lekcija44 {
    public static void main(String[] args) {
        Automobil a1 = new Automobil();
        
        a1.dopuniGorivo(25.0);
        
        a1.voznjaPoGradu(5.7);
        a1.voznjaNaOtvorenom(56.78);
        a1.voznjaPoGradu(9.11);
        a1.voznjaPoGradu(2.34); 
        
        System.out.println(a1.prosecnaPotrosnjaOdPoslednjeDOpune());
        
        a1.dopuniGorivo(15.0);
        
        a1.voznjaNaOtvorenom(10.0);
        a1.voznjaPoGradu(10.0);
        
        System.out.println(a1.prosecnaPotrosnjaOdPoslednjeDOpune());
    }
    
}
