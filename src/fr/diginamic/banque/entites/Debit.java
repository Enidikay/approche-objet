package fr.diginamic.banque.entites;

public class Debit extends Operation{
    public Debit(String operationDate, int amountOpe) {
        super(operationDate, amountOpe);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}
