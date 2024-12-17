package org.example.validations;

import java.util.List;

public class TodosNaMesmaDezena {
    public static boolean validar(List<Integer> list) {
        return (list.getLast() - list.getFirst()) < 10;
    }
}
