package org.example;

import org.example.utils.*;

import java.util.List;

public class Main {
    //private static final List<List<Integer>> alreadExistList = AlreadyExists.getAlreadExistList();
    //private static final List<List<Integer>> todasCombinacoes = TodasCombinacoes.execute();

    public static void main(String[] args) {
        //new Relatorios().relatorios(alreadExistList);
        //new Relatorios().relatorios(todasCombinacoes);

        //GeraArquivoDeCombinacoesViaveis.execute(todasCombinacoes, alreadExistList);
        Sorteador.execute();

    }
}