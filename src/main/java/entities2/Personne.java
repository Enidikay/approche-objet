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
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }
}