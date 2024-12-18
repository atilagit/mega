package org.example.utils;

import org.example.validations.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GeraArquivoDeCombinacoesViaveis {
    public static void execute(List<List<Integer>> todasCombinacoes) {
        Path outputPath = Paths.get("C:\\temp\\out.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
            // Processa as combinações e grava no arquivo linha a linha
            todasCombinacoes.stream()
                    .filter(x -> !new UmEmCadaDezena().validar(x))
                    .filter(x -> !new ParImpar().validar(x))
                    .filter(x -> !new TodosNaMesmaDezena().validar(x))
                    .filter(x -> !new PG().validar(x))
                    .filter(x -> !new PA().validar(x))
                    .filter(x -> !new Triangular().validar(x))
                    .filter(x -> !new Fibonacci().validar(x))
                    .filter(x -> !new TresPrimeirosEmPA().validar(x))
                    .forEach(combinacao -> {
                        try {
                            writer.write(combinacao.toString());
                            writer.newLine(); // Adiciona uma nova linha
                        } catch (IOException e) {
                            throw new RuntimeException(e.getMessage());
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Processamento concluído e arquivo gerado em: " + outputPath);
    }
}
