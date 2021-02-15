package lekcija45;

public class Lekcija45 {
    public static void main(String[] args) {
        
        Student s = new Student("Pera", 
                                "Peric", 
                                "2009700900", 
                                "pera.peric.09@singimail.rs");
        
        s.evidentirajTest(new Test("Osnove programiranja - Java", "1. kolokvijum", 50, 43.5));
        s.evidentirajTest(new Test("Osnove programiranja - Java", "2. kolokvijum", 30, 15.0));
        s.evidentirajTest(new Test("Baze podataka", "1. kolokvijum", 20, 19.0));
        s.evidentirajTest(new Test("Operativni sistemi", "Ispitni zadatak", 100, 87.75));
        
        System.out.println(s);
        
    }
}
