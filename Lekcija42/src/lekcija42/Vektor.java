package lekcija42;


// Klasa podataka
public class Vektor {
    // Clanovi podaci(privatni - dostupni samo u meotodama u ovoj klasi).
    
    private double x;
    private double y;
    
    // Generisani konstruktor
    public Vektor(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /// Geter: AKSESORI
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setter metode: mutatori
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vektor{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
    public void saberi(Vektor v) {
        this.x += v.x;
        this.y += v.y;
    }
    
    public void oduzmi(Vektor v) {
        this.x -= v.x;
        this.y -= v.y;
    }
    
    public void skaliraj(double faktor){
        this.x *= faktor;
        this.y *= faktor;
    }
    
    public double intenzitet() {
        return Math.hypot(x, y);
    }
    
    // Staticki metod moze da se pozove nad klasom, a nestaticki samo nad objektom klase!
    // Primer koji se ne koristi u praksi za zamenu vrednosti clanova podataka
    // Dat je samo kao ilustracija primera staticnog metoda!!!
    public static void zamenaClanova(Vektor a, Vektor b) {
        double tempX = a.x;
        a.x = b.x;
        b.x = tempX;
        
        double tempY = a.y;
        a.y = b.y;
        b.y = tempY;
    }
}
