package lekcija45;
public class Test {
    private String predmet, naziv;
    private int brojPitanja;
    private double brojTacnihOdgovora;
    
    public enum StatusTesta{NIJE_POLOZEN, USLOVNO_POLOZEN, POLOZEN};

    public Test(String predmet, String naziv, int brojPitanja, double brojTacnihOdgovora) {
        this.predmet = predmet;
        this.naziv = naziv;
        this.brojPitanja = brojPitanja;
        this.brojTacnihOdgovora = brojTacnihOdgovora;
    }

    public String getPredmet() {
        return predmet;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getBrojPitanja() {
        return brojPitanja;
    }

    public double getBrojTacnihOdgovora() {
        return brojTacnihOdgovora;
    }
    
    public double getBrojPoena(){
        return 30.0 * brojTacnihOdgovora/brojPitanja;
    }
    public StatusTesta getStatusTesta() {
        double brojPoena = getBrojPoena();
        
        if(brojPoena<11) {
            return StatusTesta.NIJE_POLOZEN;
        }
        if(brojPoena<17) {
            return StatusTesta.USLOVNO_POLOZEN;
        }
        return StatusTesta.POLOZEN;
    }

    @Override
    public String toString() {
        return predmet + "\t" +
                naziv + "\t" +
                brojTacnihOdgovora + "/" + brojPitanja + "\t" +
                getBrojPoena() + "\t" +
                getStatusTesta();
    }
    
    
}
