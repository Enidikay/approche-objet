package fr.diginamic.geometrie;

public class Rectangle implements ObjetGeometrique {

    private Double longueur;
    private Double largeur;

    public Rectangle(Double longueur, Double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }


    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }
}