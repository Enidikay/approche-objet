package main.java.entities;

public class AdressePostale {
    int numRue;
    String libelle;
    int codePostal;
    String ville;


    public AdressePostale(int numRue, String libelle, int codePostal, String ville) {
        this.numRue = numRue;
        this.libelle = libelle;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public void displayAdresse(){
        System.out.println(numRue +" "+ libelle +" " + codePostal +" "+ ville + "\n");
    }


}

