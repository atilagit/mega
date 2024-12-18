package org.example.validations;

import java.util.List;

public class ParImpar implements Validavel {
    public boolean validar(List<Integer> list) {
        int contPar = 0; // Contador de números pares

        // Conta os números pares
        for (Integer numero : list) {
            if (numero % 2 == 0) {
                contPar++;
            }
        }

        int contImpar = list.size() - contPar; // Números ímpares = Total - Pares

        // Retorna verdadeiro se houver 5 ou mais pares ou 5 ou mais ímpares
        return contPar >= 5 || contImpar >= 5;
    }
}