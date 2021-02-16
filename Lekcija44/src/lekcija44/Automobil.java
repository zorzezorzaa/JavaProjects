package lekcija44;

public class Automobil {
    private double rezervoar = 0.0;
    private double predjenaKm = 0.0;
    
    private double stanjePredjeneKmPPD = 0.0;
    private double stanjeRezervoaraPPD = 0.0;
    private double iznosPD = 0.0;
    

    public double getRezervoar() {
        return rezervoar;
    }

    public double getPredjenaKm() {
        return predjenaKm;
    }

    public void dopuniGorivo(double kolicina) {
      stanjeRezervoaraPPD = rezervoar;
       stanjePredjeneKmPPD = predjenaKm;
      iznosPD = kolicina;
      
      rezervoar += kolicina;
    }
    
    public double prosecnaPotrosnjaOdPoslednjeDOpune() {
        double predjeniPutOdPD =  predjenaKm - stanjePredjeneKmPPD;
        double potrosenoGorivaOdPD = stanjeRezervoaraPPD + iznosPD - rezervoar;
        return potrosenoGorivaOdPD * 100 / predjeniPutOdPD;
    }
    
    public void voznjaPoGradu(double predjeniPut) {
        predjenaKm += predjeniPut;
        rezervoar -= predjeniPut * 7.0/100;
    }
    public void voznjaNaOtvorenom(double predjeniPut) {
        predjenaKm += predjeniPut;
        rezervoar -= predjeniPut * 5.3/100;
    }    
    // predjeniPutOdPD =  predjenaKm - stanjePredjeneKmPPD
    // potrosenoGorivaOdPD = stanjeRezervoaraPPD + iznosPD - rezervoar;
    // potrosnja = potrosenoGorivaOdPD * 100 / predjeniPutOdPD;
}
