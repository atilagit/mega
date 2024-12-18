package org.example.validations;

import java.util.List;

public class TresPrimeirosEmPA implements Validavel {
    public boolean validar(List<Integer> list) {
        return (list.get(1) - list.getFirst()) == (list.get(2) - list.get(1));
    }
}