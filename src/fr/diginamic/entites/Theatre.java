package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capMax;
    private int totalClient;
    private double recetteTotale;


    public Theatre(String nom, int capMax, int totalClient, double recetteTotale) {
        this.nom = nom;
        this.capMax = capMax;
        this.totalClient = totalClient;
        this.recetteTotale = recetteTotale;
    }

    public void inscrire(int nbClient, double prixPlace){
        if (totalClient < capMax){
            totalClient += nbClient;
            recetteTotale += prixPlace;
        } else {
            System.out.println("Capacité maximale atteinte.");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getTotalClient() {
        return totalClient;
    }

    public void setTotalClient(int totalClient) {
        this.totalClient = totalClient;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }

    public void setRecetteTotale(double recetteTotale) {
        this.recetteTotale = recetteTotale;
    }
}
