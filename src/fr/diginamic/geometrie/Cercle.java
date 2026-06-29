package fr.diginamic.geometrie;

public class Cercle implements ObjetGeometrique{
    private Double rayon;

    public Cercle(Double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * this.rayon;
    }

    @Override
    public double surface() {
        return Math.PI * this.rayon * this.rayon;
    }

    public Double getRayon() {
        return rayon;
    }

    public void setRayon(Double rayon) {
        this.rayon = rayon;
    }
}
