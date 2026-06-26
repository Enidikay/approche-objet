package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

    public static void main(String[] args) {

        Salarie salarie = new Salarie("Dupont", "Jean", 2500.0);
        System.out.println("Salaire salarié : " + salarie.getSalaire());

        Pigiste pigiste = new Pigiste("Martin", "Sophie", 12, 150.0);
        System.out.println("Salaire pigiste : " + pigiste.getSalaire());

        salarie.afficherDonnees();
        pigiste.afficherDonnees();
    }
}