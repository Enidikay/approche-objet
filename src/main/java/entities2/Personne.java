package main.java.entities2;

import main.java.entities.AdressePostale;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adresse;


    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void displayInfo(){
        displayPersonne();
        adresse.displayAdresse();
    }
    public void displayPersonne() {
        System.out.println(nom + " " + prenom);
    }
}


