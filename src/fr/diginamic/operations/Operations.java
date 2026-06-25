package fr.diginamic.operations;

public class Operations {
    public double calcul(double a, double b, char ope) {
        if (ope == '+') {
            return a + b;
        } else if (ope == '-') {
            return a - b;
        } else if (ope == '*') {
            return a * b;
        }else if (ope == '/') {
            return a / b;
        }
        return 0;
    }
}
