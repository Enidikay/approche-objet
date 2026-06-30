package fr.diginamic.fichiers;

public class Ville {
    private String nomVille;
    private String codeDepartement;
    private String nomRegion;
    private int popuTotale;

    public Ville(String nomVille, String codeDepartement, String nomRegion, int popuTotale) {
        this.nomVille = nomVille;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.popuTotale = popuTotale;
    }

    public String toCsv(){
        return nomVille +" ; "+ codeDepartement +" ; "+ nomRegion +" ; "+ popuTotale;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nomVille='" + nomVille + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", popuTotale=" + popuTotale +
                '}';
    }

    public String getNomVille() {
        return nomVille;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopuTotale() {
        return popuTotale;
    }



}
