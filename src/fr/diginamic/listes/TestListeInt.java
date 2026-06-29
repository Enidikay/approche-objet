package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {
    static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(-1, 5, 7, 3, -2, 4, 8, 5));

        System.out.println(list);
        System.out.println(list.size());

        Iterator<Integer> iterator = list.iterator();

        int max = list.getFirst();
        int min = list.getFirst();

        //Recherchez et affichez le plus grand élément de la liste

        for (int valeur : list) {
            if (valeur > max) {
                max = valeur;
            }

            if (valeur < min) {
                min = valeur;
            }
        }

        // Supprimez le plus petit élément de la liste et affichez le résultat

        while (iterator.hasNext()) {
            int valeur = iterator.next();

            if (valeur == min) {
                System.out.println(valeur);
                iterator.remove();
            }
        }

        // Recherchez tous les éléments négatifs et modifiez-les de manière à ce qu’ils deviennent positifs.

        for(int i = 0; i < list.size(); i++){
            if (list.get(i) < 0) {
                list.set(i, -list.get(i));
            }
        }

        System.out.println(list);
        System.out.println(max);
        System.out.println(min);


    }
}
