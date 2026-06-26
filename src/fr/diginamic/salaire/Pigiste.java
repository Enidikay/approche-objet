package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    private int nombreJours;
    private double tarifJournalier;

    public Pigiste(String nom, String prenom, int nombreJours, double tarifJournalier) {
        super(nom, prenom);
        this.nombreJours = nombreJours;
        this.tarifJournalier = tarifJournalier;
    }

    @Override
    public double getSalaire() {
        return nombreJours * tarifJournalier;
    }

    @Override
    public String getStatut() {
        return "Pigiste";
    }


}
