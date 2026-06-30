package fr.diginamic.fichiers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("src/fr/diginamic/fichiers/recensement.csv");

        List<String> lines = Files.readAllLines(path);
        List<String> centPremieres = lines.subList(0, 100);

        Path pathCible = Path.of("src/fr/diginamic/fichiers/monFichier.txt");
        Files.write(pathCible, centPremieres);
    }
}
