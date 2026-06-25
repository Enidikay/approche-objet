package fr.diginamic.operations;

public class CalculMoyenne {
    private double[] notes;

    public CalculMoyenne() {
        this.notes = new double[0];
    }

    public void ajout(double valeur) {

        double[] newTable = new double[notes.length + 1];

        for (int i = 0; i < notes.length; i++) {
            newTable[i] = notes[i];
        }

        newTable[notes.length] = valeur;
        notes = newTable;
    }

    public double calculMoyenne() {
        double somme = 0;
        for (int i = 0; i < notes.length; i++) {
            somme += notes[i];
        }

        return somme / notes.length;
    }
}
