package org.example.validations;

import java.util.List;

public class ParImpar implements Validavel {
    public boolean validar(List<Integer> list) {
        if (list == null || list.isEmpty()) return false; // Valida lista nula ou vazia

        boolean primeiroPar = list.getFirst() % 2 == 0; // Verifica se o primeiro elemento é par

        for (Integer numero : list) {
            if ((numero % 2 == 0) != primeiroPar) {
                return false; // Se houver mistura, retorna falso imediatamente
            }
        }
        return true; // Todos os números são pares ou todos são ímpares
    }
}