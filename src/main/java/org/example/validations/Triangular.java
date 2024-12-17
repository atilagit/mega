package org.example.validations;

import java.util.List;

public class Triangular implements Validavel {
    // Lista com os 10 primeiros números triangulares
    private static final List<Integer> TRIANGULARES = List.of(1, 3, 6, 10, 15, 21, 28, 36, 45, 55);

    /**
     * Verifica se todos os elementos da lista são números triangulares.
     *
     * @param list Lista de inteiros a ser validada.
     * @return true se todos os números da lista são triangulares, false caso contrário.
     */
    public boolean validar(List<Integer> list) {
        for (Integer numero : list) {
            if (!TRIANGULARES.contains(numero)) {
                return false;
            }
        }
        return true;
    }
}

