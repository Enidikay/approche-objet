package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        String greatest = list.getFirst();
        for (String valeur : list){
            if (valeur.length() > greatest.length()){
                greatest = valeur;
            }
        }

        for (int i = 0; i < list.size(); i++){
            list.set(i,list.get(i).toUpperCase());
        }

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String valeur = iterator.next();
            if (valeur.charAt(0) == 'N'){
                iterator.remove();
            }
        }

        System.out.println(greatest);
        System.out.println(list);
    }
}
