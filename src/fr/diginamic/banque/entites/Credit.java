package fr.diginamic.banque.entites;

public class Credit extends Operation{
    public Credit(String operationDate, int amountOpe) {
        super(operationDate, amountOpe);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
