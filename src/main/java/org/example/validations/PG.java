package org.example.validations;

import java.util.List;

public class PG implements Validavel {
    public boolean validar(List<Integer> list) {
        int posicaoUltimoElemento = list.size()-1;
        double razao = (double)list.get(1) / (double)list.get(0);
        for(int i = 1; i <= (posicaoUltimoElemento - 1); i++) {
            if(((double)list.get(i + 1) / (double)list.get(i)) != razao) {
                return false;
            }
        }
        return true;
    }
}
