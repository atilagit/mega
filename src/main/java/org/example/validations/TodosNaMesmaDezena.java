package org.example.validations;

import java.util.List;

public class TodosNaMesmaDezena implements Validavel {
    public boolean validar(List<Integer> list) {
        return (list.getLast() - list.getFirst()) < 10;
    }
}
