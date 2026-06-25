package fr.diginamic.banque.entites;

public class TestBanque {
    static void main(String[] args) {
        Compte compte1 = new Compte(5508940, 5253.509);
        CompteTaux compte2 = new CompteTaux(85050566,50.50,10);

        Compte[] tableau = new Compte[2];
        tableau[0] = compte1;
        tableau[1] = compte2;

        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i] + "\n");
        }


    }
}
