package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
    static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: "+premierCaractere);

        System.out.println("Longueur: "+chaine.length());

        int index = chaine.indexOf(";");
        String nom = chaine.substring(0, index);
        System.out.println("IndexOf:" + nom);

        System.out.println("Majuscule:" +chaine.toUpperCase());
        System.out.println("Minuscule:" +chaine.toLowerCase());

        String[] chaineSplit = chaine.split(";");
        for(int i = 0; i < chaineSplit.length; i++){
            System.out.println("Split "+ i +" "+chaineSplit[i]);
        }

        String salaireTexte = chaineSplit[2].replace(" ", "");
        double salaire3 = Double.parseDouble(salaireTexte);

        Salarie salarie1 = new Salarie(chaineSplit[0],chaineSplit[1],salaire3);
        System.out.println(salarie1);
    }

}
