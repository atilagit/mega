package org.example.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlreadyExists {
    public static final List<List<Integer>> alreadExistList = getAlreadExistList();

    public static List<List<Integer>> getAlreadExistList() {
        try {
            String filePath = "C:\\temp\\in.csv"; // Caminho do arquivo
            List<List<Integer>> result = Files.lines(Paths.get(filePath))
                    .map(line -> Arrays.stream(line.split(","))
                            .skip(Math.max(0, line.split(",").length - 6)) // Pega apenas os últimos 6 valores
                            .map(String::trim) // Remove espaços extras
                            .map(Integer::parseInt) // Converte para Integer
                            .sorted() // Ordena os valores
                            .collect(Collectors.toList()))
                    .collect(Collectors.toList());

            return result;
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
