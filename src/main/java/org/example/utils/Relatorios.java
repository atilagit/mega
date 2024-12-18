package org.example.utils;

import org.example.validations.*;

import java.util.List;

public class Relatorios {
    public void relatorios(List<List<Integer>> combinacoes){
        gerarRelatorio(new Fibonacci(), combinacoes);
        gerarRelatorio(new ParImpar(), combinacoes);
        gerarRelatorio(new PA(), combinacoes);
        gerarRelatorio(new PG(), combinacoes);
        gerarRelatorio(new TodosNaMesmaDezena(), combinacoes);
        gerarRelatorio(new Triangular(), combinacoes);
        gerarRelatorio(new UmEmCadaDezena(), combinacoes);
        gerarRelatorio(new TresPrimeirosEmPA(), combinacoes);
    }

    private static void gerarRelatorio(Validavel validador, List<List<Integer>> combinacoes) {
        System.out.println("--------------- " + validador.getClass().getSimpleName() + " Validation ---------------");

        long total = combinacoes.stream()
                .filter(validador::validar)
                //.peek(combinacao -> System.out.println("number to be removed: " + combinacao))
                .count();

        double percentual = (((double) total) / combinacoes.size()) * 100;
        System.out.println("Remove " + total + " de " + combinacoes.size() + " combinacoes");
        System.out.println("percentual: " + String.format("%.2f", percentual) + "%");
        System.out.println("--------------- " + validador.getClass().getSimpleName() + " Validation ---------------\n");
    }
}
