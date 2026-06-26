package fr.diginamic.maison;

public class WC extends Piece{

    public WC(int etage, double superficie) {
        super(etage, superficie);
    }

    @Override
    String getType() {
        return "WC";
    }


}
