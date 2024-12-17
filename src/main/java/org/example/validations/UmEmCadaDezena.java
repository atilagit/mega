package org.example.validations;

import java.util.List;

public class UmEmCadaDezena {
    public static boolean validar(List<Integer> list) {
        return ((list.get(0) <=10)
                &&
                ((list.get(1)>=11) && (list.get(1)<=20))
                &&
                ((list.get(2)>=21) && (list.get(2)<=30))
                &&
                ((list.get(3)>=31) && (list.get(3)<=40))
                &&
                ((list.get(4)>=41) && (list.get(4)<=50))
                &&
                ((list.get(5)>=51) && (list.get(5)<=60)));
    }
}
