package fr.diginamic.maison;

public class SalleDeBain extends Piece{
    public SalleDeBain(int etage, double superficie) {
        super(etage, superficie);
    }

    @Override
    String getType() {
        return "SalleDeBain";
    }
}
