package org.example.validations;

import java.util.List;

public class Fibonacci implements Validavel {
    final static List<Integer> FIBONACCI = List.of(1, 2, 3, 5, 8, 13, 21, 34, 55);
    public boolean validar(List<Integer> list) {
        for (Integer integer : list) {
            if (!FIBONACCI.contains(integer)) {
                return false;
            }
        }
        return true;
    }
}
