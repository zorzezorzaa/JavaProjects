package lekcija43;

public class Student {
    private String ime;
    private String prezime;
    private String imeRoditelja;
    private String jmbg;
    private int godinaUpisa;
    private int godinaStudija;
    private boolean diplomirao;
    private double prosek;

    public Student(String ime, String prezime, String imeRoditelja, String jmbg, int godinaUpisa) {
        this.ime = ime;
        this.prezime = prezime;
        this.imeRoditelja = imeRoditelja;
        this.jmbg = jmbg;
        this.godinaUpisa = godinaUpisa;
        this.godinaStudija = 1;
        this.diplomirao = false;
        this.prosek = 0.0;
        
    }
    // Ovo su GENERISANE METODE

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getImeRoditelja() {
        return imeRoditelja;
    }

    public void setImeRoditelja(String imeRoditelja) {
        this.imeRoditelja = imeRoditelja;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public boolean isDiplomirao() {
        return diplomirao;
    }

    public void setDiplomirao(boolean diplomirao) {
        this.diplomirao = diplomirao;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    @Override
    public String toString() {
        return "Student{" + "ime=" + ime + ", prezime=" + prezime + ", imeRoditelja=" + imeRoditelja + ", jmbg=" + jmbg + ", godinaUpisa=" + godinaUpisa + ", godinaStudija=" + godinaStudija + ", diplomirao=" + diplomirao + ", prosek=" + prosek + '}';
    }
    
    // Sopstvene metode: 
}
