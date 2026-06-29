package fr.diginamic.listes;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class FusionListe {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> liste3 = new ArrayList<String>();

        Iterator<String> iterator = liste1.iterator();
        Iterator<String> iterator2 = liste2.iterator();

        while (iterator.hasNext()){
            liste3.add(iterator.next());
        }
        while (iterator2.hasNext()){
            liste3.add(iterator2.next());
        }

        System.out.println(liste3);
    }
}