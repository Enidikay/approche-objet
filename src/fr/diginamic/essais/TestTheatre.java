package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    static void main(String[] args) {
        Theatre theatre1 = new Theatre("Theatre de la rue",2,0,10.5);
        theatre1.inscrire(1,5.5);
        theatre1.inscrire(1,5.5);
        theatre1.inscrire(1,5.5);
        theatre1.inscrire(1,5.5);

        System.out.println(theatre1.getTotalClient());
        System.out.println(theatre1.getRecetteTotale());
    }
}
