package fr.diginamic.fichiers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

    public static void main(String[] args) throws IOException {
        // lecture du fichier
        Path path = Path.of("src/fr/diginamic/fichiers/recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        // création des objets villes à partir du csv
        List<Ville> villes = new ArrayList<>();

        for (int i = 1; i < lines.size(); i++) {
            String[] cols = lines.get(i).split(";");
            Ville ville = new Ville(cols[6], cols[2], cols[1], Integer.parseInt(cols[9].replace(" ", "")));
            villes.add(ville);

        }

        // création du fichier csv contenant les villes qui ont + de 25k habitants
        List<String> fichierVille = new ArrayList<>();
        fichierVille.add("NomVille ; CodeDepartement ; NomRegion ; PopulationTotale");

        for (Ville v : villes) {
            if (v.getPopuTotale() >= 25000) {
                fichierVille.add(v.toCsv());
            }
        }

        Files.write(Path.of("src/fr/diginamic/fichiers/villes.csv"), fichierVille);
    }
}