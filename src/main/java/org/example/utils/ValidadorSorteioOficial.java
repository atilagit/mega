package org.example.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class ValidadorSorteioOficial {
    public static void execute() throws IOException {
        Map<String, List<Integer>> mapApostas = mapApostas();
        List<Integer> sorteados = getSorteados();
        getAndShowResultados(mapApostas, sorteados);
    }

    public static void getAndShowResultados(Map<String, List<Integer>> mapApostas, List<Integer> sorteados) {
        Map<String, Integer> resultados = new HashMap<>();
        Map<String, List<Integer>> acertosPorAposta = new HashMap<>();

        // Calcula os acertos para cada aposta
        for (Map.Entry<String, List<Integer>> entrada : mapApostas.entrySet()) {
            String chave = entrada.getKey();
            List<Integer> aposta = entrada.getValue();

            // Obtém os números acertados
            List<Integer> acertos = aposta.stream()
                    .filter(sorteados::contains)
                    .collect(Collectors.toList());

            resultados.put(chave, acertos.size());
            acertosPorAposta.put(chave, acertos);
        }

        // Ordena os resultados do maior para o menor número de acertos
        Map<String, Integer> resultadosOrdenados = resultados.entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())) // Ordem decrescente
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        LinkedHashMap::new // Garante a ordem de inserção
                ));

        // Imprime os resultados com os acertos
        resultadosOrdenados.forEach((chave, quantidadeAcertos) -> {
            List<Integer> acertos = acertosPorAposta.get(chave);
            System.out.println(chave + ", Acertos: " + quantidadeAcertos + ", Números: " + acertos);
        });
    }

    private static List<Integer> getSorteados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número sorteado separando por \" \": ");
        String resposta = scanner.nextLine();
        return Arrays.stream(resposta.split(" ")).map(Integer::valueOf).sorted().toList();
    }

    private static Map<String, List<Integer>> mapApostas() throws IOException {
        Map<String, List<Integer>> map = new HashMap<>();
        List<String> lines = Files.readAllLines(Paths.get("C:\\temp\\validação mega - Página1.csv"));
        for (String line : lines) {
            List<Integer> aposta = Arrays.stream(line.split(",")[0].split(" - ")).toList().stream()
                    .map(Integer::valueOf)
                    .sorted()
                    .toList();
            String apostador = line.split(",")[1];
            String idDaAposta = aposta + " " + apostador;
            //System.out.println(idDaAposta);
            map.put(idDaAposta, aposta);
        }
        return map;
    }
}