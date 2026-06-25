package fr.diginamic.banque.entites;

public class TestOperation {

    public static void main(String[] args) {

        Debit debit1 = new Debit("10/5/2026", 500);
        Debit debit2 = new Debit("10/5/2026", 40);
        Credit credit1 = new Credit("15/5/2026", 600);
        Credit credit2 = new Credit("20/5/2026", 50);

        Operation[] ope1 = new Operation[4];
        ope1[0] = debit1;
        ope1[1] = debit2;
        ope1[2] = credit1;
        ope1[3] = credit2;

        int amount = 0;
        for (int i = 0; i < ope1.length; i++) {

            System.out.printf(
                    "Date : %s | Montant : %d | Type : %s%n",
                    ope1[i].getOperationDate(),
                    ope1[i].getAmountOpe(),
                    ope1[i].getType()
            );

            if (ope1[i].getType() == "CREDIT"){
                amount+=ope1[i].getAmountOpe();
            } else if (ope1[i].getType() == "DEBIT") {
                amount-=ope1[i].getAmountOpe();
            }
        }
        System.out.println("Argent restant :" + amount + "€");
    }
}