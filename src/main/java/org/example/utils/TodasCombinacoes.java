package org.example.utils;

import java.util.ArrayList;
import java.util.List;

public class TodasCombinacoes {

    public static List<List<Integer>> execute() {
        List<List<Integer>> listCompleto = new ArrayList<>();

        for (int i = 1; i<=55; i++){
            List<Integer> list = new ArrayList<>();
            list.add(i);
            for (int j = i+1; j<=56; j++){
                list.add(j);
                for (int k = j+1; k<=57; k++){
                    list.add(k);
                    for (int l = k+1; l<=58; l++){
                        list.add(l);
                        for (int m = l+1; m<=59; m++){
                            list.add(m);
                            for (int n = m+1; n<=60; n++){
                                list.add(n);
                                listCompleto.add(new ArrayList<>(list));
                                list.removeLast();
                            }
                            list.removeLast();
                        }
                        list.removeLast();
                    }
                    list.removeLast();
                }
                list.removeLast();
            }
        }
        return listCompleto;
    }
}