package fr.diginamic.maison;

public class Maison{
    private Piece[] pieces = new Piece[0];

    public Piece[] getPieces() {
        return pieces;
    }

    public void ajouterPiece(Piece piece) {
        if (piece == null){
            System.out.println("Merci d'entrer les informations requises");
            return;
        }

        Piece[] piece1 = new Piece[pieces.length + 1];

        for (int i = 0; i < pieces.length; i++) {
            piece1[i] = pieces[i];
        }

        piece1[pieces.length] = piece;

        pieces = piece1;
    }

    public double getSuperficieTotale(){
        double superficie = 0;

        for(int i = 0; i < pieces.length; i++){
            superficie += pieces[i].getSuperficie();
        }

        return superficie;
    }

    public double getSuperficieParEtage(int etage){
        double total = 0;

        for (Piece piece : pieces) {
            if (piece.getEtage() == etage) {
                total += piece.getSuperficie();
            }
        }

        return total;
    }

    public double getSuperficieParTypePiece(String type){
        double superficie = 0;

        for (Piece piece : pieces) {
            if (piece.getType() == type){
                superficie += piece.getSuperficie();
            }
        }
        return superficie;
    }

    public int getNbPiecesParTypePiece(String type){
        int NbPiece = 0;

        for (Piece piece : pieces) {
            if (piece.getType() == type){
                NbPiece++;
            }
        }
        return NbPiece;
    }


}
