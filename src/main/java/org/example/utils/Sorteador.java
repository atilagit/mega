package org.example.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Sorteador {
    public static void execute() {
        Path path = Paths.get("C:\\temp\\out.txt");

        try {
            List<String> combinacoesParaOSorteio = Files.readAllLines(path);
            System.out.println("Numero de opcoes viaveis: " + combinacoesParaOSorteio.size());

            Random random = new Random();
            int indiceSorteado = random.nextInt(combinacoesParaOSorteio.size());
            System.out.println("Indice sorteado: " + indiceSorteado);
            System.out.println("Combinação sorteada: " + combinacoesParaOSorteio.get(indiceSorteado));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}