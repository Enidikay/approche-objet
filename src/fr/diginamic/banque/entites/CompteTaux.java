package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    private int tauxRemu;

    public CompteTaux(int numCompte,double soldeCompte,int tauxRemu) {
        super(numCompte,soldeCompte);
        this.tauxRemu = tauxRemu;
    }

    @Override
    public String toString() {
        return "CompteTaux{" + "tauxRemu=" + tauxRemu + '}' + super.toString();
    }

    public int getTauxRemu() {
        return tauxRemu;
    }

    public void setTauxRemu(int tauxRemu) {
        this.tauxRemu = tauxRemu;
    }
}
