package lekcija38;


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
    
    public void saberi(Vektor v) {
        this.x += v.x;
        this.y += v.y;
    }
    
    
}
