package org.example.validations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParImparTest {
    ParImpar parImpar = new ParImpar();

    @Test
    void deveRetornarTrueParaListasValidas() {
        // ARRANGE
        var list1 = List.of(1, 3, 33, 45, 57, 59); // todos impares
        var list2 = List.of(2, 5, 23, 35, 41, 55); // 5 impares
        var list3 = List.of(5, 13, 27, 30, 41, 55); // 5 impares

        // ACT
        boolean resultado1 = parImpar.validar(list1);
        boolean resultado2 = parImpar.validar(list2);
        boolean resultado3 = parImpar.validar(list3);

        // ASSERT
        assertTrue(resultado1, "A lista 'list1' deveria ser válida.");
        assertTrue(resultado2, "A lista 'list2' deveria ser válida.");
        assertTrue(resultado3, "A lista 'list3' deveria ser válida.");
    }

    @Test
    void deveRetornarFalseParaListasInvalidas() {
        // ARRANGE
        var list1 = List.of(1, 3, 5, 7, 10, 20); // 4 impares e 2 pares
        var list2 = List.of(1, 3, 5, 8, 10, 20); // 3 impares e 3 pares

        // ACT
        boolean resultado1 = parImpar.validar(list1);
        boolean resultado2 = parImpar.validar(list2);

        // ASSERT
        assertFalse(resultado1, "A lista 'list1' não deveria ser válida.");
        assertFalse(resultado2, "A lista 'list2' não deveria ser válida.");
    }
}