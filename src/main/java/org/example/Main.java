package org.example;

import org.example.utils.ValidadorSorteioOficial;

import java.io.IOException;

public class Main {
    //private static final List<List<Integer>> alreadExistList = AlreadyExists.getAlreadExistList();
    //private static final List<List<Integer>> todasCombinacoes = TodasCombinacoes.execute();

    public static void main(String[] args) throws IOException {
        //new Relatorios().relatorios(alreadExistList);
        //new Relatorios().relatorios(todasCombinacoes);

        //GeraArquivoDeCombinacoesViaveis.execute(todasCombinacoes, alreadExistList);
        //Sorteador.execute();
        ValidadorSorteioOficial.execute();
    }


}