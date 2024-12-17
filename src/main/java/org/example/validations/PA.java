package org.example.validations;

import java.util.List;

public class PA {
    public static boolean validar(List<Integer> list) {
        return existePedacoDePA(list);
    }

    /**
     * Verifica se existe um "pedaço de PA" na lista.
     * Um pedaço de PA é formado por 3 a 6 elementos consecutivos com a mesma razão.
     *
     * @param lista Lista de 6 inteiros ordenados em ordem crescente.
     * @return true se existir algum pedaço de PA (3 a 6 elementos consecutivos), false caso contrário.
     */
    private static boolean existePedacoDePA(List<Integer> lista) {
        // A menor sequência que caracteriza uma PA é de tamanho 3
        for (int tamanho = 3; tamanho <= 6; tamanho++) { // Tamanhos possíveis: 3 a 6
            for (int inicio = 0; inicio <= lista.size() - tamanho; inicio++) { // Posição inicial do pedaço de PA
                if (verificarSubsequenciaPA(lista, inicio, tamanho)) {
                    return true; // Encontrou um pedaço de PA válido
                }
            }
        }
        return false; // Nenhum pedaço de PA encontrado
    }

    /**
     * Verifica se uma subsequência da lista, a partir de uma posição inicial e com determinado tamanho, forma uma PA.
     *
     * @param lista    Lista original.
     * @param inicio   Posição inicial da subsequência.
     * @param tamanho  Tamanho da subsequência a ser verificada.
     * @return true se a subsequência for uma PA, false caso contrário.
     */
    private static boolean verificarSubsequenciaPA(List<Integer> lista, int inicio, int tamanho) {
        int razao = lista.get(inicio + 1) - lista.get(inicio); // Calcula a razão inicial
        for (int i = inicio; i < inicio + tamanho - 1; i++) {
            if ((lista.get(i + 1) - lista.get(i)) != razao) {
                return false; // Quebrou a PA
            }
        }
        return true; // É uma PA
    }
}
