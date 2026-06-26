package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args) {

        Maison maison = new Maison();

        maison.ajouterPiece(new Chambre(12, 1));
        maison.ajouterPiece(new Cuisine(15, 0));
        maison.ajouterPiece(new Salon(25, 0));
        maison.ajouterPiece(new WC(3, 0));

        System.out.println(maison.getSuperficieTotale());
        System.out.println(maison.getSuperficieParEtage(0));

        System.out.println(maison.getSuperficieParTypePiece("WC"));
        System.out.println(maison.getNbPiecesParTypePiece("WC"));
    }
}
