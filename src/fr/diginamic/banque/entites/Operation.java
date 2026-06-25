package fr.diginamic.banque.entites;

public abstract class Operation {
    private String operationDate;
    private int amountOpe;

    public Operation(String operationDate, int amountOpe) {
        this.operationDate = operationDate;
        this.amountOpe = amountOpe;
    }


    public abstract String getType();

    public String getOperationDate() {
        return operationDate;
    }

    public int getAmountOpe() {
        return amountOpe;
    }
}
