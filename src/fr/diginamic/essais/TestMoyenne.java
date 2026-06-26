package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {

        CalculMoyenne moyenne1 = new CalculMoyenne();
        moyenne1.ajout(10);
        moyenne1.ajout(15);
        moyenne1.ajout(20);

        System.out.println("Moyenne 1 : " + moyenne1.calculMoyenne());

        CalculMoyenne moyenne2 = new CalculMoyenne();
        moyenne2.ajout(5);
        moyenne2.ajout(7);
        moyenne2.ajout(9);
        moyenne2.ajout(11);

        System.out.println("Moyenne 2 : " + moyenne2.calculMoyenne());
    }
}