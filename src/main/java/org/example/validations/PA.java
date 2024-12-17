package org.example.validations;

import java.util.List;

public class PA {
    public static boolean validar(List<Integer> list) {
        int posicaoUltimoElemento = list.size()-1;
        long razao = list.get(1) - list.get(0);
        for(int i = 1; i <= (posicaoUltimoElemento - 1); i++) {
            if((list.get(i + 1) - list.get(i)) != razao) {
                return false;
            }
        }
        return true;
    }
}
