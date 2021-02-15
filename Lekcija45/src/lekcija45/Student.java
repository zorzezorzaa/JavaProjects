package lekcija45;

public class Student {
    private String ime, prezime, indeks, email;
    private int godinaUpisa;
    private Test[] testovi;
    private int indeksSledecegTesta = 0;
    
    final private int MAX_TESTOVA = 400;

    public Student(String ime, String prezime, String indeks, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
        this.email = email;
        
        String godinaUpisaStr = indeks.substring(0, 4); // "2008213514" -> "2008"
        this.godinaUpisa = Integer.parseInt(godinaUpisaStr);
        this.testovi = new Test[MAX_TESTOVA];
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIndeks() {
        return indeks;
    }

    public String getEmail() {
        return email;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }
    
    public void evidentirajTest(Test t) {
        if(indeksSledecegTesta >= MAX_TESTOVA) { 
            return;
        }
        this.testovi[indeksSledecegTesta++] = t;                                    
    }
    public int getBrojEvidentiranihTestova(){
        return this.indeksSledecegTesta;
    }

    @Override
    public String toString() {
        String podaciOStudentu = ime + " " + prezime + "\t" +
                                  "(" + indeks + ")\t" + // TAB
                                  "<" + email + ">\n";
        
        String rezultatiTestova = "";
        
        for(int i=0; i<getBrojEvidentiranihTestova(); i++) {
            Test t = testovi[i];
            rezultatiTestova += t + "\n";
        }
        return podaciOStudentu + rezultatiTestova;
    }
    
}
