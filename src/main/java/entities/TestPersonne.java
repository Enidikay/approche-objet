package main.java.entities;

import main.java.entities2.Personne;

public class TestPersonne {
    static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(25, "Place de la Comédie", 34000, "Montpellier");
        Personne pers1 = new Personne("Yildiz", "Kenan", adr1);
        Personne pers2 = new Personne("Guler", "Arda");
        System.out.println(pers1);
        System.out.println(pers2);
    }
}