package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

    public static void main(String[] args) {

        Operations operations = new Operations();

        System.out.println("Addition : " + operations.calcul(10, 5, '+'));
        System.out.println("Soustraction : " + operations.calcul(10, 5, '-'));
        System.out.println("Multiplication : " + operations.calcul(10, 5, '*'));
        System.out.println("Division : " + operations.calcul(10, 5, '/'));
    }
}