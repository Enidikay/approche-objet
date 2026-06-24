package main.java.entities;

public class TestAdressePostale {
    static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(25,"Place de la Comédie", 34000, "Montpellier");
        adr1.displayAdresse();
    }
}
