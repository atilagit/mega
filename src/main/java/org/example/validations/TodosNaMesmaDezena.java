package org.example.validations;

import java.util.List;

public class TodosNaMesmaDezena {
    public static boolean validar(List<Integer> list) {
        int posicaoUltimoElemento = list.size()-1;
        if ((list.get(posicaoUltimoElemento) - list.get(0)) < 10){
            return true;
        }
        return false;
    }
}
