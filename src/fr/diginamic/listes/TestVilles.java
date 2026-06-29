package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVilles {
    static void main(String[] args) {
        ArrayList<Ville> list = new ArrayList<>();
        list.add(new Ville("Nice", 343_000));
        list.add(new Ville("Carcassonne", 47_800));
        list.add(new Ville("Narbonne", 53_400));
        list.add(new Ville("Lyon", 484_000));
        list.add(new Ville("Foix", 9_700));
        list.add(new Ville("Pau", 77_200));
        list.add(new Ville("Marseille", 850_700));
        list.add(new Ville("Tarbes", 40_600));

        int max = list.getFirst().getNbHabitant();
        String ville = list.getFirst().getNom();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNbHabitant() > max) {
                max = list.get(i).getNbHabitant();
                ville = list.get(i).getNom();
            }
        }

        int min = list.getLast().getNbHabitant();
        Iterator<Ville> iterator = list.iterator();

        while (iterator.hasNext()) {
            Ville valeur = iterator.next();

            // Vérifie si la ville a + de 100k habitants
            if (valeur.getNbHabitant() >= 100_000) {
                valeur.setNom(valeur.getNom().toUpperCase());
            }

            //supprime la ville la plus petite de la liste
            if (valeur.getNbHabitant() < min) {
                min = valeur.getNbHabitant();
                System.out.println(valeur);
                iterator.remove();
            }
        }

        System.out.println(ville);
        System.out.println(min);
        System.out.println(list);
    }
}
